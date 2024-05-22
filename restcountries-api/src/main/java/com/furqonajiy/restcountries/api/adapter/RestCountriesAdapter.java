package com.furqonajiy.restcountries.api.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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

    @Autowired
    @Qualifier("restCountriesRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public RestCountriesResponse allCountries() {
        try {
            String uriString = UriComponentsBuilder.newInstance()
                    .scheme(scheme)
                    .host(host)
                    .port(port)
                    .path(pathAll)
                    .toUriString();

            RestCountriesResponse backendResponse = restTemplate.exchange(uriString, HttpMethod.GET, null, RestCountriesResponse.class).getBody();
            log.debug("Response: {}", objectMapper.writeValueAsString(backendResponse));

            return backendResponse;
        } catch (HttpStatusCodeException e) {
            log.debug("HttpStatusCodeException occurs.", e);
            return null;
        } catch (ResourceAccessException e) {
            log.debug("ResourceAccessException occurs.", e);
            return null;
        } catch (Exception e) {
            log.debug("Exception occurs.", e);
            return null;
        }
    }
}
