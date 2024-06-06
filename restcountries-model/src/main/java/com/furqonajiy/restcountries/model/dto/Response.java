package com.furqonajiy.restcountries.model.dto;

import lombok.Data;

@Data
public class Response<T> {
    private String statusCode;
    private String statusDesc;
    private T countries;
}
