package com.furqonajiy.restcountries.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;

import java.util.List;

public interface ICountriesService<Rq, Rs> {
    Rs process(Rq input) throws JsonProcessingException;
    Rs constructListCountry(List<RestCountriesResponse> restCountriesResponses);
    Rs sortListCountry(Rs input);
}
