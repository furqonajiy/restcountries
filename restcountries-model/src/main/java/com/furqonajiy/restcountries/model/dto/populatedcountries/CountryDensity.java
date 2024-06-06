package com.furqonajiy.restcountries.model.dto.populatedcountries;

import lombok.Data;

@Data
public class CountryDensity {
    private String name;
    private double area;
    private int population;
    private double populationDensity;
}
