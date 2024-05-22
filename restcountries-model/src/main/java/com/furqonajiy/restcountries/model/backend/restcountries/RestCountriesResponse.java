package com.furqonajiy.restcountries.model.backend.restcountries;

import lombok.Data;

import java.util.List;

@Data
public class RestCountriesResponse {
    private List<Country> countriesList;
}
