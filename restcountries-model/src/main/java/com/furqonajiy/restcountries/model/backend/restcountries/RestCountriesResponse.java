package com.furqonajiy.restcountries.model.backend.restcountries;

import lombok.Data;

import java.util.List;

@Data
public class RestCountriesResponse {
    private Name name;
    private String cca3;

    private double area;
    private int population;

    private String region;
    private List<String> borders;
}
