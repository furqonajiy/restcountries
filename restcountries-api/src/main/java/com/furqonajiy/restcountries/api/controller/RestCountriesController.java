package com.furqonajiy.restcountries.api.controller;

import com.furqonajiy.restcountries.api.exception.ServiceUnavailableException;
import com.furqonajiy.restcountries.api.logging.ErrorLog;
import com.furqonajiy.restcountries.api.logging.TransactionLog;
import com.furqonajiy.restcountries.api.service.GetMostBorderedCountriesService;
import com.furqonajiy.restcountries.api.service.GetMostPopulatedCountriesService;
import com.furqonajiy.restcountries.api.utility.SplunkLogger;
import com.furqonajiy.restcountries.model.getmostborderingcountries.CountryBorder;
import com.furqonajiy.restcountries.model.getmostborderingcountries.GetMostBorderingCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountryDensity;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.GetMostPopulatedCountriesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.List;

@RestController
@Slf4j
public class RestCountriesController {
    @Autowired
    private GetMostPopulatedCountriesService getMostPopulatedCountriesService;

    @Autowired
    private GetMostBorderedCountriesService getMostBorderedCountriesService;

    @Autowired
    private SplunkLogger splunkLogger;

    @GetMapping(value = "rc/v1/country/population", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GetMostPopulatedCountriesResponse> getMostPopulatedCountries() {
        log.debug("Receive Get Most Populated Countries");

        long startMillis = System.currentTimeMillis();

        GetMostPopulatedCountriesResponse response = new GetMostPopulatedCountriesResponse();
        try {
            response.setStatusCode("00000");
            response.setStatusDesc("Success");

            List<CountryDensity> countryDensityList = getMostPopulatedCountriesService.process();
            response.setCountries(countryDensityList);

            splunkLogger.info(new TransactionLog(
                    startMillis,
                    HttpStatus.OK.value(),
                    null,
                    response)
            );
            return ResponseEntity.ok(response);
        } catch (ServiceUnavailableException e) {
            response.setStatusCode(e.getStatusCode());
            response.setStatusDesc(e.getStatusDesc());

            splunkLogger.error(new ErrorLog(
                    startMillis,
                    HttpStatus.SERVICE_UNAVAILABLE.value(),
                    response.getStatusCode(),
                    response.getStatusDesc(),
                    null,
                    response,
                    e)
            );
            return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (Exception e) {
            response.setStatusCode("99999");
            response.setStatusDesc("Failed to Get Most Populated Countries");

            splunkLogger.error(new ErrorLog(
                    startMillis,
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    response.getStatusCode(),
                    response.getStatusDesc(),
                    null,
                    response,
                    e)
            );
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "rc/v1/country/{region}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GetMostBorderingCountriesResponse> getMostBorderingCountries(
            @PathVariable(value = "region") String region
    ) {
        log.debug("Receive Get Most Bordering Country in {}", region);

        long startMillis = System.currentTimeMillis();

        GetMostBorderingCountriesResponse response = new GetMostBorderingCountriesResponse();
        try {
            response.setStatusCode("00000");
            response.setStatusDesc("Success");

            List<CountryBorder> countryBorderList = getMostBorderedCountriesService.process(region);
            response.setCountries(countryBorderList);

            splunkLogger.info(new TransactionLog(
                    startMillis,
                    HttpStatus.OK.value(),
                    region,
                    response)
            );
            return ResponseEntity.ok(response);
        } catch (ServiceUnavailableException e) {
            response.setStatusCode(e.getStatusCode());
            response.setStatusDesc(e.getStatusDesc());

            splunkLogger.error(new ErrorLog(
                    startMillis,
                    HttpStatus.SERVICE_UNAVAILABLE.value(),
                    response.getStatusCode(),
                    response.getStatusDesc(),
                    region,
                    response,
                    e)
            );
            return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
        } catch (Exception e) {
            log.debug("Exception occurs.", e);

            response.setStatusCode("99999");
            String statusDesc = MessageFormat.format("Failed to Get Most Bordered Countries in {0}", region);
            response.setStatusDesc(statusDesc);

            splunkLogger.error(new ErrorLog(
                    startMillis,
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    response.getStatusCode(),
                    response.getStatusDesc(),
                    region,
                    response,
                    e)
            );
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
