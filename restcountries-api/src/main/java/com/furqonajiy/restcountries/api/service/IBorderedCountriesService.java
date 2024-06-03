package com.furqonajiy.restcountries.api.service;

import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;

import java.util.List;

public interface IBorderedCountriesService {
    boolean checkCca3Region(String cca3, List<RestCountriesResponse> restCountriesResponses);
}
