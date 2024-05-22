package com.furqonajiy.restcountries.model.backend.restcountries;

import lombok.Data;

@Data
public class RestCountriesResponse {
    private Name name;
    private Integer area;
    private Integer population;
}
