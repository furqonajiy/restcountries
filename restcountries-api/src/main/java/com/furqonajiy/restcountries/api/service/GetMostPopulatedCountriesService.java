package com.furqonajiy.restcountries.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.furqonajiy.restcountries.api.adapter.RestCountriesAdapter;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountrySummary;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GetMostPopulatedCountriesService {
    @Autowired
    private RestCountriesAdapter restCountriesAdapter;

    public List<CountrySummary> process() throws JsonProcessingException {
        log.debug("Process Get Most Populated Countries");

        List<RestCountriesResponse> restCountriesResponseList = restCountriesAdapter.allCountries();

        // Construct Raw Most Populated Response
        List<CountrySummary> countrySummaryResponseList = new ArrayList<>();
        for (RestCountriesResponse restCountriesRs : restCountriesResponseList) {
            CountrySummary countrySummary = new CountrySummary();
            countrySummary.setName(restCountriesRs.getName().getCommon());
            countrySummary.setArea(restCountriesRs.getArea());
            countrySummary.setPopulation(restCountriesRs.getPopulation());
            countrySummary.setPopulationDensity((double) restCountriesRs.getPopulation() / restCountriesRs.getArea());
            countrySummaryResponseList.add(countrySummary);
        }

        // Sort by population density
        List<CountrySummary> sortedResponseList = countrySummaryResponseList.stream()
                .sorted((r1, r2) -> Double.compare(r2.getPopulationDensity(), r1.getPopulationDensity())) // Sort in descending order
                .collect(Collectors.toList());

        return sortedResponseList;
    }
}
