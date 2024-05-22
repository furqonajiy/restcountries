package com.furqonajiy.restcountries.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.furqonajiy.restcountries.api.adapter.RestCountriesAdapter;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountryDensity;
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

    public List<CountryDensity> process() throws JsonProcessingException {
        log.debug("Process Get Most Populated Countries");

        List<RestCountriesResponse> restCountriesResponseList = restCountriesAdapter.allCountries();

        // Construct Raw Most Populated Response
        List<CountryDensity> countryDensities = new ArrayList<>();
        for (RestCountriesResponse restCountriesRs : restCountriesResponseList) {
            CountryDensity countryDensity = new CountryDensity();
            countryDensity.setName(restCountriesRs.getName().getCommon());
            countryDensity.setArea(restCountriesRs.getArea());
            countryDensity.setPopulation(restCountriesRs.getPopulation());
            countryDensity.setPopulationDensity(restCountriesRs.getPopulation() / restCountriesRs.getArea());
            countryDensities.add(countryDensity);
        }

        // Sort by population density
        List<CountryDensity> sortedCountryDensities = countryDensities.stream()
                .sorted((r1, r2) -> Double.compare(r2.getPopulationDensity(), r1.getPopulationDensity())) // Sort in descending order
                .collect(Collectors.toList());

        return sortedCountryDensities;
    }
}
