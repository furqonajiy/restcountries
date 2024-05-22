package com.furqonajiy.restcountries.api.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Slf4j
@Component
public class RestCountriesAdapter {
    @Value("${restcountries.scheme}")
    private String scheme;
    @Value("${restcountries.host}")
    private String host;
    @Value("${restcountries.port}")
    private int port;
    @Value("${restcountries.path.all}")
    private String pathAll;
    @Value("${restcountries.path.region}")
    private String pathRegion;

    @Autowired
    @Qualifier("restCountriesRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public List<RestCountriesResponse> allCountries() throws JsonProcessingException {
        log.debug("Invoke Rest Countries - All Countries");

        try {
            String uriString = UriComponentsBuilder.newInstance()
                    .scheme(scheme)
                    .host(host)
                    .port(port)
                    .path(pathAll)
                    .toUriString();

            List<RestCountriesResponse> backendResponse = restTemplate.exchange(uriString, HttpMethod.GET, null, new ParameterizedTypeReference<List<RestCountriesResponse>>(){}).getBody();
            log.debug("Rest Countries Backend Response: {}", objectMapper.writeValueAsString(backendResponse));

            return backendResponse;
        } catch (Exception e) {
            log.debug("Exception occurs.", e);
            throw e;
        }
    }

    public List<RestCountriesResponse> getRegion(String region) throws JsonProcessingException {
        log.debug("Invoke Rest Countries - Region: {}", region);

        try {
            String uriString = UriComponentsBuilder.newInstance()
                    .scheme(scheme)
                    .host(host)
                    .port(port)
                    .path(pathRegion.replace("{region}", region))
                    .toUriString();

            List<RestCountriesResponse> backendResponse = restTemplate.exchange(uriString, HttpMethod.GET, null, new ParameterizedTypeReference<List<RestCountriesResponse>>(){}).getBody();
            log.debug("Countries from Region {}: {}", region, objectMapper.writeValueAsString(backendResponse));

            return backendResponse;
        } catch (Exception e) {
            log.debug("Exception occurs.", e);
            throw e;
        }
    }
}
