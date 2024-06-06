package com.furqonajiy.restcountries.api.service.getmostpopulatedcountries;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.service.impl.PopulatedCountriesServiceImpl;
import com.furqonajiy.restcountries.api.utility.ObjectMapperConfig;
import com.furqonajiy.restcountries.model.dto.populatedcountries.CountryDensity;
import com.furqonajiy.restcountries.model.dto.restcountries.RestCountriesResponse;
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
    PopulatedCountriesServiceImpl getMostPopulatedCountriesService;

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
        List<CountryDensity> countryDensitiesRs = getMostPopulatedCountriesService.constructListCountry(restCountriesRsAllCountry);

        assert Objects.equals(objectMapper.writeValueAsString(countryDensitiesRs), objectMapper.writeValueAsString(TestData.countryDensitiesRs()));
    }

    @Test
    @DisplayName("sortListCountryDensity()")
    void sortListCountryDensity() throws JsonProcessingException {
        List<CountryDensity> countryDensitiesRs = TestData.countryDensitiesRs();
        List<CountryDensity> sortedCountryDensitiesRs = getMostPopulatedCountriesService.sortListCountry(countryDensitiesRs);
        assert Objects.equals(objectMapper.writeValueAsString(sortedCountryDensitiesRs), objectMapper.writeValueAsString(TestData.sortedCountryDensitiesRs()));
    }
}
