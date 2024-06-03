package com.furqonajiy.restcountries.api.service.getmostborderedcountries;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.utility.ObjectMapperConfig;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostborderingcountries.CountryBorder;

import java.util.List;

public class TestData {
    private static final ObjectMapper objectMapper = new ObjectMapperConfig().objectMapper();

    public static List<RestCountriesResponse> restCountriesRsAsia() throws JsonProcessingException {
        String REST_COUNTRIES_RESPONSE_ASIA = "[\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kuwait\"\n" +
                "        },\n" +
                "        \"cca3\": \"KWT\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Oman\"\n" +
                "        },\n" +
                "        \"cca3\": \"OMN\",\n" +
                "        \"borders\": [\n" +
                "            \"SAU\",\n" +
                "            \"ARE\",\n" +
                "            \"YEM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Yemen\"\n" +
                "        },\n" +
                "        \"cca3\": \"YEM\",\n" +
                "        \"borders\": [\n" +
                "            \"OMN\",\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Macau\"\n" +
                "        },\n" +
                "        \"cca3\": \"MAC\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Israel\"\n" +
                "        },\n" +
                "        \"cca3\": \"ISR\",\n" +
                "        \"borders\": [\n" +
                "            \"EGY\",\n" +
                "            \"JOR\",\n" +
                "            \"LBN\",\n" +
                "            \"PSE\",\n" +
                "            \"SYR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"India\"\n" +
                "        },\n" +
                "        \"cca3\": \"IND\",\n" +
                "        \"borders\": [\n" +
                "            \"BGD\",\n" +
                "            \"BTN\",\n" +
                "            \"MMR\",\n" +
                "            \"CHN\",\n" +
                "            \"NPL\",\n" +
                "            \"PAK\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kyrgyzstan\"\n" +
                "        },\n" +
                "        \"cca3\": \"KGZ\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KAZ\",\n" +
                "            \"TJK\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Maldives\"\n" +
                "        },\n" +
                "        \"cca3\": \"MDV\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Palestine\"\n" +
                "        },\n" +
                "        \"cca3\": \"PSE\",\n" +
                "        \"borders\": [\n" +
                "            \"ISR\",\n" +
                "            \"EGY\",\n" +
                "            \"JOR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Hong Kong\"\n" +
                "        },\n" +
                "        \"cca3\": \"HKG\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Timor-Leste\"\n" +
                "        },\n" +
                "        \"cca3\": \"TLS\",\n" +
                "        \"borders\": [\n" +
                "            \"IDN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iraq\"\n" +
                "        },\n" +
                "        \"cca3\": \"IRQ\",\n" +
                "        \"borders\": [\n" +
                "            \"IRN\",\n" +
                "            \"JOR\",\n" +
                "            \"KWT\",\n" +
                "            \"SAU\",\n" +
                "            \"SYR\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sri Lanka\"\n" +
                "        },\n" +
                "        \"cca3\": \"LKA\",\n" +
                "        \"borders\": [\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Uzbekistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"UZB\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"KAZ\",\n" +
                "            \"KGZ\",\n" +
                "            \"TJK\",\n" +
                "            \"TKM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bangladesh\"\n" +
                "        },\n" +
                "        \"cca3\": \"BGD\",\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bahrain\"\n" +
                "        },\n" +
                "        \"cca3\": \"BHR\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Myanmar\"\n" +
                "        },\n" +
                "        \"cca3\": \"MMR\",\n" +
                "        \"borders\": [\n" +
                "            \"BGD\",\n" +
                "            \"CHN\",\n" +
                "            \"IND\",\n" +
                "            \"LAO\",\n" +
                "            \"THA\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bhutan\"\n" +
                "        },\n" +
                "        \"cca3\": \"BTN\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"United Arab Emirates\"\n" +
                "        },\n" +
                "        \"cca3\": \"ARE\",\n" +
                "        \"borders\": [\n" +
                "            \"OMN\",\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"China\"\n" +
                "        },\n" +
                "        \"cca3\": \"CHN\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"BTN\",\n" +
                "            \"MMR\",\n" +
                "            \"HKG\",\n" +
                "            \"IND\",\n" +
                "            \"KAZ\",\n" +
                "            \"NPL\",\n" +
                "            \"PRK\",\n" +
                "            \"KGZ\",\n" +
                "            \"LAO\",\n" +
                "            \"MAC\",\n" +
                "            \"MNG\",\n" +
                "            \"PAK\",\n" +
                "            \"RUS\",\n" +
                "            \"TJK\",\n" +
                "            \"VNM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cambodia\"\n" +
                "        },\n" +
                "        \"cca3\": \"KHM\",\n" +
                "        \"borders\": [\n" +
                "            \"LAO\",\n" +
                "            \"THA\",\n" +
                "            \"VNM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Vietnam\"\n" +
                "        },\n" +
                "        \"cca3\": \"VNM\",\n" +
                "        \"borders\": [\n" +
                "            \"KHM\",\n" +
                "            \"CHN\",\n" +
                "            \"LAO\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Azerbaijan\"\n" +
                "        },\n" +
                "        \"cca3\": \"AZE\",\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"GEO\",\n" +
                "            \"IRN\",\n" +
                "            \"RUS\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tajikistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"TJK\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"CHN\",\n" +
                "            \"KGZ\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kazakhstan\"\n" +
                "        },\n" +
                "        \"cca3\": \"KAZ\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KGZ\",\n" +
                "            \"RUS\",\n" +
                "            \"TKM\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Jordan\"\n" +
                "        },\n" +
                "        \"cca3\": \"JOR\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"ISR\",\n" +
                "            \"PSE\",\n" +
                "            \"SAU\",\n" +
                "            \"SYR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Singapore\"\n" +
                "        },\n" +
                "        \"cca3\": \"SGP\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mongolia\"\n" +
                "        },\n" +
                "        \"cca3\": \"MNG\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"RUS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Armenia\"\n" +
                "        },\n" +
                "        \"cca3\": \"ARM\",\n" +
                "        \"borders\": [\n" +
                "            \"AZE\",\n" +
                "            \"GEO\",\n" +
                "            \"IRN\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Afghanistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"AFG\",\n" +
                "        \"borders\": [\n" +
                "            \"IRN\",\n" +
                "            \"PAK\",\n" +
                "            \"TKM\",\n" +
                "            \"UZB\",\n" +
                "            \"TJK\",\n" +
                "            \"CHN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Philippines\"\n" +
                "        },\n" +
                "        \"cca3\": \"PHL\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Brunei\"\n" +
                "        },\n" +
                "        \"cca3\": \"BRN\",\n" +
                "        \"borders\": [\n" +
                "            \"MYS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Turkmenistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"TKM\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"IRN\",\n" +
                "            \"KAZ\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Laos\"\n" +
                "        },\n" +
                "        \"cca3\": \"LAO\",\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"KHM\",\n" +
                "            \"CHN\",\n" +
                "            \"THA\",\n" +
                "            \"VNM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Thailand\"\n" +
                "        },\n" +
                "        \"cca3\": \"THA\",\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"KHM\",\n" +
                "            \"LAO\",\n" +
                "            \"MYS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Taiwan\"\n" +
                "        },\n" +
                "        \"cca3\": \"TWN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Japan\"\n" +
                "        },\n" +
                "        \"cca3\": \"JPN\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Qatar\"\n" +
                "        },\n" +
                "        \"cca3\": \"QAT\",\n" +
                "        \"borders\": [\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"South Korea\"\n" +
                "        },\n" +
                "        \"cca3\": \"KOR\",\n" +
                "        \"borders\": [\n" +
                "            \"PRK\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Turkey\"\n" +
                "        },\n" +
                "        \"cca3\": \"TUR\",\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"BGR\",\n" +
                "            \"GEO\",\n" +
                "            \"GRC\",\n" +
                "            \"IRN\",\n" +
                "            \"IRQ\",\n" +
                "            \"SYR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iran\"\n" +
                "        },\n" +
                "        \"cca3\": \"IRN\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"IRQ\",\n" +
                "            \"PAK\",\n" +
                "            \"TUR\",\n" +
                "            \"TKM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saudi Arabia\"\n" +
                "        },\n" +
                "        \"cca3\": \"SAU\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"JOR\",\n" +
                "            \"KWT\",\n" +
                "            \"OMN\",\n" +
                "            \"QAT\",\n" +
                "            \"ARE\",\n" +
                "            \"YEM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Syria\"\n" +
                "        },\n" +
                "        \"cca3\": \"SYR\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"ISR\",\n" +
                "            \"JOR\",\n" +
                "            \"LBN\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Lebanon\"\n" +
                "        },\n" +
                "        \"cca3\": \"LBN\",\n" +
                "        \"borders\": [\n" +
                "            \"ISR\",\n" +
                "            \"SYR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Georgia\"\n" +
                "        },\n" +
                "        \"cca3\": \"GEO\",\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"RUS\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Pakistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"PAK\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"CHN\",\n" +
                "            \"IND\",\n" +
                "            \"IRN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Malaysia\"\n" +
                "        },\n" +
                "        \"cca3\": \"MYS\",\n" +
                "        \"borders\": [\n" +
                "            \"BRN\",\n" +
                "            \"IDN\",\n" +
                "            \"THA\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Nepal\"\n" +
                "        },\n" +
                "        \"cca3\": \"NPL\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Indonesia\"\n" +
                "        },\n" +
                "        \"cca3\": \"IDN\",\n" +
                "        \"borders\": [\n" +
                "            \"TLS\",\n" +
                "            \"MYS\",\n" +
                "            \"PNG\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"North Korea\"\n" +
                "        },\n" +
                "        \"cca3\": \"PRK\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KOR\",\n" +
                "            \"RUS\"\n" +
                "        ]\n" +
                "    }\n" +
                "]";

        List<RestCountriesResponse> restCountriesRsAsia = List.of(objectMapper.readValue(REST_COUNTRIES_RESPONSE_ASIA, RestCountriesResponse[].class));
        return restCountriesRsAsia;
    }

