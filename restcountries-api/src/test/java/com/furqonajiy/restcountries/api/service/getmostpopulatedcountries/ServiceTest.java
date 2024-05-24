package com.furqonajiy.restcountries.api.service.getmostpopulatedcountries;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.service.GetMostPopulatedCountriesService;
import com.furqonajiy.restcountries.api.utility.ObjectMapperConfig;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountryDensity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
@SpringBootTest(classes = {ObjectMapperConfig.class})
class ServiceTest {
    @InjectMocks
    GetMostPopulatedCountriesService getMostPopulatedCountriesService;

    @Mock(name = "restCountriesObjectMapper")
    ObjectMapper objectMapper;

    @BeforeEach
    void initializeMock() {
        objectMapper = new ObjectMapperConfig().objectMapper();
    }

    @Test
    @DisplayName("constructListCountryDensity()")
    void constructListCountryDensity() throws JsonProcessingException {
        List<RestCountriesResponse> restCountriesRsAllCountry = TestData.restCountriesRsAllCountry();
        List<CountryDensity> countryDensitiesRs = getMostPopulatedCountriesService.constructListCountryDensity(restCountriesRsAllCountry);

        assert Objects.equals(objectMapper.writeValueAsString(countryDensitiesRs), objectMapper.writeValueAsString(TestData.countryDensitiesRs()));
    }

    @Test
    @DisplayName("sortListCountryDensity()")
    void sortListCountryDensity() throws JsonProcessingException {
        List<CountryDensity> countryDensitiesRs = TestData.countryDensitiesRs();
        List<CountryDensity> sortedCountryDensitiesRs = getMostPopulatedCountriesService.sortListCountryDensity(countryDensitiesRs);
        assert Objects.equals(objectMapper.writeValueAsString(sortedCountryDensitiesRs), objectMapper.writeValueAsString(TestData.sortedCountryDensitiesRs()));
    }
}
