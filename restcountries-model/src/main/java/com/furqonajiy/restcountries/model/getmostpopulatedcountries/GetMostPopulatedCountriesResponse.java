package com.furqonajiy.restcountries.model.getmostpopulatedcountries;

import lombok.Data;

import java.util.List;

@Data
public class GetMostPopulatedCountriesResponse {
    private String statusCode;
    private String statusDesc;

    private List<CountrySummary> countries;
}
