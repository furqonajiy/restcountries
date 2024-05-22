package com.furqonajiy.restcountries.api.service;

import com.furqonajiy.restcountries.api.adapter.RestCountriesAdapter;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetMostPopulatedCountriesService {
    @Autowired
    private RestCountriesAdapter restCountriesAdapter;

    public Object process(GetMostPopulatedCountriesRequest request) {
        log.debug("Process Get Most Populated Countries");

        restCountriesAdapter.allCountries();

        return null;
    }
}
