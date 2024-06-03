package com.furqonajiy.restcountries.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.adapter.RestCountriesAdapter;
import com.furqonajiy.restcountries.api.service.ICountriesService;
import com.furqonajiy.restcountries.api.service.IPopulatedCountriesService;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountryDensity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PopulatedCountriesServiceImpl implements ICountriesService<Object, List<CountryDensity>>, IPopulatedCountriesService {
    @Autowired
    private RestCountriesAdapter restCountriesAdapter;

    @Autowired
    @Qualifier("restCountriesObjectMapper")
    private ObjectMapper objectMapper;

    @Override
    public List<CountryDensity> process(Object empty) throws JsonProcessingException {
        log.debug("Process Get Most Populated Countries");

        List<RestCountriesResponse> restCountriesResponses = restCountriesAdapter.allCountries();
        List<CountryDensity> countryDensities = constructListCountry(restCountriesResponses);
        List<CountryDensity> sortedCountryDensities = sortListCountry(countryDensities);

        return sortedCountryDensities;
    }

    @Override
    public List<CountryDensity> constructListCountry(List<RestCountriesResponse> restCountriesResponses) {
        log.debug("Construct List<CountryDensity>");

        List<CountryDensity> countryDensities = new ArrayList<>();
        for (RestCountriesResponse restCountriesRs : restCountriesResponses) {
            CountryDensity countryDensity = new CountryDensity();
            countryDensity.setName(restCountriesRs.getName().getCommon());
            countryDensity.setArea(restCountriesRs.getArea());
            countryDensity.setPopulation(restCountriesRs.getPopulation());
            countryDensity.setPopulationDensity(restCountriesRs.getPopulation() / restCountriesRs.getArea());
            countryDensities.add(countryDensity);
        }

        return countryDensities;
    }

    @Override
    public List<CountryDensity> sortListCountry(List<CountryDensity> countryDensities) {
        log.debug("Sort List<CountryDensity>");

        List<CountryDensity> sortedCountryDensities = countryDensities.stream()
                .sorted((r1, r2) -> Double.compare(r2.getPopulationDensity(), r1.getPopulationDensity())) // Sort in descending order
                .collect(Collectors.toList());

        return sortedCountryDensities;
    }
}
