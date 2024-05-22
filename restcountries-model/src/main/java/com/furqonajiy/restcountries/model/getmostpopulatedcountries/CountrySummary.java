package com.furqonajiy.restcountries.model.getmostpopulatedcountries;

import lombok.Data;

@Data
public class CountrySummary {
    private String name;
    private double area;
    private int population;
    private double populationDensity;
}
