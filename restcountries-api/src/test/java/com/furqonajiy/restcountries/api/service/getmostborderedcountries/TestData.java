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
                "            \"common\": \"Laos\"\n" +
                "        },\n" +
                "        \"cca3\": \"LAO\",\n" +
                "        \"area\": 236800.0,\n" +
                "        \"population\": 7275556,\n" +
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
                "            \"common\": \"Armenia\"\n" +
                "        },\n" +
                "        \"cca3\": \"ARM\",\n" +
                "        \"area\": 29743.0,\n" +
                "        \"population\": 2963234,\n" +
                "        \"borders\": [\n" +
                "            \"AZE\",\n" +
                "            \"GEO\",\n" +
                "            \"IRN\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Lebanon\"\n" +
                "        },\n" +
                "        \"cca3\": \"LBN\",\n" +
                "        \"area\": 10452.0,\n" +
                "        \"population\": 6825442,\n" +
                "        \"borders\": [\n" +
                "            \"ISR\",\n" +
                "            \"SYR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Palestine\"\n" +
                "        },\n" +
                "        \"cca3\": \"PSE\",\n" +
                "        \"area\": 6220.0,\n" +
                "        \"population\": 4803269,\n" +
                "        \"borders\": [\n" +
                "            \"ISR\",\n" +
                "            \"EGY\",\n" +
                "            \"JOR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Brunei\"\n" +
                "        },\n" +
                "        \"cca3\": \"BRN\",\n" +
                "        \"area\": 5765.0,\n" +
                "        \"population\": 437483,\n" +
                "        \"borders\": [\n" +
                "            \"MYS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bhutan\"\n" +
                "        },\n" +
                "        \"cca3\": \"BTN\",\n" +
                "        \"area\": 38394.0,\n" +
                "        \"population\": 771612,\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Azerbaijan\"\n" +
                "        },\n" +
                "        \"cca3\": \"AZE\",\n" +
                "        \"area\": 86600.0,\n" +
                "        \"population\": 10110116,\n" +
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
                "            \"common\": \"Yemen\"\n" +
                "        },\n" +
                "        \"cca3\": \"YEM\",\n" +
                "        \"area\": 527968.0,\n" +
                "        \"population\": 29825968,\n" +
                "        \"borders\": [\n" +
                "            \"OMN\",\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Malaysia\"\n" +
                "        },\n" +
                "        \"cca3\": \"MYS\",\n" +
                "        \"area\": 330803.0,\n" +
                "        \"population\": 32365998,\n" +
                "        \"borders\": [\n" +
                "            \"BRN\",\n" +
                "            \"IDN\",\n" +
                "            \"THA\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Oman\"\n" +
                "        },\n" +
                "        \"cca3\": \"OMN\",\n" +
                "        \"area\": 309500.0,\n" +
                "        \"population\": 5106622,\n" +
                "        \"borders\": [\n" +
                "            \"SAU\",\n" +
                "            \"ARE\",\n" +
                "            \"YEM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"India\"\n" +
                "        },\n" +
                "        \"cca3\": \"IND\",\n" +
                "        \"area\": 3287590.0,\n" +
                "        \"population\": 1380004385,\n" +
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
                "            \"common\": \"Taiwan\"\n" +
                "        },\n" +
                "        \"cca3\": \"TWN\",\n" +
                "        \"area\": 36193.0,\n" +
                "        \"population\": 23503349\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mongolia\"\n" +
                "        },\n" +
                "        \"cca3\": \"MNG\",\n" +
                "        \"area\": 1564110.0,\n" +
                "        \"population\": 3278292,\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"RUS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"China\"\n" +
                "        },\n" +
                "        \"cca3\": \"CHN\",\n" +
                "        \"area\": 9706961.0,\n" +
                "        \"population\": 1402112000,\n" +
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
                "            \"common\": \"Myanmar\"\n" +
                "        },\n" +
                "        \"cca3\": \"MMR\",\n" +
                "        \"area\": 676578.0,\n" +
                "        \"population\": 54409794,\n" +
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
                "            \"common\": \"Pakistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"PAK\",\n" +
                "        \"area\": 881912.0,\n" +
                "        \"population\": 220892331,\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"CHN\",\n" +
                "            \"IND\",\n" +
                "            \"IRN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"North Korea\"\n" +
                "        },\n" +
                "        \"cca3\": \"PRK\",\n" +
                "        \"area\": 120538.0,\n" +
                "        \"population\": 25778815,\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KOR\",\n" +
                "            \"RUS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saudi Arabia\"\n" +
                "        },\n" +
                "        \"cca3\": \"SAU\",\n" +
                "        \"area\": 2149690.0,\n" +
                "        \"population\": 34813867,\n" +
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
                "            \"common\": \"United Arab Emirates\"\n" +
                "        },\n" +
                "        \"cca3\": \"ARE\",\n" +
                "        \"area\": 83600.0,\n" +
                "        \"population\": 9890400,\n" +
                "        \"borders\": [\n" +
                "            \"OMN\",\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"South Korea\"\n" +
                "        },\n" +
                "        \"cca3\": \"KOR\",\n" +
                "        \"area\": 100210.0,\n" +
                "        \"population\": 51780579,\n" +
                "        \"borders\": [\n" +
                "            \"PRK\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bangladesh\"\n" +
                "        },\n" +
                "        \"cca3\": \"BGD\",\n" +
                "        \"area\": 147570.0,\n" +
                "        \"population\": 164689383,\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sri Lanka\"\n" +
                "        },\n" +
                "        \"cca3\": \"LKA\",\n" +
                "        \"area\": 65610.0,\n" +
                "        \"population\": 21919000,\n" +
                "        \"borders\": [\n" +
                "            \"IND\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kuwait\"\n" +
                "        },\n" +
                "        \"cca3\": \"KWT\",\n" +
                "        \"area\": 17818.0,\n" +
                "        \"population\": 4270563,\n" +
                "        \"borders\": [\n" +
                "            \"IRQ\",\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Uzbekistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"UZB\",\n" +
                "        \"area\": 447400.0,\n" +
                "        \"population\": 34232050,\n" +
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
                "            \"common\": \"Singapore\"\n" +
                "        },\n" +
                "        \"cca3\": \"SGP\",\n" +
                "        \"area\": 710.0,\n" +
                "        \"population\": 5685807\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Hong Kong\"\n" +
                "        },\n" +
                "        \"cca3\": \"HKG\",\n" +
                "        \"area\": 1104.0,\n" +
                "        \"population\": 7500700,\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tajikistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"TJK\",\n" +
                "        \"area\": 143100.0,\n" +
                "        \"population\": 9537642,\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"CHN\",\n" +
                "            \"KGZ\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Syria\"\n" +
                "        },\n" +
                "        \"cca3\": \"SYR\",\n" +
                "        \"area\": 185180.0,\n" +
                "        \"population\": 17500657,\n" +
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
                "            \"common\": \"Timor-Leste\"\n" +
                "        },\n" +
                "        \"cca3\": \"TLS\",\n" +
                "        \"area\": 14874.0,\n" +
                "        \"population\": 1318442,\n" +
                "        \"borders\": [\n" +
                "            \"IDN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Macau\"\n" +
                "        },\n" +
                "        \"cca3\": \"MAC\",\n" +
                "        \"area\": 30.0,\n" +
                "        \"population\": 649342,\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Jordan\"\n" +
                "        },\n" +
                "        \"cca3\": \"JOR\",\n" +
                "        \"area\": 89342.0,\n" +
                "        \"population\": 10203140,\n" +
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
                "            \"common\": \"Thailand\"\n" +
                "        },\n" +
                "        \"cca3\": \"THA\",\n" +
                "        \"area\": 513120.0,\n" +
                "        \"population\": 69799978,\n" +
                "        \"borders\": [\n" +
                "            \"MMR\",\n" +
                "            \"KHM\",\n" +
                "            \"LAO\",\n" +
                "            \"MYS\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Maldives\"\n" +
                "        },\n" +
                "        \"cca3\": \"MDV\",\n" +
                "        \"area\": 300.0,\n" +
                "        \"population\": 540542\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Nepal\"\n" +
                "        },\n" +
                "        \"cca3\": \"NPL\",\n" +
                "        \"area\": 147181.0,\n" +
                "        \"population\": 29136808,\n" +
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
                "        \"area\": 1904569.0,\n" +
                "        \"population\": 273523621,\n" +
                "        \"borders\": [\n" +
                "            \"TLS\",\n" +
                "            \"MYS\",\n" +
                "            \"PNG\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Vietnam\"\n" +
                "        },\n" +
                "        \"cca3\": \"VNM\",\n" +
                "        \"area\": 331212.0,\n" +
                "        \"population\": 97338583,\n" +
                "        \"borders\": [\n" +
                "            \"KHM\",\n" +
                "            \"CHN\",\n" +
                "            \"LAO\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iran\"\n" +
                "        },\n" +
                "        \"cca3\": \"IRN\",\n" +
                "        \"area\": 1648195.0,\n" +
                "        \"population\": 83992953,\n" +
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
                "            \"common\": \"Turkey\"\n" +
                "        },\n" +
                "        \"cca3\": \"TUR\",\n" +
                "        \"area\": 783562.0,\n" +
                "        \"population\": 84339067,\n" +
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
                "            \"common\": \"Bahrain\"\n" +
                "        },\n" +
                "        \"cca3\": \"BHR\",\n" +
                "        \"area\": 765.0,\n" +
                "        \"population\": 1701583\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Georgia\"\n" +
                "        },\n" +
                "        \"cca3\": \"GEO\",\n" +
                "        \"area\": 69700.0,\n" +
                "        \"population\": 3714000,\n" +
                "        \"borders\": [\n" +
                "            \"ARM\",\n" +
                "            \"AZE\",\n" +
                "            \"RUS\",\n" +
                "            \"TUR\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Philippines\"\n" +
                "        },\n" +
                "        \"cca3\": \"PHL\",\n" +
                "        \"area\": 342353.0,\n" +
                "        \"population\": 109581085\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iraq\"\n" +
                "        },\n" +
                "        \"cca3\": \"IRQ\",\n" +
                "        \"area\": 438317.0,\n" +
                "        \"population\": 40222503,\n" +
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
                "            \"common\": \"Afghanistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"AFG\",\n" +
                "        \"area\": 652230.0,\n" +
                "        \"population\": 40218234,\n" +
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
                "            \"common\": \"Israel\"\n" +
                "        },\n" +
                "        \"cca3\": \"ISR\",\n" +
                "        \"area\": 20770.0,\n" +
                "        \"population\": 9216900,\n" +
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
                "            \"common\": \"Cambodia\"\n" +
                "        },\n" +
                "        \"cca3\": \"KHM\",\n" +
                "        \"area\": 181035.0,\n" +
                "        \"population\": 16718971,\n" +
                "        \"borders\": [\n" +
                "            \"LAO\",\n" +
                "            \"THA\",\n" +
                "            \"VNM\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Japan\"\n" +
                "        },\n" +
                "        \"cca3\": \"JPN\",\n" +
                "        \"area\": 377930.0,\n" +
                "        \"population\": 125836021\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kazakhstan\"\n" +
                "        },\n" +
                "        \"cca3\": \"KAZ\",\n" +
                "        \"area\": 2724900.0,\n" +
                "        \"population\": 18754440,\n" +
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
                "            \"common\": \"Turkmenistan\"\n" +
                "        },\n" +
                "        \"cca3\": \"TKM\",\n" +
                "        \"area\": 488100.0,\n" +
                "        \"population\": 6031187,\n" +
                "        \"borders\": [\n" +
                "            \"AFG\",\n" +
                "            \"IRN\",\n" +
                "            \"KAZ\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Qatar\"\n" +
                "        },\n" +
                "        \"cca3\": \"QAT\",\n" +
                "        \"area\": 11586.0,\n" +
                "        \"population\": 2881060,\n" +
                "        \"borders\": [\n" +
                "            \"SAU\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kyrgyzstan\"\n" +
                "        },\n" +
                "        \"cca3\": \"KGZ\",\n" +
                "        \"area\": 199951.0,\n" +
                "        \"population\": 6591600,\n" +
                "        \"borders\": [\n" +
                "            \"CHN\",\n" +
                "            \"KAZ\",\n" +
                "            \"TJK\",\n" +
                "            \"UZB\"\n" +
                "        ]\n" +
                "    }\n" +
                "]";

        List<RestCountriesResponse> restCountriesRsAsia = List.of(objectMapper.readValue(REST_COUNTRIES_RESPONSE_ASIA, RestCountriesResponse[].class));
        return restCountriesRsAsia;
    }

    public static List<CountryBorder> countryBordersRs() throws JsonProcessingException {
        String COUNTRY_BORDERS_RESPONSE = "[\n" +
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
                "        \"name\": \"Brunei\",\n" +
                "        \"borders\": [\n" +
                "            \"MYS\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
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
                "        \"name\": \"South Korea\",\n" +
                "        \"borders\": [\n" +
                "            \"PRK\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
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
                "        \"name\": \"Sri Lanka\",\n" +
                "        \"borders\": [\n" +
                "            \"IND\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
                "    },\n" +
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
                "        \"name\": \"Hong Kong\",\n" +
                "        \"borders\": [\n" +
                "            \"CHN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
                "        \"borders_different_region\": [],\n" +
                "        \"number_of_borders_different_region\": 0\n" +
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
                "        \"name\": \"Timor-Leste\",\n" +
                "        \"borders\": [\n" +
                "            \"IDN\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
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
                "        \"name\": \"Qatar\",\n" +
                "        \"borders\": [\n" +
                "            \"SAU\"\n" +
                "        ],\n" +
                "        \"number_of_borders\": 1,\n" +
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
                "    }\n" +
                "]";

        List<CountryBorder> countryBordersRs = List.of(objectMapper.readValue(COUNTRY_BORDERS_RESPONSE, CountryBorder[].class));
        return countryBordersRs;
    }
}
