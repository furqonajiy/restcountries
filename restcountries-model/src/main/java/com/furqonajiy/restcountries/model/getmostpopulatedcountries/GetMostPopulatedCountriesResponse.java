package com.furqonajiy.restcountries.model.getmostpopulatedcountries;

import lombok.Data;

@Data
public class GetMostPopulatedCountriesResponse {
    private String name;
    private double area;
    private int population;
    private double populationDensity;
}