    public static List<CountryBorder> countryBordersRs() throws JsonProcessingException {
        String COUNTRY_BORDERS_RESPONSE = "[\n" +
                "    {\n" +
                "        \"name\": \"Kuwait\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"SAU\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Oman\",\n" +
                "        \"borders\": [\n" +
                "            \"SAU\",\n" +
                "            \"ARE\",\n" +
                "            \"YEM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Yemen\",\n" +
                "        \"borders\": [\n" +
                "            \"OMN\",\n" +
                "            \"SAU\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Macau\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Israel\",\n" +
                "        \"borders\": [\n" +
                "            \"EGY\",\n" +
                "            \"JOR\",\n" +
                "            \"LBN\",\n" +
                "            \"PSE\",\n" +
                "            \"SYR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"EGY\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"India\",\n" +
                "        \"borders\": [\n" +
                "            \"BGD\",\n" +
                "            \"BTN\",\n" +
                "            \"MMR\",\n" +
                "            \"CHN\",\n" +
                "            \"NPL\",\n" +
                "            \"PAK\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 6,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kyrgyzstan\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KAZ\",\n" +
                "            \"TJK\",\n" +
                "            \"UZB\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Palestine\",\n" +
                "        \"borders\": [\n" +
                "            \"ISR\",\n" +
                "            \"EGY\",\n" +
                "            \"JOR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"EGY\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Hong Kong\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Timor-Leste\",\n" +
                "        \"borders\": [\n" +
                "            \"IDN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Iraq\",\n" +
                "        \"borders\": [\n" +
                "            \"IRN\",\n" +
                "            \"JOR\",\n" +
                "            \"KWT\",\n" +
                "            \"SAU\",\n" +
                "            \"SYR\",\n" +
                "            \"TUR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 6,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sri Lanka\",\n" +
                "        \"borders\": [\n" +
                "            \"IND\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Uzbekistan\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"KAZ\",\n" +
                "            \"KGZ\",\n" +
                "            \"TJK\",\n" +
                "            \"TKM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bangladesh\",\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"IND\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Myanmar\",\n" +
                "        \"borders\": [\n" +
                "            \"BGD\",\n" +
                "            \"CHN\",\n" +
                "            \"IND\",\n" +
                "            \"LAO\",\n" +
                "            \"THA\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bhutan\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"IND\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"United Arab Emirates\",\n" +
                "        \"borders\": [\n" +
                "            \"OMN\",\n" +
                "            \"SAU\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"China\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"BTN\",\n" +
                "            \"MMR\",\n" +
                "            \"HKG\",\n" +
                "            \"IND\",\n" +
                "            \"KAZ\",\n" +
                "            \"NPL\",\n" +
                "            \"PRK\",\n" +
                "            \"KGZ\",\n" +
                "            \"LAO\",\n" +
                "            \"MAC\",\n" +
                "            \"MNG\",\n" +
                "            \"PAK\",\n" +
                "            \"RUS\",\n" +
                "            \"TJK\",\n" +
                "            \"VNM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 16,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cambodia\",\n" +
                "        \"borders\": [\n" +
                "            \"LAO\",\n" +
                "            \"THA\",\n" +
                "            \"VNM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vietnam\",\n" +
                "        \"borders\": [\n" +
                "            \"KHM\",\n" +
                "            \"CHN\",\n" +
                "            \"LAO\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Azerbaijan\",\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"GEO\",\n" +
                "            \"IRN\",\n" +
                "            \"RUS\",\n" +
                "            \"TUR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tajikistan\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"CHN\",\n" +
                "            \"KGZ\",\n" +
                "            \"UZB\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kazakhstan\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KGZ\",\n" +
                "            \"RUS\",\n" +
                "            \"TKM\",\n" +
                "            \"UZB\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jordan\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"ISR\",\n" +
                "            \"PSE\",\n" +
                "            \"SAU\",\n" +
                "            \"SYR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mongolia\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Armenia\",\n" +
                "        \"borders\": [\n" +
                "            \"AZE\",\n" +
                "            \"GEO\",\n" +
                "            \"IRN\",\n" +
                "            \"TUR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Afghanistan\",\n" +
                "        \"borders\": [\n" +
                "            \"IRN\",\n" +
                "            \"PAK\",\n" +
                "            \"TKM\",\n" +
                "            \"UZB\",\n" +
                "            \"TJK\",\n" +
                "            \"CHN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 6,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Brunei\",\n" +
                "        \"borders\": [\n" +
                "            \"MYS\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Turkmenistan\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"IRN\",\n" +
                "            \"KAZ\",\n" +
                "            \"UZB\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Laos\",\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"KHM\",\n" +
                "            \"CHN\",\n" +
                "            \"THA\",\n" +
                "            \"VNM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Thailand\",\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"KHM\",\n" +
                "            \"LAO\",\n" +
                "            \"MYS\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Qatar\",\n" +
                "        \"borders\": [\n" +
                "            \"SAU\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"South Korea\",\n" +
                "        \"borders\": [\n" +
                "            \"PRK\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Turkey\",\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"BGR\",\n" +
                "            \"GEO\",\n" +
                "            \"GRC\",\n" +
                "            \"IRN\",\n" +
                "            \"IRQ\",\n" +
                "            \"SYR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 8,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"BGR\",\n" +
                "            \"GRC\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 2\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Iran\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"IRQ\",\n" +
                "            \"PAK\",\n" +
                "            \"TUR\",\n" +
                "            \"TKM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 7,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saudi Arabia\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"JOR\",\n" +
                "            \"KWT\",\n" +
                "            \"OMN\",\n" +
                "            \"QAT\",\n" +
                "            \"ARE\",\n" +
                "            \"YEM\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 7,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Syria\",\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"ISR\",\n" +
                "            \"JOR\",\n" +
                "            \"LBN\",\n" +
                "            \"TUR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 5,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lebanon\",\n" +
                "        \"borders\": [\n" +
                "            \"ISR\",\n" +
                "            \"SYR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Georgia\",\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"RUS\",\n" +
                "            \"TUR\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pakistan\",\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"CHN\",\n" +
                "            \"IND\",\n" +
                "            \"IRN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 4,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Malaysia\",\n" +
                "        \"borders\": [\n" +
                "            \"BRN\",\n" +
                "            \"IDN\",\n" +
                "            \"THA\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nepal\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"IND\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 2,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Indonesia\",\n" +
                "        \"borders\": [\n" +
                "            \"TLS\",\n" +
                "            \"MYS\",\n" +
                "            \"PNG\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"PNG\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"North Korea\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KOR\",\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 3,\n" +
                "        \"borders_different_region\": [\n" +
                "            \"RUS\"\n" +
                "        ],\n" +
                "        \"number_of_borders_different_region\": 1\n" +
                "    }\n" +
                "]";

        List<CountryBorder> countryBordersRs = List.of(objectMapper.readValue(COUNTRY_BORDERS_RESPONSE, CountryBorder[].class));
        return countryBordersRs;
    }
}
