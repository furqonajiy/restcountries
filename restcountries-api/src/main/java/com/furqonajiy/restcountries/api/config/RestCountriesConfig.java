package com.furqonajiy.restcountries.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
public class RestCountriesConfig {
    @Value("${restcountries.scheme}")
    private String scheme;

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

    @Value("${restcountries.http.use-cert}")
    private boolean useCertificate;
    @Value("${restcountries.http.verify-hostname}")
    private boolean verifyHostname;

    @Value("${restcountries.cert.name}")
    private String certificateName;
    @Value("${restcountries.cert.pass}")
    private String certificatePass;

    @Autowired
    private ResourceLoader resourceLoader;

    @Bean("restCountriesHttpRequestFactory")
    public ClientHttpRequestFactory httpRequestFactory() throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {

        String certPath = certificateName;
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

        if ("HTTPS".equalsIgnoreCase(scheme)) {
            if (useCertificate) {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(resourceLoader.getResource(certPath).getInputStream(), certificatePass.toCharArray());
                SSLContextBuilder sslContextBuilder = SSLContextBuilder
                        .create()
                        .loadTrustMaterial(keyStore, null);
                httpClientBuilder.setSSLContext(sslContextBuilder.build());
            } else {
                SSLContextBuilder sslContextBuilder = SSLContextBuilder
                        .create()
                        .loadTrustMaterial(new TrustAllStrategy());
                httpClientBuilder.setSSLContext(sslContextBuilder.build());
            }

            if (!verifyHostname) {
                httpClientBuilder.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
            }
        }
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
    public RestTemplate restTemplate(@Qualifier("restCountriesHttpRequestFactory") ClientHttpRequestFactory clientHttpRequestFactory, ObjectMapper objectMapper) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(clientHttpRequestFactory);
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter(objectMapper);

        List<HttpMessageConverter<?>> messageConverterList = new ArrayList<>();
        messageConverterList.add(messageConverter);

        restTemplate.setMessageConverters(messageConverterList);
        return restTemplate;
    }
}
