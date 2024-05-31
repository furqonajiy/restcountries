package com.furqonajiy.restcountries.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.furqonajiy.restcountries.api.adapter.RestCountriesAdapter;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostborderingcountries.CountryBorder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GetMostBorderedCountriesService {
    @Autowired
    private RestCountriesAdapter restCountriesAdapter;

    public List<CountryBorder> process(String region) throws JsonProcessingException {
        log.debug("Process Get Most Bordered Countries");

        List<RestCountriesResponse> restCountriesResponses = restCountriesAdapter.getRegion(region);
        List<CountryBorder> countryBorders = constructListCountryBorder(restCountriesResponses);
        List<CountryBorder> sortedCountryBorders = sortListCountryBorder(countryBorders);

        return sortedCountryBorders;
    }

    public List<CountryBorder> constructListCountryBorder(List<RestCountriesResponse> restCountriesResponses) {
        log.debug("Construct List<CountryBorder>");

        List<CountryBorder> countryBorders = new ArrayList<>();
        for (RestCountriesResponse restCountriesRs : restCountriesResponses) {
            CountryBorder countryBorder = new CountryBorder();
            countryBorder.setName(restCountriesRs.getName().getCommon());

            List<String> borders = restCountriesRs.getBorders();
            if (borders != null && !borders.isEmpty()) {
                countryBorder.setBorders(borders);
                countryBorder.setNumberOfBorders(borders.size());

                // Set Border from Different Region
                List<String> borderDifferentRegions = new ArrayList<>();
                for (String border : borders) {
                    if (!checkCca3Region(border, restCountriesResponses)) {
                        borderDifferentRegions.add(border);
                    }
                }
                countryBorder.setBordersDifferentRegion(borderDifferentRegions);
                countryBorder.setNumberOfBordersDifferentRegion(borderDifferentRegions.size());

                countryBorders.add(countryBorder);
            }
        }

        return countryBorders;
    }

    public boolean checkCca3Region(String cca3, List<RestCountriesResponse> restCountriesResponses) {
        log.debug("Check CCA3 Region: {}", cca3);

        for (RestCountriesResponse restCountryRs : restCountriesResponses) {
            // If cca3 country is not exist, means the country is in different region
            if (cca3.equalsIgnoreCase(restCountryRs.getCca3())) {
                return true;
            }
        }

        return false;
    }

    public List<CountryBorder> sortListCountryBorder(List<CountryBorder> countryBorders) {
        log.debug("Sort List<CountryBorder>");

        List<CountryBorder> sortedCountryBorder = countryBorders.stream()
                .sorted((r1, r2) -> Double.compare(r2.getNumberOfBordersDifferentRegion(), r1.getNumberOfBordersDifferentRegion())) // Sort in descending order
                .collect(Collectors.toList());
        return sortedCountryBorder;
    }
}
