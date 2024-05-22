package com.furqonajiy.restcountries.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
public class RestCountriesConfig {
    @Value("${restcountries.http.connect-timeout-ms}")
    private int connectTimeoutMillis;
    @Value("${restcountries.http.socket-timeout-ms}")
    private int socketTimeoutMillis;
    @Value("${restcountries.http.max-connection}")
    private int maxConnection;
    @Value("${restcountries.http.max-connection-per-host}")
    private int maxConnectionHost;
    @Value("${restcountries.http.max-idle-time-ms}")
    private long idleTimeMillis;

    @Bean("restCountriesHttpClientFactory")
    public ClientHttpRequestFactory restCountriesHttpClientFactory() {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

        httpClientBuilder
                .setMaxConnTotal(maxConnection)
                .setMaxConnPerRoute(maxConnectionHost)
                .evictIdleConnections(idleTimeMillis, TimeUnit.MILLISECONDS);

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClientBuilder.build());
        clientHttpRequestFactory.setConnectTimeout(connectTimeoutMillis);
        clientHttpRequestFactory.setReadTimeout(socketTimeoutMillis);

        return clientHttpRequestFactory;
    }

    @Bean("restCountriesRestTemplate")
    public RestTemplate restTemplate(@Qualifier("restCountriesHttpClientFactory") ClientHttpRequestFactory clientHttpRequestFactory, ObjectMapper objectMapper) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(clientHttpRequestFactory);
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter(objectMapper);

        List<HttpMessageConverter<?>> messageConverterList = new ArrayList<>();
        messageConverterList.add(messageConverter);

        restTemplate.setMessageConverters(messageConverterList);

        return restTemplate;
    }
}
