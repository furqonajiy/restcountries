package com.furqonajiy.restcountries.api.controller;

import com.furqonajiy.restcountries.api.service.GetMostPopulatedCountriesService;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesRequest;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class RestCountriesController {
    @Autowired
    private GetMostPopulatedCountriesService getMostPopulatedCountriesService;

    @GetMapping(value = "rc/v1/country/population", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GetMostPopulatedCountriesResponse>> getMostPopulatedCountries(
            @RequestParam(name = "transaction_id", required = false) String transactionId,
            @RequestParam(name = "channel", required = false) String channel
    ) {
        log.debug("Receive Get Most Populated Countries");

        GetMostPopulatedCountriesRequest request = new GetMostPopulatedCountriesRequest();
        request.setTransactionId(transactionId);
        request.setChannel(channel);

        List<GetMostPopulatedCountriesResponse> response = null;
        try {
            response = getMostPopulatedCountriesService.process(request);
        } catch (Exception e) {

        }

        return ResponseEntity.ok(response);
    }
}
