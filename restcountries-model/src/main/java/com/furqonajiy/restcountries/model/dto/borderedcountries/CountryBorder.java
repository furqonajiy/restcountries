package com.furqonajiy.restcountries.model.dto.borderedcountries;

import lombok.Data;

import java.util.List;

@Data
public class CountryBorder {
    private String name;
    private List<String> borders;
    private int numberOfBorders;
    private List<String> bordersDifferentRegion;
    private int numberOfBordersDifferentRegion;
}
