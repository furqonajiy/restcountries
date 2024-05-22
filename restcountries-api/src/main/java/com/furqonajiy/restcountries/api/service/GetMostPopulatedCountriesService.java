package com.furqonajiy.restcountries.api.service;

import com.furqonajiy.restcountries.api.adapter.RestCountriesAdapter;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesRequest;
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

    public List<GetMostPopulatedCountriesResponse> process(GetMostPopulatedCountriesRequest request) {
        log.debug("Process Get Most Populated Countries");

        List<RestCountriesResponse> restCountriesResponseList = restCountriesAdapter.allCountries();

        // Construct Raw Most Populated Response
        List<GetMostPopulatedCountriesResponse> rawResponseList = new ArrayList<>();
        for (RestCountriesResponse restCountriesRs : restCountriesResponseList) {
            GetMostPopulatedCountriesResponse rawResponse = new GetMostPopulatedCountriesResponse();
            rawResponse.setName(restCountriesRs.getName().getCommon());
            rawResponse.setArea(restCountriesRs.getArea());
            rawResponse.setPopulation(restCountriesRs.getPopulation());
            rawResponse.setPopulationDensity((double) restCountriesRs.getPopulation() / restCountriesRs.getArea());
            rawResponseList.add(rawResponse);
        }

        // Sort by population density
        List<GetMostPopulatedCountriesResponse> sortedResponseList = rawResponseList.stream()
                .sorted((r1, r2) -> Double.compare(r2.getPopulationDensity(), r1.getPopulationDensity())) // Sort in descending order
                .collect(Collectors.toList());

        return sortedResponseList;
    }
}
