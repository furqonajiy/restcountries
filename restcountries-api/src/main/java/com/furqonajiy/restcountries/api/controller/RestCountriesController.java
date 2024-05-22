package com.furqonajiy.restcountries.api.controller;

import com.furqonajiy.restcountries.api.service.GetMostPopulatedCountriesService;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountrySummary;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class RestCountriesController {
    @Autowired
    private GetMostPopulatedCountriesService getMostPopulatedCountriesService;

    @GetMapping(value = "rc/v1/country/population", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GetMostPopulatedCountriesResponse> getMostPopulatedCountries() {
        log.debug("Receive Get Most Populated Countries");

        GetMostPopulatedCountriesResponse response = new GetMostPopulatedCountriesResponse();
        try {
            response.setStatusCode("00000");
            response.setStatusDesc("Success");

            List<CountrySummary> countrySummaryList = getMostPopulatedCountriesService.process();
            response.setCountries(countrySummaryList);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.setStatusCode("99999");
            response.setStatusDesc("Failed to Get Most Populated Countries");

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
