package com.furqonajiy.restcountries.model.getmostborderingcountries;

import lombok.Data;

import java.util.List;

@Data
public class GetMostBorderingCountriesResponse {
    private String statusCode;
    private String statusDesc;

    private List<CountryBorder> countries;
}
