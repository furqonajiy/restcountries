package com.furqonajiy.restcountries.model.dto.restcountries;

import lombok.Data;

import java.util.List;

@Data
public class RestCountriesResponse {
    private Name name;
    private String cca3;

    private double area;
    private int population;

    private List<String> borders;
}
