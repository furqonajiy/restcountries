package com.furqonajiy.restcountries.api.service.getmostborderedcountries;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.service.impl.BorderedCountriesServiceImpl;
import com.furqonajiy.restcountries.api.utility.ObjectMapperConfig;
import com.furqonajiy.restcountries.model.dto.borderedcountries.CountryBorder;
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
    BorderedCountriesServiceImpl getMostBorderedCountriesService;

    @Mock(name = "restCountriesObjectMapper")
    ObjectMapper objectMapper;

    @BeforeEach
    void initializeMock() {
        objectMapper = new ObjectMapperConfig().objectMapper();
    }

    @Test
    @DisplayName("constructListCountryBorder()")
    void constructListCountryBorder() throws JsonProcessingException {
        List<RestCountriesResponse> restCountriesRsAsia = TestData.restCountriesRsAsia();
        List<CountryBorder> countryBorders = getMostBorderedCountriesService.constructListCountry(restCountriesRsAsia);
        assert Objects.equals(objectMapper.writeValueAsString(countryBorders), objectMapper.writeValueAsString(TestData.countryBordersRs()));
    }

    @Test
    @DisplayName("checkCca3Region()")
    void checkCca3Region() throws JsonProcessingException {
        List<RestCountriesResponse> restCountriesRsAsia = TestData.restCountriesRsAsia();
        assert !getMostBorderedCountriesService.checkCca3Region("BGR", restCountriesRsAsia);
        assert getMostBorderedCountriesService.checkCca3Region("CHN", restCountriesRsAsia);
    }

    @Test
    @DisplayName("sortListCountryBorder()")
    void sortListCountryBorder() throws JsonProcessingException {
        List<CountryBorder> countryBorders = TestData.countryBordersRs();
        List<CountryBorder> sortedCountryBorders = getMostBorderedCountriesService.sortListCountry(countryBorders);
        assert Objects.equals(sortedCountryBorders.get(0).getName(), "Turkey");
    }
}
