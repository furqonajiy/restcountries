package com.furqonajiy.restcountries.model.backend.restcountries;

import lombok.Data;

@Data
public class RestCountriesResponse {
    private Name name;
    private double area;
    private int population;
}
