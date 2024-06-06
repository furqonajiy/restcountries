package com.furqonajiy.restcountries.api.controller;

import com.furqonajiy.restcountries.api.exception.ServiceUnavailableException;
import com.furqonajiy.restcountries.api.logging.ErrorLog;
import com.furqonajiy.restcountries.api.logging.TransactionLog;
import com.furqonajiy.restcountries.api.service.impl.BorderedCountriesServiceImpl;
import com.furqonajiy.restcountries.api.service.impl.PopulatedCountriesServiceImpl;
import com.furqonajiy.restcountries.api.utility.SplunkLogger;
import com.furqonajiy.restcountries.model.dto.Response;
import com.furqonajiy.restcountries.model.dto.borderedcountries.CountryBorder;
import com.furqonajiy.restcountries.model.dto.populatedcountries.CountryDensity;
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
    private PopulatedCountriesServiceImpl populatedCountriesService;

    @Autowired
    private BorderedCountriesServiceImpl borderedCountriesService;

    @Autowired
    private SplunkLogger splunkLogger;

    @GetMapping(value = "rc/v1/country/population", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<List<CountryDensity>>> getMostPopulatedCountries() {
        log.debug("Receive Get Most Populated Countries");

        long startMillis = System.currentTimeMillis();

        Response<List<CountryDensity>> response = new Response<>();
        try {
            response.setStatusCode("00000");
            response.setStatusDesc("Success");

            List<CountryDensity> countryDensityList = populatedCountriesService.process(null);
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

    @GetMapping(value = "rc/v1/country/border/{region}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<List<CountryBorder>>> getMostBorderingCountries(
            @PathVariable(value = "region") String region
    ) {
        log.debug("Receive Get Most Bordering Country in {}", region);

        long startMillis = System.currentTimeMillis();

        Response<List<CountryBorder>> response = new Response<>();
        try {
            response.setStatusCode("00000");
            response.setStatusDesc("Success");

            List<CountryBorder> countryBorderList = borderedCountriesService.process(region);
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
