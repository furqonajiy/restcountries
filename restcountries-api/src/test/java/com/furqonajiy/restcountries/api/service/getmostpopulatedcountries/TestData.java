package com.furqonajiy.restcountries.api.service.getmostpopulatedcountries;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furqonajiy.restcountries.api.utility.ObjectMapperConfig;
import com.furqonajiy.restcountries.model.backend.restcountries.RestCountriesResponse;
import com.furqonajiy.restcountries.model.getmostpopulatedcountries.CountryDensity;

import java.util.List;

public class TestData {
    private static final ObjectMapper objectMapper = new ObjectMapperConfig().objectMapper();

    public static List<RestCountriesResponse> restCountriesRsAllCountry() throws JsonProcessingException {
        String REST_COUNTRIES_RESPONSE_ALL_COUNTRY = "[\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Moldova\"\n" +
                "        },\n" +
                "        \"area\": 33846.0,\n" +
                "        \"population\": 2617820\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"United States\"\n" +
                "        },\n" +
                "        \"area\": 9372610.0,\n" +
                "        \"population\": 329484123\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mayotte\"\n" +
                "        },\n" +
                "        \"area\": 374.0,\n" +
                "        \"population\": 226915\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Nauru\"\n" +
                "        },\n" +
                "        \"area\": 21.0,\n" +
                "        \"population\": 10834\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mozambique\"\n" +
                "        },\n" +
                "        \"area\": 801590.0,\n" +
                "        \"population\": 31255435\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Brazil\"\n" +
                "        },\n" +
                "        \"area\": 8515767.0,\n" +
                "        \"population\": 212559409\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cape Verde\"\n" +
                "        },\n" +
                "        \"area\": 4033.0,\n" +
                "        \"population\": 555988\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Equatorial Guinea\"\n" +
                "        },\n" +
                "        \"area\": 28051.0,\n" +
                "        \"population\": 1402985\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Albania\"\n" +
                "        },\n" +
                "        \"area\": 28748.0,\n" +
                "        \"population\": 2837743\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"United States Virgin Islands\"\n" +
                "        },\n" +
                "        \"area\": 347.0,\n" +
                "        \"population\": 106290\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Niue\"\n" +
                "        },\n" +
                "        \"area\": 260.0,\n" +
                "        \"population\": 1470\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Palau\"\n" +
                "        },\n" +
                "        \"area\": 459.0,\n" +
                "        \"population\": 18092\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Nigeria\"\n" +
                "        },\n" +
                "        \"area\": 923768.0,\n" +
                "        \"population\": 206139587\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"British Virgin Islands\"\n" +
                "        },\n" +
                "        \"area\": 151.0,\n" +
                "        \"population\": 30237\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Gambia\"\n" +
                "        },\n" +
                "        \"area\": 10689.0,\n" +
                "        \"population\": 2416664\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Somalia\"\n" +
                "        },\n" +
                "        \"area\": 637657.0,\n" +
                "        \"population\": 15893219\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Yemen\"\n" +
                "        },\n" +
                "        \"area\": 527968.0,\n" +
                "        \"population\": 29825968\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Malaysia\"\n" +
                "        },\n" +
                "        \"area\": 330803.0,\n" +
                "        \"population\": 32365998\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Dominica\"\n" +
                "        },\n" +
                "        \"area\": 751.0,\n" +
                "        \"population\": 71991\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"United Kingdom\"\n" +
                "        },\n" +
                "        \"area\": 242900.0,\n" +
                "        \"population\": 67215293\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Madagascar\"\n" +
                "        },\n" +
                "        \"area\": 587041.0,\n" +
                "        \"population\": 27691019\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Western Sahara\"\n" +
                "        },\n" +
                "        \"area\": 266000.0,\n" +
                "        \"population\": 510713\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cyprus\"\n" +
                "        },\n" +
                "        \"area\": 9251.0,\n" +
                "        \"population\": 1207361\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Antigua and Barbuda\"\n" +
                "        },\n" +
                "        \"area\": 442.0,\n" +
                "        \"population\": 97928\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Ireland\"\n" +
                "        },\n" +
                "        \"area\": 70273.0,\n" +
                "        \"population\": 4994724\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Paraguay\"\n" +
                "        },\n" +
                "        \"area\": 406752.0,\n" +
                "        \"population\": 7132530\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sri Lanka\"\n" +
                "        },\n" +
                "        \"area\": 65610.0,\n" +
                "        \"population\": 21919000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"South Africa\"\n" +
                "        },\n" +
                "        \"area\": 1221037.0,\n" +
                "        \"population\": 59308690\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kuwait\"\n" +
                "        },\n" +
                "        \"area\": 17818.0,\n" +
                "        \"population\": 4270563\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Algeria\"\n" +
                "        },\n" +
                "        \"area\": 2381741.0,\n" +
                "        \"population\": 44700000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Croatia\"\n" +
                "        },\n" +
                "        \"area\": 56594.0,\n" +
                "        \"population\": 4047200\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Martinique\"\n" +
                "        },\n" +
                "        \"area\": 1128.0,\n" +
                "        \"population\": 378243\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sierra Leone\"\n" +
                "        },\n" +
                "        \"area\": 71740.0,\n" +
                "        \"population\": 7976985\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Northern Mariana Islands\"\n" +
                "        },\n" +
                "        \"area\": 464.0,\n" +
                "        \"population\": 57557\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Rwanda\"\n" +
                "        },\n" +
                "        \"area\": 26338.0,\n" +
                "        \"population\": 12952209\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Syria\"\n" +
                "        },\n" +
                "        \"area\": 185180.0,\n" +
                "        \"population\": 17500657\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Vincent and the Grenadines\"\n" +
                "        },\n" +
                "        \"area\": 389.0,\n" +
                "        \"population\": 110947\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kosovo\"\n" +
                "        },\n" +
                "        \"area\": 10908.0,\n" +
                "        \"population\": 1775378\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Lucia\"\n" +
                "        },\n" +
                "        \"area\": 616.0,\n" +
                "        \"population\": 183629\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Honduras\"\n" +
                "        },\n" +
                "        \"area\": 112492.0,\n" +
                "        \"population\": 9904608\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Jordan\"\n" +
                "        },\n" +
                "        \"area\": 89342.0,\n" +
                "        \"population\": 10203140\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tuvalu\"\n" +
                "        },\n" +
                "        \"area\": 26.0,\n" +
                "        \"population\": 11792\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Nepal\"\n" +
                "        },\n" +
                "        \"area\": 147181.0,\n" +
                "        \"population\": 29136808\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Liberia\"\n" +
                "        },\n" +
                "        \"area\": 111369.0,\n" +
                "        \"population\": 5057677\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Heard Island and McDonald Islands\"\n" +
                "        },\n" +
                "        \"area\": 412.0,\n" +
                "        \"population\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Austria\"\n" +
                "        },\n" +
                "        \"area\": 83871.0,\n" +
                "        \"population\": 8917205\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guernsey\"\n" +
                "        },\n" +
                "        \"area\": 78.0,\n" +
                "        \"population\": 62999\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Central African Republic\"\n" +
                "        },\n" +
                "        \"area\": 622984.0,\n" +
                "        \"population\": 4829764\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mauritania\"\n" +
                "        },\n" +
                "        \"area\": 1030700.0,\n" +
                "        \"population\": 4649660\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Djibouti\"\n" +
                "        },\n" +
                "        \"area\": 23200.0,\n" +
                "        \"population\": 988002\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Fiji\"\n" +
                "        },\n" +
                "        \"area\": 18272.0,\n" +
                "        \"population\": 896444\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Norway\"\n" +
                "        },\n" +
                "        \"area\": 323802.0,\n" +
                "        \"population\": 5379475\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Latvia\"\n" +
                "        },\n" +
                "        \"area\": 64559.0,\n" +
                "        \"population\": 1901548\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Falkland Islands\"\n" +
                "        },\n" +
                "        \"area\": 12173.0,\n" +
                "        \"population\": 2563\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kazakhstan\"\n" +
                "        },\n" +
                "        \"area\": 2724900.0,\n" +
                "        \"population\": 18754440\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Åland Islands\"\n" +
                "        },\n" +
                "        \"area\": 1580.0,\n" +
                "        \"population\": 29458\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Turkmenistan\"\n" +
                "        },\n" +
                "        \"area\": 488100.0,\n" +
                "        \"population\": 6031187\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cocos (Keeling) Islands\"\n" +
                "        },\n" +
                "        \"area\": 14.0,\n" +
                "        \"population\": 544\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bulgaria\"\n" +
                "        },\n" +
                "        \"area\": 110879.0,\n" +
                "        \"population\": 6927288\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tokelau\"\n" +
                "        },\n" +
                "        \"area\": 12.0,\n" +
                "        \"population\": 1411\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"New Caledonia\"\n" +
                "        },\n" +
                "        \"area\": 18575.0,\n" +
                "        \"population\": 271960\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Barbados\"\n" +
                "        },\n" +
                "        \"area\": 430.0,\n" +
                "        \"population\": 287371\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"São Tomé and Príncipe\"\n" +
                "        },\n" +
                "        \"area\": 964.0,\n" +
                "        \"population\": 219161\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Antarctica\"\n" +
                "        },\n" +
                "        \"area\": 1.4E7,\n" +
                "        \"population\": 1000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Brunei\"\n" +
                "        },\n" +
                "        \"area\": 5765.0,\n" +
                "        \"population\": 437483\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bhutan\"\n" +
                "        },\n" +
                "        \"area\": 38394.0,\n" +
                "        \"population\": 771612\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cameroon\"\n" +
                "        },\n" +
                "        \"area\": 475442.0,\n" +
                "        \"population\": 26545864\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Argentina\"\n" +
                "        },\n" +
                "        \"area\": 2780400.0,\n" +
                "        \"population\": 45376763\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Azerbaijan\"\n" +
                "        },\n" +
                "        \"area\": 86600.0,\n" +
                "        \"population\": 10110116\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mexico\"\n" +
                "        },\n" +
                "        \"area\": 1964375.0,\n" +
                "        \"population\": 128932753\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Morocco\"\n" +
                "        },\n" +
                "        \"area\": 446550.0,\n" +
                "        \"population\": 36910558\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guatemala\"\n" +
                "        },\n" +
                "        \"area\": 108889.0,\n" +
                "        \"population\": 16858333\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kenya\"\n" +
                "        },\n" +
                "        \"area\": 580367.0,\n" +
                "        \"population\": 53771300\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Malta\"\n" +
                "        },\n" +
                "        \"area\": 316.0,\n" +
                "        \"population\": 525285\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Czechia\"\n" +
                "        },\n" +
                "        \"area\": 78865.0,\n" +
                "        \"population\": 10698896\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Gibraltar\"\n" +
                "        },\n" +
                "        \"area\": 6.0,\n" +
                "        \"population\": 33691\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Aruba\"\n" +
                "        },\n" +
                "        \"area\": 180.0,\n" +
                "        \"population\": 106766\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Barthélemy\"\n" +
                "        },\n" +
                "        \"area\": 21.0,\n" +
                "        \"population\": 4255\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Monaco\"\n" +
                "        },\n" +
                "        \"area\": 2.02,\n" +
                "        \"population\": 39244\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"United Arab Emirates\"\n" +
                "        },\n" +
                "        \"area\": 83600.0,\n" +
                "        \"population\": 9890400\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"South Sudan\"\n" +
                "        },\n" +
                "        \"area\": 619745.0,\n" +
                "        \"population\": 11193729\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Puerto Rico\"\n" +
                "        },\n" +
                "        \"area\": 8870.0,\n" +
                "        \"population\": 3194034\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"El Salvador\"\n" +
                "        },\n" +
                "        \"area\": 21041.0,\n" +
                "        \"population\": 6486201\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"France\"\n" +
                "        },\n" +
                "        \"area\": 551695.0,\n" +
                "        \"population\": 67391582\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Niger\"\n" +
                "        },\n" +
                "        \"area\": 1267000.0,\n" +
                "        \"population\": 24206636\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Ivory Coast\"\n" +
                "        },\n" +
                "        \"area\": 322463.0,\n" +
                "        \"population\": 26378275\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"South Georgia\"\n" +
                "        },\n" +
                "        \"area\": 3903.0,\n" +
                "        \"population\": 30\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Botswana\"\n" +
                "        },\n" +
                "        \"area\": 582000.0,\n" +
                "        \"population\": 2351625\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"British Indian Ocean Territory\"\n" +
                "        },\n" +
                "        \"area\": 60.0,\n" +
                "        \"population\": 3000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Uzbekistan\"\n" +
                "        },\n" +
                "        \"area\": 447400.0,\n" +
                "        \"population\": 34232050\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tunisia\"\n" +
                "        },\n" +
                "        \"area\": 163610.0,\n" +
                "        \"population\": 11818618\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Hong Kong\"\n" +
                "        },\n" +
                "        \"area\": 1104.0,\n" +
                "        \"population\": 7500700\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"North Macedonia\"\n" +
                "        },\n" +
                "        \"area\": 25713.0,\n" +
                "        \"population\": 2077132\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Suriname\"\n" +
                "        },\n" +
                "        \"area\": 163820.0,\n" +
                "        \"population\": 586634\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Belgium\"\n" +
                "        },\n" +
                "        \"area\": 30528.0,\n" +
                "        \"population\": 11555997\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"American Samoa\"\n" +
                "        },\n" +
                "        \"area\": 199.0,\n" +
                "        \"population\": 55197\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Solomon Islands\"\n" +
                "        },\n" +
                "        \"area\": 28896.0,\n" +
                "        \"population\": 686878\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Ukraine\"\n" +
                "        },\n" +
                "        \"area\": 603500.0,\n" +
                "        \"population\": 44134693\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Finland\"\n" +
                "        },\n" +
                "        \"area\": 338424.0,\n" +
                "        \"population\": 5530719\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Burkina Faso\"\n" +
                "        },\n" +
                "        \"area\": 272967.0,\n" +
                "        \"population\": 20903278\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bosnia and Herzegovina\"\n" +
                "        },\n" +
                "        \"area\": 51209.0,\n" +
                "        \"population\": 3280815\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iran\"\n" +
                "        },\n" +
                "        \"area\": 1648195.0,\n" +
                "        \"population\": 83992953\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cuba\"\n" +
                "        },\n" +
                "        \"area\": 109884.0,\n" +
                "        \"population\": 11326616\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Eritrea\"\n" +
                "        },\n" +
                "        \"area\": 117600.0,\n" +
                "        \"population\": 5352000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Slovakia\"\n" +
                "        },\n" +
                "        \"area\": 49037.0,\n" +
                "        \"population\": 5458827\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Lithuania\"\n" +
                "        },\n" +
                "        \"area\": 65300.0,\n" +
                "        \"population\": 2794700\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Martin\"\n" +
                "        },\n" +
                "        \"area\": 53.0,\n" +
                "        \"population\": 38659\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Pitcairn Islands\"\n" +
                "        },\n" +
                "        \"area\": 47.0,\n" +
                "        \"population\": 56\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guinea-Bissau\"\n" +
                "        },\n" +
                "        \"area\": 36125.0,\n" +
                "        \"population\": 1967998\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Montserrat\"\n" +
                "        },\n" +
                "        \"area\": 102.0,\n" +
                "        \"population\": 4922\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Turkey\"\n" +
                "        },\n" +
                "        \"area\": 783562.0,\n" +
                "        \"population\": 84339067\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Philippines\"\n" +
                "        },\n" +
                "        \"area\": 342353.0,\n" +
                "        \"population\": 109581085\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Vanuatu\"\n" +
                "        },\n" +
                "        \"area\": 12189.0,\n" +
                "        \"population\": 307150\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bolivia\"\n" +
                "        },\n" +
                "        \"area\": 1098581.0,\n" +
                "        \"population\": 11673029\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Kitts and Nevis\"\n" +
                "        },\n" +
                "        \"area\": 261.0,\n" +
                "        \"population\": 53192\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Romania\"\n" +
                "        },\n" +
                "        \"area\": 238391.0,\n" +
                "        \"population\": 19286123\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cambodia\"\n" +
                "        },\n" +
                "        \"area\": 181035.0,\n" +
                "        \"population\": 16718971\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Zimbabwe\"\n" +
                "        },\n" +
                "        \"area\": 390757.0,\n" +
                "        \"population\": 14862927\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Jersey\"\n" +
                "        },\n" +
                "        \"area\": 116.0,\n" +
                "        \"population\": 100800\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kyrgyzstan\"\n" +
                "        },\n" +
                "        \"area\": 199951.0,\n" +
                "        \"population\": 6591600\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Caribbean Netherlands\"\n" +
                "        },\n" +
                "        \"area\": 328.0,\n" +
                "        \"population\": 25987\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guyana\"\n" +
                "        },\n" +
                "        \"area\": 214969.0,\n" +
                "        \"population\": 786559\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"United States Minor Outlying Islands\"\n" +
                "        },\n" +
                "        \"area\": 34.2,\n" +
                "        \"population\": 300\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Armenia\"\n" +
                "        },\n" +
                "        \"area\": 29743.0,\n" +
                "        \"population\": 2963234\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Lebanon\"\n" +
                "        },\n" +
                "        \"area\": 10452.0,\n" +
                "        \"population\": 6825442\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Montenegro\"\n" +
                "        },\n" +
                "        \"area\": 13812.0,\n" +
                "        \"population\": 621718\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Greenland\"\n" +
                "        },\n" +
                "        \"area\": 2166086.0,\n" +
                "        \"population\": 56367\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Papua New Guinea\"\n" +
                "        },\n" +
                "        \"area\": 462840.0,\n" +
                "        \"population\": 8947027\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Zambia\"\n" +
                "        },\n" +
                "        \"area\": 752612.0,\n" +
                "        \"population\": 18383956\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Trinidad and Tobago\"\n" +
                "        },\n" +
                "        \"area\": 5130.0,\n" +
                "        \"population\": 1399491\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"French Southern and Antarctic Lands\"\n" +
                "        },\n" +
                "        \"area\": 7747.0,\n" +
                "        \"population\": 400\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Peru\"\n" +
                "        },\n" +
                "        \"area\": 1285216.0,\n" +
                "        \"population\": 32971846\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sweden\"\n" +
                "        },\n" +
                "        \"area\": 450295.0,\n" +
                "        \"population\": 10353442\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sudan\"\n" +
                "        },\n" +
                "        \"area\": 1886068.0,\n" +
                "        \"population\": 43849269\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Pierre and Miquelon\"\n" +
                "        },\n" +
                "        \"area\": 242.0,\n" +
                "        \"population\": 6069\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Oman\"\n" +
                "        },\n" +
                "        \"area\": 309500.0,\n" +
                "        \"population\": 5106622\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"India\"\n" +
                "        },\n" +
                "        \"area\": 3287590.0,\n" +
                "        \"population\": 1380004385\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Taiwan\"\n" +
                "        },\n" +
                "        \"area\": 36193.0,\n" +
                "        \"population\": 23503349\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mongolia\"\n" +
                "        },\n" +
                "        \"area\": 1564110.0,\n" +
                "        \"population\": 3278292\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Senegal\"\n" +
                "        },\n" +
                "        \"area\": 196722.0,\n" +
                "        \"population\": 16743930\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tanzania\"\n" +
                "        },\n" +
                "        \"area\": 945087.0,\n" +
                "        \"population\": 59734213\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Canada\"\n" +
                "        },\n" +
                "        \"area\": 9984670.0,\n" +
                "        \"population\": 38005238\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Costa Rica\"\n" +
                "        },\n" +
                "        \"area\": 51100.0,\n" +
                "        \"population\": 5094114\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"China\"\n" +
                "        },\n" +
                "        \"area\": 9706961.0,\n" +
                "        \"population\": 1402112000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Colombia\"\n" +
                "        },\n" +
                "        \"area\": 1141748.0,\n" +
                "        \"population\": 50882884\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Myanmar\"\n" +
                "        },\n" +
                "        \"area\": 676578.0,\n" +
                "        \"population\": 54409794\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Russia\"\n" +
                "        },\n" +
                "        \"area\": 1.7098242E7,\n" +
                "        \"population\": 144104080\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"North Korea\"\n" +
                "        },\n" +
                "        \"area\": 120538.0,\n" +
                "        \"population\": 25778815\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cayman Islands\"\n" +
                "        },\n" +
                "        \"area\": 264.0,\n" +
                "        \"population\": 65720\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bouvet Island\"\n" +
                "        },\n" +
                "        \"area\": 49.0,\n" +
                "        \"population\": 0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Belarus\"\n" +
                "        },\n" +
                "        \"area\": 207600.0,\n" +
                "        \"population\": 9398861\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Portugal\"\n" +
                "        },\n" +
                "        \"area\": 92090.0,\n" +
                "        \"population\": 10305564\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Eswatini\"\n" +
                "        },\n" +
                "        \"area\": 17364.0,\n" +
                "        \"population\": 1160164\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Poland\"\n" +
                "        },\n" +
                "        \"area\": 312679.0,\n" +
                "        \"population\": 37950802\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Switzerland\"\n" +
                "        },\n" +
                "        \"area\": 41284.0,\n" +
                "        \"population\": 8654622\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Republic of the Congo\"\n" +
                "        },\n" +
                "        \"area\": 342000.0,\n" +
                "        \"population\": 5657000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Venezuela\"\n" +
                "        },\n" +
                "        \"area\": 916445.0,\n" +
                "        \"population\": 28435943\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Panama\"\n" +
                "        },\n" +
                "        \"area\": 75417.0,\n" +
                "        \"population\": 4314768\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Netherlands\"\n" +
                "        },\n" +
                "        \"area\": 41850.0,\n" +
                "        \"population\": 16655799\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Samoa\"\n" +
                "        },\n" +
                "        \"area\": 2842.0,\n" +
                "        \"population\": 198410\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Denmark\"\n" +
                "        },\n" +
                "        \"area\": 43094.0,\n" +
                "        \"population\": 5831404\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Luxembourg\"\n" +
                "        },\n" +
                "        \"area\": 2586.0,\n" +
                "        \"population\": 632275\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Faroe Islands\"\n" +
                "        },\n" +
                "        \"area\": 1393.0,\n" +
                "        \"population\": 48865\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Slovenia\"\n" +
                "        },\n" +
                "        \"area\": 20273.0,\n" +
                "        \"population\": 2100126\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Togo\"\n" +
                "        },\n" +
                "        \"area\": 56785.0,\n" +
                "        \"population\": 8278737\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Thailand\"\n" +
                "        },\n" +
                "        \"area\": 513120.0,\n" +
                "        \"population\": 69799978\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Wallis and Futuna\"\n" +
                "        },\n" +
                "        \"area\": 142.0,\n" +
                "        \"population\": 11750\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bahamas\"\n" +
                "        },\n" +
                "        \"area\": 13943.0,\n" +
                "        \"population\": 393248\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tonga\"\n" +
                "        },\n" +
                "        \"area\": 747.0,\n" +
                "        \"population\": 105697\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Greece\"\n" +
                "        },\n" +
                "        \"area\": 131990.0,\n" +
                "        \"population\": 10715549\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"San Marino\"\n" +
                "        },\n" +
                "        \"area\": 61.0,\n" +
                "        \"population\": 33938\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Réunion\"\n" +
                "        },\n" +
                "        \"area\": 2511.0,\n" +
                "        \"population\": 840974\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Vatican City\"\n" +
                "        },\n" +
                "        \"area\": 0.44,\n" +
                "        \"population\": 451\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Burundi\"\n" +
                "        },\n" +
                "        \"area\": 27834.0,\n" +
                "        \"population\": 11890781\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bahrain\"\n" +
                "        },\n" +
                "        \"area\": 765.0,\n" +
                "        \"population\": 1701583\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Marshall Islands\"\n" +
                "        },\n" +
                "        \"area\": 181.0,\n" +
                "        \"population\": 59194\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Turks and Caicos Islands\"\n" +
                "        },\n" +
                "        \"area\": 948.0,\n" +
                "        \"population\": 38718\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Isle of Man\"\n" +
                "        },\n" +
                "        \"area\": 572.0,\n" +
                "        \"population\": 85032\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Haiti\"\n" +
                "        },\n" +
                "        \"area\": 27750.0,\n" +
                "        \"population\": 11402533\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Afghanistan\"\n" +
                "        },\n" +
                "        \"area\": 652230.0,\n" +
                "        \"population\": 40218234\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Israel\"\n" +
                "        },\n" +
                "        \"area\": 20770.0,\n" +
                "        \"population\": 9216900\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Libya\"\n" +
                "        },\n" +
                "        \"area\": 1759540.0,\n" +
                "        \"population\": 6871287\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Uruguay\"\n" +
                "        },\n" +
                "        \"area\": 181034.0,\n" +
                "        \"population\": 3473727\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Norfolk Island\"\n" +
                "        },\n" +
                "        \"area\": 36.0,\n" +
                "        \"population\": 2302\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Nicaragua\"\n" +
                "        },\n" +
                "        \"area\": 130373.0,\n" +
                "        \"population\": 6624554\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Cook Islands\"\n" +
                "        },\n" +
                "        \"area\": 236.0,\n" +
                "        \"population\": 18100\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Laos\"\n" +
                "        },\n" +
                "        \"area\": 236800.0,\n" +
                "        \"population\": 7275556\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Christmas Island\"\n" +
                "        },\n" +
                "        \"area\": 135.0,\n" +
                "        \"population\": 2072\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saint Helena, Ascension and Tristan da Cunha\"\n" +
                "        },\n" +
                "        \"area\": 394.0,\n" +
                "        \"population\": 53192\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Anguilla\"\n" +
                "        },\n" +
                "        \"area\": 91.0,\n" +
                "        \"population\": 13452\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Micronesia\"\n" +
                "        },\n" +
                "        \"area\": 702.0,\n" +
                "        \"population\": 115021\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Germany\"\n" +
                "        },\n" +
                "        \"area\": 357114.0,\n" +
                "        \"population\": 83240525\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guam\"\n" +
                "        },\n" +
                "        \"area\": 549.0,\n" +
                "        \"population\": 168783\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Kiribati\"\n" +
                "        },\n" +
                "        \"area\": 811.0,\n" +
                "        \"population\": 119446\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Sint Maarten\"\n" +
                "        },\n" +
                "        \"area\": 34.0,\n" +
                "        \"population\": 40812\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Spain\"\n" +
                "        },\n" +
                "        \"area\": 505992.0,\n" +
                "        \"population\": 47351567\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Jamaica\"\n" +
                "        },\n" +
                "        \"area\": 10991.0,\n" +
                "        \"population\": 2961161\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Palestine\"\n" +
                "        },\n" +
                "        \"area\": 6220.0,\n" +
                "        \"population\": 4803269\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"French Guiana\"\n" +
                "        },\n" +
                "        \"area\": 83534.0,\n" +
                "        \"population\": 254541\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Andorra\"\n" +
                "        },\n" +
                "        \"area\": 468.0,\n" +
                "        \"population\": 77265\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Chile\"\n" +
                "        },\n" +
                "        \"area\": 756102.0,\n" +
                "        \"population\": 19116209\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Lesotho\"\n" +
                "        },\n" +
                "        \"area\": 30355.0,\n" +
                "        \"population\": 2142252\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Australia\"\n" +
                "        },\n" +
                "        \"area\": 7692024.0,\n" +
                "        \"population\": 25687041\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Grenada\"\n" +
                "        },\n" +
                "        \"area\": 344.0,\n" +
                "        \"population\": 112519\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Ghana\"\n" +
                "        },\n" +
                "        \"area\": 238533.0,\n" +
                "        \"population\": 31072945\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Seychelles\"\n" +
                "        },\n" +
                "        \"area\": 452.0,\n" +
                "        \"population\": 98462\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Angola\"\n" +
                "        },\n" +
                "        \"area\": 1246700.0,\n" +
                "        \"population\": 32866268\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bermuda\"\n" +
                "        },\n" +
                "        \"area\": 54.0,\n" +
                "        \"population\": 63903\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Pakistan\"\n" +
                "        },\n" +
                "        \"area\": 881912.0,\n" +
                "        \"population\": 220892331\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mali\"\n" +
                "        },\n" +
                "        \"area\": 1240192.0,\n" +
                "        \"population\": 20250834\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Saudi Arabia\"\n" +
                "        },\n" +
                "        \"area\": 2149690.0,\n" +
                "        \"population\": 34813867\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Curaçao\"\n" +
                "        },\n" +
                "        \"area\": 444.0,\n" +
                "        \"population\": 155014\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"South Korea\"\n" +
                "        },\n" +
                "        \"area\": 100210.0,\n" +
                "        \"population\": 51780579\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Ethiopia\"\n" +
                "        },\n" +
                "        \"area\": 1104300.0,\n" +
                "        \"population\": 114963583\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guadeloupe\"\n" +
                "        },\n" +
                "        \"area\": 1628.0,\n" +
                "        \"population\": 400132\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Bangladesh\"\n" +
                "        },\n" +
                "        \"area\": 147570.0,\n" +
                "        \"population\": 164689383\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"New Zealand\"\n" +
                "        },\n" +
                "        \"area\": 270467.0,\n" +
                "        \"population\": 5084300\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Comoros\"\n" +
                "        },\n" +
                "        \"area\": 1862.0,\n" +
                "        \"population\": 869595\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Belize\"\n" +
                "        },\n" +
                "        \"area\": 22966.0,\n" +
                "        \"population\": 397621\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Uganda\"\n" +
                "        },\n" +
                "        \"area\": 241550.0,\n" +
                "        \"population\": 45741000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Singapore\"\n" +
                "        },\n" +
                "        \"area\": 710.0,\n" +
                "        \"population\": 5685807\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Liechtenstein\"\n" +
                "        },\n" +
                "        \"area\": 160.0,\n" +
                "        \"population\": 38137\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Hungary\"\n" +
                "        },\n" +
                "        \"area\": 93028.0,\n" +
                "        \"population\": 9749763\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iceland\"\n" +
                "        },\n" +
                "        \"area\": 103000.0,\n" +
                "        \"population\": 366425\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Tajikistan\"\n" +
                "        },\n" +
                "        \"area\": 143100.0,\n" +
                "        \"population\": 9537642\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Namibia\"\n" +
                "        },\n" +
                "        \"area\": 825615.0,\n" +
                "        \"population\": 2540916\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Timor-Leste\"\n" +
                "        },\n" +
                "        \"area\": 14874.0,\n" +
                "        \"population\": 1318442\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Egypt\"\n" +
                "        },\n" +
                "        \"area\": 1002450.0,\n" +
                "        \"population\": 102334403\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Serbia\"\n" +
                "        },\n" +
                "        \"area\": 88361.0,\n" +
                "        \"population\": 6908224\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Mauritius\"\n" +
                "        },\n" +
                "        \"area\": 2040.0,\n" +
                "        \"population\": 1265740\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Macau\"\n" +
                "        },\n" +
                "        \"area\": 30.0,\n" +
                "        \"population\": 649342\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"French Polynesia\"\n" +
                "        },\n" +
                "        \"area\": 4167.0,\n" +
                "        \"population\": 280904\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Maldives\"\n" +
                "        },\n" +
                "        \"area\": 300.0,\n" +
                "        \"population\": 540542\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Indonesia\"\n" +
                "        },\n" +
                "        \"area\": 1904569.0,\n" +
                "        \"population\": 273523621\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"DR Congo\"\n" +
                "        },\n" +
                "        \"area\": 2344858.0,\n" +
                "        \"population\": 108407721\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Estonia\"\n" +
                "        },\n" +
                "        \"area\": 45227.0,\n" +
                "        \"population\": 1331057\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Vietnam\"\n" +
                "        },\n" +
                "        \"area\": 331212.0,\n" +
                "        \"population\": 97338583\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Italy\"\n" +
                "        },\n" +
                "        \"area\": 301336.0,\n" +
                "        \"population\": 59554023\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Guinea\"\n" +
                "        },\n" +
                "        \"area\": 245857.0,\n" +
                "        \"population\": 13132792\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Chad\"\n" +
                "        },\n" +
                "        \"area\": 1284000.0,\n" +
                "        \"population\": 16425859\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Ecuador\"\n" +
                "        },\n" +
                "        \"area\": 276841.0,\n" +
                "        \"population\": 17643060\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Georgia\"\n" +
                "        },\n" +
                "        \"area\": 69700.0,\n" +
                "        \"population\": 3714000\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Malawi\"\n" +
                "        },\n" +
                "        \"area\": 118484.0,\n" +
                "        \"population\": 19129955\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Iraq\"\n" +
                "        },\n" +
                "        \"area\": 438317.0,\n" +
                "        \"population\": 40222503\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Svalbard and Jan Mayen\"\n" +
                "        },\n" +
                "        \"area\": 61399.0,\n" +
                "        \"population\": 2562\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Benin\"\n" +
                "        },\n" +
                "        \"area\": 112622.0,\n" +
                "        \"population\": 12123198\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Japan\"\n" +
                "        },\n" +
                "        \"area\": 377930.0,\n" +
                "        \"population\": 125836021\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Dominican Republic\"\n" +
                "        },\n" +
                "        \"area\": 48671.0,\n" +
                "        \"population\": 10847904\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Qatar\"\n" +
                "        },\n" +
                "        \"area\": 11586.0,\n" +
                "        \"population\": 2881060\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": {\n" +
                "            \"common\": \"Gabon\"\n" +
                "        },\n" +
                "        \"area\": 267668.0,\n" +
                "        \"population\": 2225728\n" +
                "    }\n" +
                "]";

        List<RestCountriesResponse> restCountriesResponsesAllCountry = List.of(objectMapper.readValue(REST_COUNTRIES_RESPONSE_ALL_COUNTRY, RestCountriesResponse[].class));
        return restCountriesResponsesAllCountry;
    }

    public static List<CountryDensity> countryDensitiesRs() throws JsonProcessingException {
        String COUNTRY_DENSITIES_RESPONSE = "[\n" +
                "    {\n" +
                "        \"name\": \"Moldova\",\n" +
                "        \"area\": 33846.0,\n" +
                "        \"population\": 2617820,\n" +
                "        \"population_density\": 77.3450333865154\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"United States\",\n" +
                "        \"area\": 9372610.0,\n" +
                "        \"population\": 329484123,\n" +
                "        \"population_density\": 35.15393502983694\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mayotte\",\n" +
                "        \"area\": 374.0,\n" +
                "        \"population\": 226915,\n" +
                "        \"population_density\": 606.7245989304813\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nauru\",\n" +
                "        \"area\": 21.0,\n" +
                "        \"population\": 10834,\n" +
                "        \"population_density\": 515.9047619047619\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mozambique\",\n" +
                "        \"area\": 801590.0,\n" +
                "        \"population\": 31255435,\n" +
                "        \"population_density\": 38.99179755236467\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Brazil\",\n" +
                "        \"area\": 8515767.0,\n" +
                "        \"population\": 212559409,\n" +
                "        \"population_density\": 24.960688684882996\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cape Verde\",\n" +
                "        \"area\": 4033.0,\n" +
                "        \"population\": 555988,\n" +
                "        \"population_density\": 137.85965782296057\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Equatorial Guinea\",\n" +
                "        \"area\": 28051.0,\n" +
                "        \"population\": 1402985,\n" +
                "        \"population_density\": 50.01550746853945\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Albania\",\n" +
                "        \"area\": 28748.0,\n" +
                "        \"population\": 2837743,\n" +
                "        \"population_density\": 98.71097119799639\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"United States Virgin Islands\",\n" +
                "        \"area\": 347.0,\n" +
                "        \"population\": 106290,\n" +
                "        \"population_density\": 306.31123919308357\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Niue\",\n" +
                "        \"area\": 260.0,\n" +
                "        \"population\": 1470,\n" +
                "        \"population_density\": 5.653846153846154\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Palau\",\n" +
                "        \"area\": 459.0,\n" +
                "        \"population\": 18092,\n" +
                "        \"population_density\": 39.4161220043573\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nigeria\",\n" +
                "        \"area\": 923768.0,\n" +
                "        \"population\": 206139587,\n" +
                "        \"population_density\": 223.1508203358419\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"British Virgin Islands\",\n" +
                "        \"area\": 151.0,\n" +
                "        \"population\": 30237,\n" +
                "        \"population_density\": 200.24503311258277\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Gambia\",\n" +
                "        \"area\": 10689.0,\n" +
                "        \"population\": 2416664,\n" +
                "        \"population_density\": 226.08887641500607\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Somalia\",\n" +
                "        \"area\": 637657.0,\n" +
                "        \"population\": 15893219,\n" +
                "        \"population_density\": 24.92440136311528\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Yemen\",\n" +
                "        \"area\": 527968.0,\n" +
                "        \"population\": 29825968,\n" +
                "        \"population_density\": 56.49199951512213\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Malaysia\",\n" +
                "        \"area\": 330803.0,\n" +
                "        \"population\": 32365998,\n" +
                "        \"population_density\": 97.84070277476323\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dominica\",\n" +
                "        \"area\": 751.0,\n" +
                "        \"population\": 71991,\n" +
                "        \"population_density\": 95.8601864181092\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"United Kingdom\",\n" +
                "        \"area\": 242900.0,\n" +
                "        \"population\": 67215293,\n" +
                "        \"population_density\": 276.7200205846027\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Madagascar\",\n" +
                "        \"area\": 587041.0,\n" +
                "        \"population\": 27691019,\n" +
                "        \"population_density\": 47.170502571370655\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Western Sahara\",\n" +
                "        \"area\": 266000.0,\n" +
                "        \"population\": 510713,\n" +
                "        \"population_density\": 1.9199736842105264\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cyprus\",\n" +
                "        \"area\": 9251.0,\n" +
                "        \"population\": 1207361,\n" +
                "        \"population_density\": 130.51140417252188\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Antigua and Barbuda\",\n" +
                "        \"area\": 442.0,\n" +
                "        \"population\": 97928,\n" +
                "        \"population_density\": 221.55656108597285\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ireland\",\n" +
                "        \"area\": 70273.0,\n" +
                "        \"population\": 4994724,\n" +
                "        \"population_density\": 71.07600358601454\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Paraguay\",\n" +
                "        \"area\": 406752.0,\n" +
                "        \"population\": 7132530,\n" +
                "        \"population_density\": 17.53532865234836\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sri Lanka\",\n" +
                "        \"area\": 65610.0,\n" +
                "        \"population\": 21919000,\n" +
                "        \"population_density\": 334.08017070568513\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"South Africa\",\n" +
                "        \"area\": 1221037.0,\n" +
                "        \"population\": 59308690,\n" +
                "        \"population_density\": 48.57239379314468\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kuwait\",\n" +
                "        \"area\": 17818.0,\n" +
                "        \"population\": 4270563,\n" +
                "        \"population_density\": 239.67689976428332\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Algeria\",\n" +
                "        \"area\": 2381741.0,\n" +
                "        \"population\": 44700000,\n" +
                "        \"population_density\": 18.7677837346714\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Croatia\",\n" +
                "        \"area\": 56594.0,\n" +
                "        \"population\": 4047200,\n" +
                "        \"population_density\": 71.51288122415804\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Martinique\",\n" +
                "        \"area\": 1128.0,\n" +
                "        \"population\": 378243,\n" +
                "        \"population_density\": 335.3218085106383\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sierra Leone\",\n" +
                "        \"area\": 71740.0,\n" +
                "        \"population\": 7976985,\n" +
                "        \"population_density\": 111.19298856983552\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Northern Mariana Islands\",\n" +
                "        \"area\": 464.0,\n" +
                "        \"population\": 57557,\n" +
                "        \"population_density\": 124.04525862068965\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Rwanda\",\n" +
                "        \"area\": 26338.0,\n" +
                "        \"population\": 12952209,\n" +
                "        \"population_density\": 491.76888905763536\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Syria\",\n" +
                "        \"area\": 185180.0,\n" +
                "        \"population\": 17500657,\n" +
                "        \"population_density\": 94.50619397343125\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Vincent and the Grenadines\",\n" +
                "        \"area\": 389.0,\n" +
                "        \"population\": 110947,\n" +
                "        \"population_density\": 285.2107969151671\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kosovo\",\n" +
                "        \"area\": 10908.0,\n" +
                "        \"population\": 1775378,\n" +
                "        \"population_density\": 162.75925925925927\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Lucia\",\n" +
                "        \"area\": 616.0,\n" +
                "        \"population\": 183629,\n" +
                "        \"population_density\": 298.09902597402595\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Honduras\",\n" +
                "        \"area\": 112492.0,\n" +
                "        \"population\": 9904608,\n" +
                "        \"population_density\": 88.04722113572521\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jordan\",\n" +
                "        \"area\": 89342.0,\n" +
                "        \"population\": 10203140,\n" +
                "        \"population_density\": 114.20317431890936\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tuvalu\",\n" +
                "        \"area\": 26.0,\n" +
                "        \"population\": 11792,\n" +
                "        \"population_density\": 453.53846153846155\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nepal\",\n" +
                "        \"area\": 147181.0,\n" +
                "        \"population\": 29136808,\n" +
                "        \"population_density\": 197.9658243930942\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Liberia\",\n" +
                "        \"area\": 111369.0,\n" +
                "        \"population\": 5057677,\n" +
                "        \"population_density\": 45.41368783054531\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Heard Island and McDonald Islands\",\n" +
                "        \"area\": 412.0,\n" +
                "        \"population\": 0,\n" +
                "        \"population_density\": 0.0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Austria\",\n" +
                "        \"area\": 83871.0,\n" +
                "        \"population\": 8917205,\n" +
                "        \"population_density\": 106.32048026135375\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guernsey\",\n" +
                "        \"area\": 78.0,\n" +
                "        \"population\": 62999,\n" +
                "        \"population_density\": 807.6794871794872\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Central African Republic\",\n" +
                "        \"area\": 622984.0,\n" +
                "        \"population\": 4829764,\n" +
                "        \"population_density\": 7.752629281008822\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mauritania\",\n" +
                "        \"area\": 1030700.0,\n" +
                "        \"population\": 4649660,\n" +
                "        \"population_density\": 4.511167167944116\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Djibouti\",\n" +
                "        \"area\": 23200.0,\n" +
                "        \"population\": 988002,\n" +
                "        \"population_density\": 42.58629310344828\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Fiji\",\n" +
                "        \"area\": 18272.0,\n" +
                "        \"population\": 896444,\n" +
                "        \"population_density\": 49.06107705779335\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Norway\",\n" +
                "        \"area\": 323802.0,\n" +
                "        \"population\": 5379475,\n" +
                "        \"population_density\": 16.613470577698717\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Latvia\",\n" +
                "        \"area\": 64559.0,\n" +
                "        \"population\": 1901548,\n" +
                "        \"population_density\": 29.454421536888738\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Falkland Islands\",\n" +
                "        \"area\": 12173.0,\n" +
                "        \"population\": 2563,\n" +
                "        \"population_density\": 0.21054793395218926\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kazakhstan\",\n" +
                "        \"area\": 2724900.0,\n" +
                "        \"population\": 18754440,\n" +
                "        \"population_density\": 6.882615875811957\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Åland Islands\",\n" +
                "        \"area\": 1580.0,\n" +
                "        \"population\": 29458,\n" +
                "        \"population_density\": 18.644303797468353\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Turkmenistan\",\n" +
                "        \"area\": 488100.0,\n" +
                "        \"population\": 6031187,\n" +
                "        \"population_density\": 12.356457693095678\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cocos (Keeling) Islands\",\n" +
                "        \"area\": 14.0,\n" +
                "        \"population\": 544,\n" +
                "        \"population_density\": 38.857142857142854\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bulgaria\",\n" +
                "        \"area\": 110879.0,\n" +
                "        \"population\": 6927288,\n" +
                "        \"population_density\": 62.476104582472786\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tokelau\",\n" +
                "        \"area\": 12.0,\n" +
                "        \"population\": 1411,\n" +
                "        \"population_density\": 117.58333333333333\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"New Caledonia\",\n" +
                "        \"area\": 18575.0,\n" +
                "        \"population\": 271960,\n" +
                "        \"population_density\": 14.641184387617766\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Barbados\",\n" +
                "        \"area\": 430.0,\n" +
                "        \"population\": 287371,\n" +
                "        \"population_density\": 668.3046511627907\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"São Tomé and Príncipe\",\n" +
                "        \"area\": 964.0,\n" +
                "        \"population\": 219161,\n" +
                "        \"population_density\": 227.3454356846473\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Antarctica\",\n" +
                "        \"area\": 1.4E7,\n" +
                "        \"population\": 1000,\n" +
                "        \"population_density\": 7.142857142857143E-5\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Brunei\",\n" +
                "        \"area\": 5765.0,\n" +
                "        \"population\": 437483,\n" +
                "        \"population_density\": 75.88603642671292\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bhutan\",\n" +
                "        \"area\": 38394.0,\n" +
                "        \"population\": 771612,\n" +
                "        \"population_density\": 20.09720268791999\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cameroon\",\n" +
                "        \"area\": 475442.0,\n" +
                "        \"population\": 26545864,\n" +
                "        \"population_density\": 55.834074398138995\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Argentina\",\n" +
                "        \"area\": 2780400.0,\n" +
                "        \"population\": 45376763,\n" +
                "        \"population_density\": 16.320228384405123\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Azerbaijan\",\n" +
                "        \"area\": 86600.0,\n" +
                "        \"population\": 10110116,\n" +
                "        \"population_density\": 116.74498845265589\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mexico\",\n" +
                "        \"area\": 1964375.0,\n" +
                "        \"population\": 128932753,\n" +
                "        \"population_density\": 65.63550900413618\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Morocco\",\n" +
                "        \"area\": 446550.0,\n" +
                "        \"population\": 36910558,\n" +
                "        \"population_density\": 82.65716717052962\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guatemala\",\n" +
                "        \"area\": 108889.0,\n" +
                "        \"population\": 16858333,\n" +
                "        \"population_density\": 154.82126752931885\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kenya\",\n" +
                "        \"area\": 580367.0,\n" +
                "        \"population\": 53771300,\n" +
                "        \"population_density\": 92.65051252052581\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Malta\",\n" +
                "        \"area\": 316.0,\n" +
                "        \"population\": 525285,\n" +
                "        \"population_density\": 1662.2943037974683\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Czechia\",\n" +
                "        \"area\": 78865.0,\n" +
                "        \"population\": 10698896,\n" +
                "        \"population_density\": 135.66088886071134\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Gibraltar\",\n" +
                "        \"area\": 6.0,\n" +
                "        \"population\": 33691,\n" +
                "        \"population_density\": 5615.166666666667\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Aruba\",\n" +
                "        \"area\": 180.0,\n" +
                "        \"population\": 106766,\n" +
                "        \"population_density\": 593.1444444444444\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Barthélemy\",\n" +
                "        \"area\": 21.0,\n" +
                "        \"population\": 4255,\n" +
                "        \"population_density\": 202.61904761904762\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Monaco\",\n" +
                "        \"area\": 2.02,\n" +
                "        \"population\": 39244,\n" +
                "        \"population_density\": 19427.722772277226\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"United Arab Emirates\",\n" +
                "        \"area\": 83600.0,\n" +
                "        \"population\": 9890400,\n" +
                "        \"population_density\": 118.30622009569377\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"South Sudan\",\n" +
                "        \"area\": 619745.0,\n" +
                "        \"population\": 11193729,\n" +
                "        \"population_density\": 18.06183026890092\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Puerto Rico\",\n" +
                "        \"area\": 8870.0,\n" +
                "        \"population\": 3194034,\n" +
                "        \"population_density\": 360.09402480270575\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"El Salvador\",\n" +
                "        \"area\": 21041.0,\n" +
                "        \"population\": 6486201,\n" +
                "        \"population_density\": 308.26486383727007\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"France\",\n" +
                "        \"area\": 551695.0,\n" +
                "        \"population\": 67391582,\n" +
                "        \"population_density\": 122.15369361694414\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Niger\",\n" +
                "        \"area\": 1267000.0,\n" +
                "        \"population\": 24206636,\n" +
                "        \"population_density\": 19.105474348855566\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ivory Coast\",\n" +
                "        \"area\": 322463.0,\n" +
                "        \"population\": 26378275,\n" +
                "        \"population_density\": 81.80248586659555\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"South Georgia\",\n" +
                "        \"area\": 3903.0,\n" +
                "        \"population\": 30,\n" +
                "        \"population_density\": 0.007686395080707148\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Botswana\",\n" +
                "        \"area\": 582000.0,\n" +
                "        \"population\": 2351625,\n" +
                "        \"population_density\": 4.040592783505154\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"British Indian Ocean Territory\",\n" +
                "        \"area\": 60.0,\n" +
                "        \"population\": 3000,\n" +
                "        \"population_density\": 50.0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Uzbekistan\",\n" +
                "        \"area\": 447400.0,\n" +
                "        \"population\": 34232050,\n" +
                "        \"population_density\": 76.51329906124273\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tunisia\",\n" +
                "        \"area\": 163610.0,\n" +
                "        \"population\": 11818618,\n" +
                "        \"population_density\": 72.23652588472588\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Hong Kong\",\n" +
                "        \"area\": 1104.0,\n" +
                "        \"population\": 7500700,\n" +
                "        \"population_density\": 6794.11231884058\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"North Macedonia\",\n" +
                "        \"area\": 25713.0,\n" +
                "        \"population\": 2077132,\n" +
                "        \"population_density\": 80.78139462528682\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Suriname\",\n" +
                "        \"area\": 163820.0,\n" +
                "        \"population\": 586634,\n" +
                "        \"population_density\": 3.580966914906605\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Belgium\",\n" +
                "        \"area\": 30528.0,\n" +
                "        \"population\": 11555997,\n" +
                "        \"population_density\": 378.53763757861634\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"American Samoa\",\n" +
                "        \"area\": 199.0,\n" +
                "        \"population\": 55197,\n" +
                "        \"population_density\": 277.3718592964824\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Solomon Islands\",\n" +
                "        \"area\": 28896.0,\n" +
                "        \"population\": 686878,\n" +
                "        \"population_density\": 23.770694905869323\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ukraine\",\n" +
                "        \"area\": 603500.0,\n" +
                "        \"population\": 44134693,\n" +
                "        \"population_density\": 73.13122286661144\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Finland\",\n" +
                "        \"area\": 338424.0,\n" +
                "        \"population\": 5530719,\n" +
                "        \"population_density\": 16.342573221757323\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Burkina Faso\",\n" +
                "        \"area\": 272967.0,\n" +
                "        \"population\": 20903278,\n" +
                "        \"population_density\": 76.5780405690065\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bosnia and Herzegovina\",\n" +
                "        \"area\": 51209.0,\n" +
                "        \"population\": 3280815,\n" +
                "        \"population_density\": 64.06715616395556\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Iran\",\n" +
                "        \"area\": 1648195.0,\n" +
                "        \"population\": 83992953,\n" +
                "        \"population_density\": 50.96056777262399\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cuba\",\n" +
                "        \"area\": 109884.0,\n" +
                "        \"population\": 11326616,\n" +
                "        \"population_density\": 103.07793673328237\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Eritrea\",\n" +
                "        \"area\": 117600.0,\n" +
                "        \"population\": 5352000,\n" +
                "        \"population_density\": 45.51020408163265\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Slovakia\",\n" +
                "        \"area\": 49037.0,\n" +
                "        \"population\": 5458827,\n" +
                "        \"population_density\": 111.32057426025246\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lithuania\",\n" +
                "        \"area\": 65300.0,\n" +
                "        \"population\": 2794700,\n" +
                "        \"population_density\": 42.797856049004594\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Martin\",\n" +
                "        \"area\": 53.0,\n" +
                "        \"population\": 38659,\n" +
                "        \"population_density\": 729.4150943396227\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pitcairn Islands\",\n" +
                "        \"area\": 47.0,\n" +
                "        \"population\": 56,\n" +
                "        \"population_density\": 1.1914893617021276\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guinea-Bissau\",\n" +
                "        \"area\": 36125.0,\n" +
                "        \"population\": 1967998,\n" +
                "        \"population_density\": 54.47745328719723\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Montserrat\",\n" +
                "        \"area\": 102.0,\n" +
                "        \"population\": 4922,\n" +
                "        \"population_density\": 48.254901960784316\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Turkey\",\n" +
                "        \"area\": 783562.0,\n" +
                "        \"population\": 84339067,\n" +
                "        \"population_density\": 107.63547364471478\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Philippines\",\n" +
                "        \"area\": 342353.0,\n" +
                "        \"population\": 109581085,\n" +
                "        \"population_density\": 320.0821520477402\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vanuatu\",\n" +
                "        \"area\": 12189.0,\n" +
                "        \"population\": 307150,\n" +
                "        \"population_density\": 25.198949872836163\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bolivia\",\n" +
                "        \"area\": 1098581.0,\n" +
                "        \"population\": 11673029,\n" +
                "        \"population_density\": 10.625551506898445\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Kitts and Nevis\",\n" +
                "        \"area\": 261.0,\n" +
                "        \"population\": 53192,\n" +
                "        \"population_density\": 203.8007662835249\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Romania\",\n" +
                "        \"area\": 238391.0,\n" +
                "        \"population\": 19286123,\n" +
                "        \"population_density\": 80.90122110314567\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cambodia\",\n" +
                "        \"area\": 181035.0,\n" +
                "        \"population\": 16718971,\n" +
                "        \"population_density\": 92.35214737481702\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Zimbabwe\",\n" +
                "        \"area\": 390757.0,\n" +
                "        \"population\": 14862927,\n" +
                "        \"population_density\": 38.03623991380832\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jersey\",\n" +
                "        \"area\": 116.0,\n" +
                "        \"population\": 100800,\n" +
                "        \"population_density\": 868.9655172413793\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kyrgyzstan\",\n" +
                "        \"area\": 199951.0,\n" +
                "        \"population\": 6591600,\n" +
                "        \"population_density\": 32.96607668878875\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Caribbean Netherlands\",\n" +
                "        \"area\": 328.0,\n" +
                "        \"population\": 25987,\n" +
                "        \"population_density\": 79.22865853658537\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guyana\",\n" +
                "        \"area\": 214969.0,\n" +
                "        \"population\": 786559,\n" +
                "        \"population_density\": 3.6589415218008177\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"United States Minor Outlying Islands\",\n" +
                "        \"area\": 34.2,\n" +
                "        \"population\": 300,\n" +
                "        \"population_density\": 8.771929824561402\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Armenia\",\n" +
                "        \"area\": 29743.0,\n" +
                "        \"population\": 2963234,\n" +
                "        \"population_density\": 99.62794607134452\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lebanon\",\n" +
                "        \"area\": 10452.0,\n" +
                "        \"population\": 6825442,\n" +
                "        \"population_density\": 653.0273631840796\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Montenegro\",\n" +
                "        \"area\": 13812.0,\n" +
                "        \"population\": 621718,\n" +
                "        \"population_density\": 45.01288734433825\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Greenland\",\n" +
                "        \"area\": 2166086.0,\n" +
                "        \"population\": 56367,\n" +
                "        \"population_density\": 0.02602251249488709\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Papua New Guinea\",\n" +
                "        \"area\": 462840.0,\n" +
                "        \"population\": 8947027,\n" +
                "        \"population_density\": 19.330712557255207\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Zambia\",\n" +
                "        \"area\": 752612.0,\n" +
                "        \"population\": 18383956,\n" +
                "        \"population_density\": 24.42687068502761\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Trinidad and Tobago\",\n" +
                "        \"area\": 5130.0,\n" +
                "        \"population\": 1399491,\n" +
                "        \"population_density\": 272.80526315789473\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"French Southern and Antarctic Lands\",\n" +
                "        \"area\": 7747.0,\n" +
                "        \"population\": 400,\n" +
                "        \"population_density\": 0.051632890151026206\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Peru\",\n" +
                "        \"area\": 1285216.0,\n" +
                "        \"population\": 32971846,\n" +
                "        \"population_density\": 25.654711737171027\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sweden\",\n" +
                "        \"area\": 450295.0,\n" +
                "        \"population\": 10353442,\n" +
                "        \"population_density\": 22.99257597797\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sudan\",\n" +
                "        \"area\": 1886068.0,\n" +
                "        \"population\": 43849269,\n" +
                "        \"population_density\": 23.249039271118537\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Pierre and Miquelon\",\n" +
                "        \"area\": 242.0,\n" +
                "        \"population\": 6069,\n" +
                "        \"population_density\": 25.078512396694215\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Oman\",\n" +
                "        \"area\": 309500.0,\n" +
                "        \"population\": 5106622,\n" +
                "        \"population_density\": 16.499586429725362\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"India\",\n" +
                "        \"area\": 3287590.0,\n" +
                "        \"population\": 1380004385,\n" +
                "        \"population_density\": 419.7617053829705\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Taiwan\",\n" +
                "        \"area\": 36193.0,\n" +
                "        \"population\": 23503349,\n" +
                "        \"population_density\": 649.3893570579946\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mongolia\",\n" +
                "        \"area\": 1564110.0,\n" +
                "        \"population\": 3278292,\n" +
                "        \"population_density\": 2.0959472159886454\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Senegal\",\n" +
                "        \"area\": 196722.0,\n" +
                "        \"population\": 16743930,\n" +
                "        \"population_density\": 85.11467959862141\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tanzania\",\n" +
                "        \"area\": 945087.0,\n" +
                "        \"population\": 59734213,\n" +
                "        \"population_density\": 63.204988535447\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Canada\",\n" +
                "        \"area\": 9984670.0,\n" +
                "        \"population\": 38005238,\n" +
                "        \"population_density\": 3.8063589482676945\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Costa Rica\",\n" +
                "        \"area\": 51100.0,\n" +
                "        \"population\": 5094114,\n" +
                "        \"population_density\": 99.6891193737769\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"China\",\n" +
                "        \"area\": 9706961.0,\n" +
                "        \"population\": 1402112000,\n" +
                "        \"population_density\": 144.44397170236905\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Colombia\",\n" +
                "        \"area\": 1141748.0,\n" +
                "        \"population\": 50882884,\n" +
                "        \"population_density\": 44.565774584234\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Myanmar\",\n" +
                "        \"area\": 676578.0,\n" +
                "        \"population\": 54409794,\n" +
                "        \"population_density\": 80.4191002367798\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Russia\",\n" +
                "        \"area\": 1.7098242E7,\n" +
                "        \"population\": 144104080,\n" +
                "        \"population_density\": 8.42800563941018\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"North Korea\",\n" +
                "        \"area\": 120538.0,\n" +
                "        \"population\": 25778815,\n" +
                "        \"population_density\": 213.86463190031358\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cayman Islands\",\n" +
                "        \"area\": 264.0,\n" +
                "        \"population\": 65720,\n" +
                "        \"population_density\": 248.93939393939394\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bouvet Island\",\n" +
                "        \"area\": 49.0,\n" +
                "        \"population\": 0,\n" +
                "        \"population_density\": 0.0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Belarus\",\n" +
                "        \"area\": 207600.0,\n" +
                "        \"population\": 9398861,\n" +
                "        \"population_density\": 45.27389691714836\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Portugal\",\n" +
                "        \"area\": 92090.0,\n" +
                "        \"population\": 10305564,\n" +
                "        \"population_density\": 111.90752524704094\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Eswatini\",\n" +
                "        \"area\": 17364.0,\n" +
                "        \"population\": 1160164,\n" +
                "        \"population_density\": 66.81432849573831\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Poland\",\n" +
                "        \"area\": 312679.0,\n" +
                "        \"population\": 37950802,\n" +
                "        \"population_density\": 121.37304392044237\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Switzerland\",\n" +
                "        \"area\": 41284.0,\n" +
                "        \"population\": 8654622,\n" +
                "        \"population_density\": 209.63622710977617\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Republic of the Congo\",\n" +
                "        \"area\": 342000.0,\n" +
                "        \"population\": 5657000,\n" +
                "        \"population_density\": 16.54093567251462\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Venezuela\",\n" +
                "        \"area\": 916445.0,\n" +
                "        \"population\": 28435943,\n" +
                "        \"population_density\": 31.028531990463147\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Panama\",\n" +
                "        \"area\": 75417.0,\n" +
                "        \"population\": 4314768,\n" +
                "        \"population_density\": 57.21214049882652\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Netherlands\",\n" +
                "        \"area\": 41850.0,\n" +
                "        \"population\": 16655799,\n" +
                "        \"population_density\": 397.9880286738351\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Samoa\",\n" +
                "        \"area\": 2842.0,\n" +
                "        \"population\": 198410,\n" +
                "        \"population_density\": 69.81351161154117\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Denmark\",\n" +
                "        \"area\": 43094.0,\n" +
                "        \"population\": 5831404,\n" +
                "        \"population_density\": 135.3182345570149\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Luxembourg\",\n" +
                "        \"area\": 2586.0,\n" +
                "        \"population\": 632275,\n" +
                "        \"population_density\": 244.49922660479504\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Faroe Islands\",\n" +
                "        \"area\": 1393.0,\n" +
                "        \"population\": 48865,\n" +
                "        \"population_density\": 35.07896625987078\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Slovenia\",\n" +
                "        \"area\": 20273.0,\n" +
                "        \"population\": 2100126,\n" +
                "        \"population_density\": 103.59226557490258\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Togo\",\n" +
                "        \"area\": 56785.0,\n" +
                "        \"population\": 8278737,\n" +
                "        \"population_density\": 145.79091309324644\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Thailand\",\n" +
                "        \"area\": 513120.0,\n" +
                "        \"population\": 69799978,\n" +
                "        \"population_density\": 136.030515279077\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Wallis and Futuna\",\n" +
                "        \"area\": 142.0,\n" +
                "        \"population\": 11750,\n" +
                "        \"population_density\": 82.74647887323944\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bahamas\",\n" +
                "        \"area\": 13943.0,\n" +
                "        \"population\": 393248,\n" +
                "        \"population_density\": 28.203973319945494\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tonga\",\n" +
                "        \"area\": 747.0,\n" +
                "        \"population\": 105697,\n" +
                "        \"population_density\": 141.49531459170012\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Greece\",\n" +
                "        \"area\": 131990.0,\n" +
                "        \"population\": 10715549,\n" +
                "        \"population_density\": 81.1845518599894\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"San Marino\",\n" +
                "        \"area\": 61.0,\n" +
                "        \"population\": 33938,\n" +
                "        \"population_density\": 556.360655737705\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Réunion\",\n" +
                "        \"area\": 2511.0,\n" +
                "        \"population\": 840974,\n" +
                "        \"population_density\": 334.91596973317405\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vatican City\",\n" +
                "        \"area\": 0.44,\n" +
                "        \"population\": 451,\n" +
                "        \"population_density\": 1025.0\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Burundi\",\n" +
                "        \"area\": 27834.0,\n" +
                "        \"population\": 11890781,\n" +
                "        \"population_density\": 427.2034562046418\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bahrain\",\n" +
                "        \"area\": 765.0,\n" +
                "        \"population\": 1701583,\n" +
                "        \"population_density\": 2224.291503267974\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Marshall Islands\",\n" +
                "        \"area\": 181.0,\n" +
                "        \"population\": 59194,\n" +
                "        \"population_density\": 327.03867403314916\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Turks and Caicos Islands\",\n" +
                "        \"area\": 948.0,\n" +
                "        \"population\": 38718,\n" +
                "        \"population_density\": 40.84177215189873\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Isle of Man\",\n" +
                "        \"area\": 572.0,\n" +
                "        \"population\": 85032,\n" +
                "        \"population_density\": 148.65734265734267\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Haiti\",\n" +
                "        \"area\": 27750.0,\n" +
                "        \"population\": 11402533,\n" +
                "        \"population_density\": 410.9020900900901\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Afghanistan\",\n" +
                "        \"area\": 652230.0,\n" +
                "        \"population\": 40218234,\n" +
                "        \"population_density\": 61.6626558116002\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Israel\",\n" +
                "        \"area\": 20770.0,\n" +
                "        \"population\": 9216900,\n" +
                "        \"population_density\": 443.76023110255176\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Libya\",\n" +
                "        \"area\": 1759540.0,\n" +
                "        \"population\": 6871287,\n" +
                "        \"population_density\": 3.9051610079907246\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Uruguay\",\n" +
                "        \"area\": 181034.0,\n" +
                "        \"population\": 3473727,\n" +
                "        \"population_density\": 19.18825745440083\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Norfolk Island\",\n" +
                "        \"area\": 36.0,\n" +
                "        \"population\": 2302,\n" +
                "        \"population_density\": 63.94444444444444\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nicaragua\",\n" +
                "        \"area\": 130373.0,\n" +
                "        \"population\": 6624554,\n" +
                "        \"population_density\": 50.81231543341029\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cook Islands\",\n" +
                "        \"area\": 236.0,\n" +
                "        \"population\": 18100,\n" +
                "        \"population_density\": 76.69491525423729\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Laos\",\n" +
                "        \"area\": 236800.0,\n" +
                "        \"population\": 7275556,\n" +
                "        \"population_density\": 30.724476351351353\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Christmas Island\",\n" +
                "        \"area\": 135.0,\n" +
                "        \"population\": 2072,\n" +
                "        \"population_density\": 15.348148148148148\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saint Helena, Ascension and Tristan da Cunha\",\n" +
                "        \"area\": 394.0,\n" +
                "        \"population\": 53192,\n" +
                "        \"population_density\": 135.00507614213197\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Anguilla\",\n" +
                "        \"area\": 91.0,\n" +
                "        \"population\": 13452,\n" +
                "        \"population_density\": 147.82417582417582\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Micronesia\",\n" +
                "        \"area\": 702.0,\n" +
                "        \"population\": 115021,\n" +
                "        \"population_density\": 163.84757834757835\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Germany\",\n" +
                "        \"area\": 357114.0,\n" +
                "        \"population\": 83240525,\n" +
                "        \"population_density\": 233.09230385815175\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guam\",\n" +
                "        \"area\": 549.0,\n" +
                "        \"population\": 168783,\n" +
                "        \"population_density\": 307.43715846994536\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kiribati\",\n" +
                "        \"area\": 811.0,\n" +
                "        \"population\": 119446,\n" +
                "        \"population_density\": 147.28236744759556\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sint Maarten\",\n" +
                "        \"area\": 34.0,\n" +
                "        \"population\": 40812,\n" +
                "        \"population_density\": 1200.3529411764705\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Spain\",\n" +
                "        \"area\": 505992.0,\n" +
                "        \"population\": 47351567,\n" +
                "        \"population_density\": 93.58165148856108\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jamaica\",\n" +
                "        \"area\": 10991.0,\n" +
                "        \"population\": 2961161,\n" +
                "        \"population_density\": 269.4168865435356\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Palestine\",\n" +
                "        \"area\": 6220.0,\n" +
                "        \"population\": 4803269,\n" +
                "        \"population_density\": 772.2297427652733\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"French Guiana\",\n" +
                "        \"area\": 83534.0,\n" +
                "        \"population\": 254541,\n" +
                "        \"population_density\": 3.047154452079393\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Andorra\",\n" +
                "        \"area\": 468.0,\n" +
                "        \"population\": 77265,\n" +
                "        \"population_density\": 165.09615384615384\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Chile\",\n" +
                "        \"area\": 756102.0,\n" +
                "        \"population\": 19116209,\n" +
                "        \"population_density\": 25.282579599048805\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lesotho\",\n" +
                "        \"area\": 30355.0,\n" +
                "        \"population\": 2142252,\n" +
                "        \"population_density\": 70.57328281996377\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Australia\",\n" +
                "        \"area\": 7692024.0,\n" +
                "        \"population\": 25687041,\n" +
                "        \"population_density\": 3.3394384884914556\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Grenada\",\n" +
                "        \"area\": 344.0,\n" +
                "        \"population\": 112519,\n" +
                "        \"population_density\": 327.0901162790698\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ghana\",\n" +
                "        \"area\": 238533.0,\n" +
                "        \"population\": 31072945,\n" +
                "        \"population_density\": 130.26686035055945\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Seychelles\",\n" +
                "        \"area\": 452.0,\n" +
                "        \"population\": 98462,\n" +
                "        \"population_density\": 217.8362831858407\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Angola\",\n" +
                "        \"area\": 1246700.0,\n" +
                "        \"population\": 32866268,\n" +
                "        \"population_density\": 26.36261169487447\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bermuda\",\n" +
                "        \"area\": 54.0,\n" +
                "        \"population\": 63903,\n" +
                "        \"population_density\": 1183.388888888889\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pakistan\",\n" +
                "        \"area\": 881912.0,\n" +
                "        \"population\": 220892331,\n" +
                "        \"population_density\": 250.4698099130072\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mali\",\n" +
                "        \"area\": 1240192.0,\n" +
                "        \"population\": 20250834,\n" +
                "        \"population_density\": 16.328789413252142\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Saudi Arabia\",\n" +
                "        \"area\": 2149690.0,\n" +
                "        \"population\": 34813867,\n" +
                "        \"population_density\": 16.194831347775725\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Curaçao\",\n" +
                "        \"area\": 444.0,\n" +
                "        \"population\": 155014,\n" +
                "        \"population_density\": 349.1306306306306\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"South Korea\",\n" +
                "        \"area\": 100210.0,\n" +
                "        \"population\": 51780579,\n" +
                "        \"population_density\": 516.7206765791838\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ethiopia\",\n" +
                "        \"area\": 1104300.0,\n" +
                "        \"population\": 114963583,\n" +
                "        \"population_density\": 104.1053907452685\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guadeloupe\",\n" +
                "        \"area\": 1628.0,\n" +
                "        \"population\": 400132,\n" +
                "        \"population_density\": 245.78132678132678\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bangladesh\",\n" +
                "        \"area\": 147570.0,\n" +
                "        \"population\": 164689383,\n" +
                "        \"population_density\": 1116.008558650132\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"New Zealand\",\n" +
                "        \"area\": 270467.0,\n" +
                "        \"population\": 5084300,\n" +
                "        \"population_density\": 18.79822677073358\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Comoros\",\n" +
                "        \"area\": 1862.0,\n" +
                "        \"population\": 869595,\n" +
                "        \"population_density\": 467.0220193340494\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Belize\",\n" +
                "        \"area\": 22966.0,\n" +
                "        \"population\": 397621,\n" +
                "        \"population_density\": 17.313463380649655\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Uganda\",\n" +
                "        \"area\": 241550.0,\n" +
                "        \"population\": 45741000,\n" +
                "        \"population_density\": 189.36452080314635\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Singapore\",\n" +
                "        \"area\": 710.0,\n" +
                "        \"population\": 5685807,\n" +
                "        \"population_density\": 8008.178873239437\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Liechtenstein\",\n" +
                "        \"area\": 160.0,\n" +
                "        \"population\": 38137,\n" +
                "        \"population_density\": 238.35625\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Hungary\",\n" +
                "        \"area\": 93028.0,\n" +
                "        \"population\": 9749763,\n" +
                "        \"population_density\": 104.80460721503204\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Iceland\",\n" +
                "        \"area\": 103000.0,\n" +
                "        \"population\": 366425,\n" +
                "        \"population_density\": 3.55752427184466\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tajikistan\",\n" +
                "        \"area\": 143100.0,\n" +
                "        \"population\": 9537642,\n" +
                "        \"population_density\": 66.65018867924529\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Namibia\",\n" +
                "        \"area\": 825615.0,\n" +
                "        \"population\": 2540916,\n" +
                "        \"population_density\": 3.0776039679511635\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Timor-Leste\",\n" +
                "        \"area\": 14874.0,\n" +
                "        \"population\": 1318442,\n" +
                "        \"population_density\": 88.64071534220788\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Egypt\",\n" +
                "        \"area\": 1002450.0,\n" +
                "        \"population\": 102334403,\n" +
                "        \"population_density\": 102.08429647363958\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Serbia\",\n" +
                "        \"area\": 88361.0,\n" +
                "        \"population\": 6908224,\n" +
                "        \"population_density\": 78.1818222971673\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mauritius\",\n" +
                "        \"area\": 2040.0,\n" +
                "        \"population\": 1265740,\n" +
                "        \"population_density\": 620.4607843137255\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Macau\",\n" +
                "        \"area\": 30.0,\n" +
                "        \"population\": 649342,\n" +
                "        \"population_density\": 21644.733333333334\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"French Polynesia\",\n" +
                "        \"area\": 4167.0,\n" +
                "        \"population\": 280904,\n" +
                "        \"population_density\": 67.41156707463404\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Maldives\",\n" +
                "        \"area\": 300.0,\n" +
                "        \"population\": 540542,\n" +
                "        \"population_density\": 1801.8066666666666\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Indonesia\",\n" +
                "        \"area\": 1904569.0,\n" +
                "        \"population\": 273523621,\n" +
                "        \"population_density\": 143.6144455779759\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"DR Congo\",\n" +
                "        \"area\": 2344858.0,\n" +
                "        \"population\": 108407721,\n" +
                "        \"population_density\": 46.23210488652191\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Estonia\",\n" +
                "        \"area\": 45227.0,\n" +
                "        \"population\": 1331057,\n" +
                "        \"population_density\": 29.430583501006037\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vietnam\",\n" +
                "        \"area\": 331212.0,\n" +
                "        \"population\": 97338583,\n" +
                "        \"population_density\": 293.88603975701363\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Italy\",\n" +
                "        \"area\": 301336.0,\n" +
                "        \"population\": 59554023,\n" +
                "        \"population_density\": 197.63328311253883\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Guinea\",\n" +
                "        \"area\": 245857.0,\n" +
                "        \"population\": 13132792,\n" +
                "        \"population_density\": 53.41638432096707\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Chad\",\n" +
                "        \"area\": 1284000.0,\n" +
                "        \"population\": 16425859,\n" +
                "        \"population_density\": 12.79272507788162\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ecuador\",\n" +
                "        \"area\": 276841.0,\n" +
                "        \"population\": 17643060,\n" +
                "        \"population_density\": 63.72993884576345\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Georgia\",\n" +
                "        \"area\": 69700.0,\n" +
                "        \"population\": 3714000,\n" +
                "        \"population_density\": 53.285509325681495\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Malawi\",\n" +
                "        \"area\": 118484.0,\n" +
                "        \"population\": 19129955,\n" +
                "        \"population_density\": 161.45601937814388\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Iraq\",\n" +
                "        \"area\": 438317.0,\n" +
                "        \"population\": 40222503,\n" +
                "        \"population_density\": 91.76578366798459\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Svalbard and Jan Mayen\",\n" +
                "        \"area\": 61399.0,\n" +
                "        \"population\": 2562,\n" +
                "        \"population_density\": 0.041727063958696395\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Benin\",\n" +
                "        \"area\": 112622.0,\n" +
                "        \"population\": 12123198,\n" +
                "        \"population_density\": 107.64502495072011\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Japan\",\n" +
                "        \"area\": 377930.0,\n" +
                "        \"population\": 125836021,\n" +
                "        \"population_density\": 332.9611859339031\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dominican Republic\",\n" +
                "        \"area\": 48671.0,\n" +
                "        \"population\": 10847904,\n" +
                "        \"population_density\": 222.8822913028292\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Qatar\",\n" +
                "        \"area\": 11586.0,\n" +
                "        \"population\": 2881060,\n" +
                "        \"population_density\": 248.6673571551873\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Gabon\",\n" +
                "        \"area\": 267668.0,\n" +
                "        \"population\": 2225728,\n" +
                "        \"population_density\": 8.315256212920483\n" +
                "    }\n" +
                "]";

        List<CountryDensity> countryDensities = List.of(objectMapper.readValue(COUNTRY_DENSITIES_RESPONSE, CountryDensity[].class));
        return countryDensities;
    }

    public static List<CountryDensity> sortedCountryDensitiesRs() throws JsonProcessingException {
        String COUNTRY_DENSITIES_RESPONSE = "[\n" +
                "        {\n" +
                "            \"name\": \"Macau\",\n" +
                "            \"area\": 30.0,\n" +
                "            \"population\": 649342,\n" +
                "            \"population_density\": 21644.733333333334\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Monaco\",\n" +
                "            \"area\": 2.02,\n" +
                "            \"population\": 39244,\n" +
                "            \"population_density\": 19427.722772277226\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Singapore\",\n" +
                "            \"area\": 710.0,\n" +
                "            \"population\": 5685807,\n" +
                "            \"population_density\": 8008.178873239437\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Hong Kong\",\n" +
                "            \"area\": 1104.0,\n" +
                "            \"population\": 7500700,\n" +
                "            \"population_density\": 6794.11231884058\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gibraltar\",\n" +
                "            \"area\": 6.0,\n" +
                "            \"population\": 33691,\n" +
                "            \"population_density\": 5615.166666666667\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bahrain\",\n" +
                "            \"area\": 765.0,\n" +
                "            \"population\": 1701583,\n" +
                "            \"population_density\": 2224.291503267974\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Maldives\",\n" +
                "            \"area\": 300.0,\n" +
                "            \"population\": 540542,\n" +
                "            \"population_density\": 1801.8066666666666\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Malta\",\n" +
                "            \"area\": 316.0,\n" +
                "            \"population\": 525285,\n" +
                "            \"population_density\": 1662.2943037974683\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sint Maarten\",\n" +
                "            \"area\": 34.0,\n" +
                "            \"population\": 40812,\n" +
                "            \"population_density\": 1200.3529411764705\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bermuda\",\n" +
                "            \"area\": 54.0,\n" +
                "            \"population\": 63903,\n" +
                "            \"population_density\": 1183.388888888889\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bangladesh\",\n" +
                "            \"area\": 147570.0,\n" +
                "            \"population\": 164689383,\n" +
                "            \"population_density\": 1116.008558650132\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Vatican City\",\n" +
                "            \"area\": 0.44,\n" +
                "            \"population\": 451,\n" +
                "            \"population_density\": 1025.0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jersey\",\n" +
                "            \"area\": 116.0,\n" +
                "            \"population\": 100800,\n" +
                "            \"population_density\": 868.9655172413793\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guernsey\",\n" +
                "            \"area\": 78.0,\n" +
                "            \"population\": 62999,\n" +
                "            \"population_density\": 807.6794871794872\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Palestine\",\n" +
                "            \"area\": 6220.0,\n" +
                "            \"population\": 4803269,\n" +
                "            \"population_density\": 772.2297427652733\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Martin\",\n" +
                "            \"area\": 53.0,\n" +
                "            \"population\": 38659,\n" +
                "            \"population_density\": 729.4150943396227\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Barbados\",\n" +
                "            \"area\": 430.0,\n" +
                "            \"population\": 287371,\n" +
                "            \"population_density\": 668.3046511627907\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lebanon\",\n" +
                "            \"area\": 10452.0,\n" +
                "            \"population\": 6825442,\n" +
                "            \"population_density\": 653.0273631840796\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Taiwan\",\n" +
                "            \"area\": 36193.0,\n" +
                "            \"population\": 23503349,\n" +
                "            \"population_density\": 649.3893570579946\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mauritius\",\n" +
                "            \"area\": 2040.0,\n" +
                "            \"population\": 1265740,\n" +
                "            \"population_density\": 620.4607843137255\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mayotte\",\n" +
                "            \"area\": 374.0,\n" +
                "            \"population\": 226915,\n" +
                "            \"population_density\": 606.7245989304813\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Aruba\",\n" +
                "            \"area\": 180.0,\n" +
                "            \"population\": 106766,\n" +
                "            \"population_density\": 593.1444444444444\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"San Marino\",\n" +
                "            \"area\": 61.0,\n" +
                "            \"population\": 33938,\n" +
                "            \"population_density\": 556.360655737705\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"South Korea\",\n" +
                "            \"area\": 100210.0,\n" +
                "            \"population\": 51780579,\n" +
                "            \"population_density\": 516.7206765791838\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Nauru\",\n" +
                "            \"area\": 21.0,\n" +
                "            \"population\": 10834,\n" +
                "            \"population_density\": 515.9047619047619\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Rwanda\",\n" +
                "            \"area\": 26338.0,\n" +
                "            \"population\": 12952209,\n" +
                "            \"population_density\": 491.76888905763536\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Comoros\",\n" +
                "            \"area\": 1862.0,\n" +
                "            \"population\": 869595,\n" +
                "            \"population_density\": 467.0220193340494\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Tuvalu\",\n" +
                "            \"area\": 26.0,\n" +
                "            \"population\": 11792,\n" +
                "            \"population_density\": 453.53846153846155\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Israel\",\n" +
                "            \"area\": 20770.0,\n" +
                "            \"population\": 9216900,\n" +
                "            \"population_density\": 443.76023110255176\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Burundi\",\n" +
                "            \"area\": 27834.0,\n" +
                "            \"population\": 11890781,\n" +
                "            \"population_density\": 427.2034562046418\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"India\",\n" +
                "            \"area\": 3287590.0,\n" +
                "            \"population\": 1380004385,\n" +
                "            \"population_density\": 419.7617053829705\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Haiti\",\n" +
                "            \"area\": 27750.0,\n" +
                "            \"population\": 11402533,\n" +
                "            \"population_density\": 410.9020900900901\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Netherlands\",\n" +
                "            \"area\": 41850.0,\n" +
                "            \"population\": 16655799,\n" +
                "            \"population_density\": 397.9880286738351\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Belgium\",\n" +
                "            \"area\": 30528.0,\n" +
                "            \"population\": 11555997,\n" +
                "            \"population_density\": 378.53763757861634\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Puerto Rico\",\n" +
                "            \"area\": 8870.0,\n" +
                "            \"population\": 3194034,\n" +
                "            \"population_density\": 360.09402480270575\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Curaçao\",\n" +
                "            \"area\": 444.0,\n" +
                "            \"population\": 155014,\n" +
                "            \"population_density\": 349.1306306306306\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Martinique\",\n" +
                "            \"area\": 1128.0,\n" +
                "            \"population\": 378243,\n" +
                "            \"population_density\": 335.3218085106383\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Réunion\",\n" +
                "            \"area\": 2511.0,\n" +
                "            \"population\": 840974,\n" +
                "            \"population_density\": 334.91596973317405\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sri Lanka\",\n" +
                "            \"area\": 65610.0,\n" +
                "            \"population\": 21919000,\n" +
                "            \"population_density\": 334.08017070568513\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Japan\",\n" +
                "            \"area\": 377930.0,\n" +
                "            \"population\": 125836021,\n" +
                "            \"population_density\": 332.9611859339031\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Grenada\",\n" +
                "            \"area\": 344.0,\n" +
                "            \"population\": 112519,\n" +
                "            \"population_density\": 327.0901162790698\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Marshall Islands\",\n" +
                "            \"area\": 181.0,\n" +
                "            \"population\": 59194,\n" +
                "            \"population_density\": 327.03867403314916\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Philippines\",\n" +
                "            \"area\": 342353.0,\n" +
                "            \"population\": 109581085,\n" +
                "            \"population_density\": 320.0821520477402\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"El Salvador\",\n" +
                "            \"area\": 21041.0,\n" +
                "            \"population\": 6486201,\n" +
                "            \"population_density\": 308.26486383727007\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guam\",\n" +
                "            \"area\": 549.0,\n" +
                "            \"population\": 168783,\n" +
                "            \"population_density\": 307.43715846994536\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"United States Virgin Islands\",\n" +
                "            \"area\": 347.0,\n" +
                "            \"population\": 106290,\n" +
                "            \"population_density\": 306.31123919308357\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Lucia\",\n" +
                "            \"area\": 616.0,\n" +
                "            \"population\": 183629,\n" +
                "            \"population_density\": 298.09902597402595\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Vietnam\",\n" +
                "            \"area\": 331212.0,\n" +
                "            \"population\": 97338583,\n" +
                "            \"population_density\": 293.88603975701363\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Vincent and the Grenadines\",\n" +
                "            \"area\": 389.0,\n" +
                "            \"population\": 110947,\n" +
                "            \"population_density\": 285.2107969151671\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"American Samoa\",\n" +
                "            \"area\": 199.0,\n" +
                "            \"population\": 55197,\n" +
                "            \"population_density\": 277.3718592964824\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"United Kingdom\",\n" +
                "            \"area\": 242900.0,\n" +
                "            \"population\": 67215293,\n" +
                "            \"population_density\": 276.7200205846027\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Trinidad and Tobago\",\n" +
                "            \"area\": 5130.0,\n" +
                "            \"population\": 1399491,\n" +
                "            \"population_density\": 272.80526315789473\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jamaica\",\n" +
                "            \"area\": 10991.0,\n" +
                "            \"population\": 2961161,\n" +
                "            \"population_density\": 269.4168865435356\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pakistan\",\n" +
                "            \"area\": 881912.0,\n" +
                "            \"population\": 220892331,\n" +
                "            \"population_density\": 250.4698099130072\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cayman Islands\",\n" +
                "            \"area\": 264.0,\n" +
                "            \"population\": 65720,\n" +
                "            \"population_density\": 248.93939393939394\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Qatar\",\n" +
                "            \"area\": 11586.0,\n" +
                "            \"population\": 2881060,\n" +
                "            \"population_density\": 248.6673571551873\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guadeloupe\",\n" +
                "            \"area\": 1628.0,\n" +
                "            \"population\": 400132,\n" +
                "            \"population_density\": 245.78132678132678\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Luxembourg\",\n" +
                "            \"area\": 2586.0,\n" +
                "            \"population\": 632275,\n" +
                "            \"population_density\": 244.49922660479504\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kuwait\",\n" +
                "            \"area\": 17818.0,\n" +
                "            \"population\": 4270563,\n" +
                "            \"population_density\": 239.67689976428332\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Liechtenstein\",\n" +
                "            \"area\": 160.0,\n" +
                "            \"population\": 38137,\n" +
                "            \"population_density\": 238.35625\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Germany\",\n" +
                "            \"area\": 357114.0,\n" +
                "            \"population\": 83240525,\n" +
                "            \"population_density\": 233.09230385815175\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"São Tomé and Príncipe\",\n" +
                "            \"area\": 964.0,\n" +
                "            \"population\": 219161,\n" +
                "            \"population_density\": 227.3454356846473\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gambia\",\n" +
                "            \"area\": 10689.0,\n" +
                "            \"population\": 2416664,\n" +
                "            \"population_density\": 226.08887641500607\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Nigeria\",\n" +
                "            \"area\": 923768.0,\n" +
                "            \"population\": 206139587,\n" +
                "            \"population_density\": 223.1508203358419\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominican Republic\",\n" +
                "            \"area\": 48671.0,\n" +
                "            \"population\": 10847904,\n" +
                "            \"population_density\": 222.8822913028292\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Antigua and Barbuda\",\n" +
                "            \"area\": 442.0,\n" +
                "            \"population\": 97928,\n" +
                "            \"population_density\": 221.55656108597285\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Seychelles\",\n" +
                "            \"area\": 452.0,\n" +
                "            \"population\": 98462,\n" +
                "            \"population_density\": 217.8362831858407\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"North Korea\",\n" +
                "            \"area\": 120538.0,\n" +
                "            \"population\": 25778815,\n" +
                "            \"population_density\": 213.86463190031358\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Switzerland\",\n" +
                "            \"area\": 41284.0,\n" +
                "            \"population\": 8654622,\n" +
                "            \"population_density\": 209.63622710977617\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Kitts and Nevis\",\n" +
                "            \"area\": 261.0,\n" +
                "            \"population\": 53192,\n" +
                "            \"population_density\": 203.8007662835249\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Barthélemy\",\n" +
                "            \"area\": 21.0,\n" +
                "            \"population\": 4255,\n" +
                "            \"population_density\": 202.61904761904762\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"British Virgin Islands\",\n" +
                "            \"area\": 151.0,\n" +
                "            \"population\": 30237,\n" +
                "            \"population_density\": 200.24503311258277\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Nepal\",\n" +
                "            \"area\": 147181.0,\n" +
                "            \"population\": 29136808,\n" +
                "            \"population_density\": 197.9658243930942\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Italy\",\n" +
                "            \"area\": 301336.0,\n" +
                "            \"population\": 59554023,\n" +
                "            \"population_density\": 197.63328311253883\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Uganda\",\n" +
                "            \"area\": 241550.0,\n" +
                "            \"population\": 45741000,\n" +
                "            \"population_density\": 189.36452080314635\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andorra\",\n" +
                "            \"area\": 468.0,\n" +
                "            \"population\": 77265,\n" +
                "            \"population_density\": 165.09615384615384\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Micronesia\",\n" +
                "            \"area\": 702.0,\n" +
                "            \"population\": 115021,\n" +
                "            \"population_density\": 163.84757834757835\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kosovo\",\n" +
                "            \"area\": 10908.0,\n" +
                "            \"population\": 1775378,\n" +
                "            \"population_density\": 162.75925925925927\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Malawi\",\n" +
                "            \"area\": 118484.0,\n" +
                "            \"population\": 19129955,\n" +
                "            \"population_density\": 161.45601937814388\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guatemala\",\n" +
                "            \"area\": 108889.0,\n" +
                "            \"population\": 16858333,\n" +
                "            \"population_density\": 154.82126752931885\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Isle of Man\",\n" +
                "            \"area\": 572.0,\n" +
                "            \"population\": 85032,\n" +
                "            \"population_density\": 148.65734265734267\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Anguilla\",\n" +
                "            \"area\": 91.0,\n" +
                "            \"population\": 13452,\n" +
                "            \"population_density\": 147.82417582417582\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kiribati\",\n" +
                "            \"area\": 811.0,\n" +
                "            \"population\": 119446,\n" +
                "            \"population_density\": 147.28236744759556\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Togo\",\n" +
                "            \"area\": 56785.0,\n" +
                "            \"population\": 8278737,\n" +
                "            \"population_density\": 145.79091309324644\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"China\",\n" +
                "            \"area\": 9706961.0,\n" +
                "            \"population\": 1402112000,\n" +
                "            \"population_density\": 144.44397170236905\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Indonesia\",\n" +
                "            \"area\": 1904569.0,\n" +
                "            \"population\": 273523621,\n" +
                "            \"population_density\": 143.6144455779759\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Tonga\",\n" +
                "            \"area\": 747.0,\n" +
                "            \"population\": 105697,\n" +
                "            \"population_density\": 141.49531459170012\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cape Verde\",\n" +
                "            \"area\": 4033.0,\n" +
                "            \"population\": 555988,\n" +
                "            \"population_density\": 137.85965782296057\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Thailand\",\n" +
                "            \"area\": 513120.0,\n" +
                "            \"population\": 69799978,\n" +
                "            \"population_density\": 136.030515279077\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Czechia\",\n" +
                "            \"area\": 78865.0,\n" +
                "            \"population\": 10698896,\n" +
                "            \"population_density\": 135.66088886071134\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Denmark\",\n" +
                "            \"area\": 43094.0,\n" +
                "            \"population\": 5831404,\n" +
                "            \"population_density\": 135.3182345570149\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Helena, Ascension and Tristan da Cunha\",\n" +
                "            \"area\": 394.0,\n" +
                "            \"population\": 53192,\n" +
                "            \"population_density\": 135.00507614213197\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cyprus\",\n" +
                "            \"area\": 9251.0,\n" +
                "            \"population\": 1207361,\n" +
                "            \"population_density\": 130.51140417252188\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ghana\",\n" +
                "            \"area\": 238533.0,\n" +
                "            \"population\": 31072945,\n" +
                "            \"population_density\": 130.26686035055945\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Northern Mariana Islands\",\n" +
                "            \"area\": 464.0,\n" +
                "            \"population\": 57557,\n" +
                "            \"population_density\": 124.04525862068965\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"France\",\n" +
                "            \"area\": 551695.0,\n" +
                "            \"population\": 67391582,\n" +
                "            \"population_density\": 122.15369361694414\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Poland\",\n" +
                "            \"area\": 312679.0,\n" +
                "            \"population\": 37950802,\n" +
                "            \"population_density\": 121.37304392044237\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"United Arab Emirates\",\n" +
                "            \"area\": 83600.0,\n" +
                "            \"population\": 9890400,\n" +
                "            \"population_density\": 118.30622009569377\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Tokelau\",\n" +
                "            \"area\": 12.0,\n" +
                "            \"population\": 1411,\n" +
                "            \"population_density\": 117.58333333333333\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Azerbaijan\",\n" +
                "            \"area\": 86600.0,\n" +
                "            \"population\": 10110116,\n" +
                "            \"population_density\": 116.74498845265589\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jordan\",\n" +
                "            \"area\": 89342.0,\n" +
                "            \"population\": 10203140,\n" +
                "            \"population_density\": 114.20317431890936\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Portugal\",\n" +
                "            \"area\": 92090.0,\n" +
                "            \"population\": 10305564,\n" +
                "            \"population_density\": 111.90752524704094\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Slovakia\",\n" +
                "            \"area\": 49037.0,\n" +
                "            \"population\": 5458827,\n" +
                "            \"population_density\": 111.32057426025246\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sierra Leone\",\n" +
                "            \"area\": 71740.0,\n" +
                "            \"population\": 7976985,\n" +
                "            \"population_density\": 111.19298856983552\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Benin\",\n" +
                "            \"area\": 112622.0,\n" +
                "            \"population\": 12123198,\n" +
                "            \"population_density\": 107.64502495072011\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Turkey\",\n" +
                "            \"area\": 783562.0,\n" +
                "            \"population\": 84339067,\n" +
                "            \"population_density\": 107.63547364471478\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Austria\",\n" +
                "            \"area\": 83871.0,\n" +
                "            \"population\": 8917205,\n" +
                "            \"population_density\": 106.32048026135375\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Hungary\",\n" +
                "            \"area\": 93028.0,\n" +
                "            \"population\": 9749763,\n" +
                "            \"population_density\": 104.80460721503204\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ethiopia\",\n" +
                "            \"area\": 1104300.0,\n" +
                "            \"population\": 114963583,\n" +
                "            \"population_density\": 104.1053907452685\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Slovenia\",\n" +
                "            \"area\": 20273.0,\n" +
                "            \"population\": 2100126,\n" +
                "            \"population_density\": 103.59226557490258\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cuba\",\n" +
                "            \"area\": 109884.0,\n" +
                "            \"population\": 11326616,\n" +
                "            \"population_density\": 103.07793673328237\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Egypt\",\n" +
                "            \"area\": 1002450.0,\n" +
                "            \"population\": 102334403,\n" +
                "            \"population_density\": 102.08429647363958\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Costa Rica\",\n" +
                "            \"area\": 51100.0,\n" +
                "            \"population\": 5094114,\n" +
                "            \"population_density\": 99.6891193737769\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Armenia\",\n" +
                "            \"area\": 29743.0,\n" +
                "            \"population\": 2963234,\n" +
                "            \"population_density\": 99.62794607134452\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Albania\",\n" +
                "            \"area\": 28748.0,\n" +
                "            \"population\": 2837743,\n" +
                "            \"population_density\": 98.71097119799639\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Malaysia\",\n" +
                "            \"area\": 330803.0,\n" +
                "            \"population\": 32365998,\n" +
                "            \"population_density\": 97.84070277476323\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominica\",\n" +
                "            \"area\": 751.0,\n" +
                "            \"population\": 71991,\n" +
                "            \"population_density\": 95.8601864181092\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Syria\",\n" +
                "            \"area\": 185180.0,\n" +
                "            \"population\": 17500657,\n" +
                "            \"population_density\": 94.50619397343125\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Spain\",\n" +
                "            \"area\": 505992.0,\n" +
                "            \"population\": 47351567,\n" +
                "            \"population_density\": 93.58165148856108\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kenya\",\n" +
                "            \"area\": 580367.0,\n" +
                "            \"population\": 53771300,\n" +
                "            \"population_density\": 92.65051252052581\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cambodia\",\n" +
                "            \"area\": 181035.0,\n" +
                "            \"population\": 16718971,\n" +
                "            \"population_density\": 92.35214737481702\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Iraq\",\n" +
                "            \"area\": 438317.0,\n" +
                "            \"population\": 40222503,\n" +
                "            \"population_density\": 91.76578366798459\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Timor-Leste\",\n" +
                "            \"area\": 14874.0,\n" +
                "            \"population\": 1318442,\n" +
                "            \"population_density\": 88.64071534220788\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Honduras\",\n" +
                "            \"area\": 112492.0,\n" +
                "            \"population\": 9904608,\n" +
                "            \"population_density\": 88.04722113572521\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Senegal\",\n" +
                "            \"area\": 196722.0,\n" +
                "            \"population\": 16743930,\n" +
                "            \"population_density\": 85.11467959862141\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Wallis and Futuna\",\n" +
                "            \"area\": 142.0,\n" +
                "            \"population\": 11750,\n" +
                "            \"population_density\": 82.74647887323944\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Morocco\",\n" +
                "            \"area\": 446550.0,\n" +
                "            \"population\": 36910558,\n" +
                "            \"population_density\": 82.65716717052962\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ivory Coast\",\n" +
                "            \"area\": 322463.0,\n" +
                "            \"population\": 26378275,\n" +
                "            \"population_density\": 81.80248586659555\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Greece\",\n" +
                "            \"area\": 131990.0,\n" +
                "            \"population\": 10715549,\n" +
                "            \"population_density\": 81.1845518599894\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Romania\",\n" +
                "            \"area\": 238391.0,\n" +
                "            \"population\": 19286123,\n" +
                "            \"population_density\": 80.90122110314567\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"North Macedonia\",\n" +
                "            \"area\": 25713.0,\n" +
                "            \"population\": 2077132,\n" +
                "            \"population_density\": 80.78139462528682\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Myanmar\",\n" +
                "            \"area\": 676578.0,\n" +
                "            \"population\": 54409794,\n" +
                "            \"population_density\": 80.4191002367798\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Caribbean Netherlands\",\n" +
                "            \"area\": 328.0,\n" +
                "            \"population\": 25987,\n" +
                "            \"population_density\": 79.22865853658537\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Serbia\",\n" +
                "            \"area\": 88361.0,\n" +
                "            \"population\": 6908224,\n" +
                "            \"population_density\": 78.1818222971673\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Moldova\",\n" +
                "            \"area\": 33846.0,\n" +
                "            \"population\": 2617820,\n" +
                "            \"population_density\": 77.3450333865154\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cook Islands\",\n" +
                "            \"area\": 236.0,\n" +
                "            \"population\": 18100,\n" +
                "            \"population_density\": 76.69491525423729\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Burkina Faso\",\n" +
                "            \"area\": 272967.0,\n" +
                "            \"population\": 20903278,\n" +
                "            \"population_density\": 76.5780405690065\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Uzbekistan\",\n" +
                "            \"area\": 447400.0,\n" +
                "            \"population\": 34232050,\n" +
                "            \"population_density\": 76.51329906124273\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Brunei\",\n" +
                "            \"area\": 5765.0,\n" +
                "            \"population\": 437483,\n" +
                "            \"population_density\": 75.88603642671292\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ukraine\",\n" +
                "            \"area\": 603500.0,\n" +
                "            \"population\": 44134693,\n" +
                "            \"population_density\": 73.13122286661144\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Tunisia\",\n" +
                "            \"area\": 163610.0,\n" +
                "            \"population\": 11818618,\n" +
                "            \"population_density\": 72.23652588472588\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Croatia\",\n" +
                "            \"area\": 56594.0,\n" +
                "            \"population\": 4047200,\n" +
                "            \"population_density\": 71.51288122415804\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ireland\",\n" +
                "            \"area\": 70273.0,\n" +
                "            \"population\": 4994724,\n" +
                "            \"population_density\": 71.07600358601454\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lesotho\",\n" +
                "            \"area\": 30355.0,\n" +
                "            \"population\": 2142252,\n" +
                "            \"population_density\": 70.57328281996377\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Samoa\",\n" +
                "            \"area\": 2842.0,\n" +
                "            \"population\": 198410,\n" +
                "            \"population_density\": 69.81351161154117\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"French Polynesia\",\n" +
                "            \"area\": 4167.0,\n" +
                "            \"population\": 280904,\n" +
                "            \"population_density\": 67.41156707463404\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Eswatini\",\n" +
                "            \"area\": 17364.0,\n" +
                "            \"population\": 1160164,\n" +
                "            \"population_density\": 66.81432849573831\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Tajikistan\",\n" +
                "            \"area\": 143100.0,\n" +
                "            \"population\": 9537642,\n" +
                "            \"population_density\": 66.65018867924529\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mexico\",\n" +
                "            \"area\": 1964375.0,\n" +
                "            \"population\": 128932753,\n" +
                "            \"population_density\": 65.63550900413618\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bosnia and Herzegovina\",\n" +
                "            \"area\": 51209.0,\n" +
                "            \"population\": 3280815,\n" +
                "            \"population_density\": 64.06715616395556\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Norfolk Island\",\n" +
                "            \"area\": 36.0,\n" +
                "            \"population\": 2302,\n" +
                "            \"population_density\": 63.94444444444444\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ecuador\",\n" +
                "            \"area\": 276841.0,\n" +
                "            \"population\": 17643060,\n" +
                "            \"population_density\": 63.72993884576345\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Tanzania\",\n" +
                "            \"area\": 945087.0,\n" +
                "            \"population\": 59734213,\n" +
                "            \"population_density\": 63.204988535447\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bulgaria\",\n" +
                "            \"area\": 110879.0,\n" +
                "            \"population\": 6927288,\n" +
                "            \"population_density\": 62.476104582472786\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Afghanistan\",\n" +
                "            \"area\": 652230.0,\n" +
                "            \"population\": 40218234,\n" +
                "            \"population_density\": 61.6626558116002\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Panama\",\n" +
                "            \"area\": 75417.0,\n" +
                "            \"population\": 4314768,\n" +
                "            \"population_density\": 57.21214049882652\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Yemen\",\n" +
                "            \"area\": 527968.0,\n" +
                "            \"population\": 29825968,\n" +
                "            \"population_density\": 56.49199951512213\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cameroon\",\n" +
                "            \"area\": 475442.0,\n" +
                "            \"population\": 26545864,\n" +
                "            \"population_density\": 55.834074398138995\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guinea-Bissau\",\n" +
                "            \"area\": 36125.0,\n" +
                "            \"population\": 1967998,\n" +
                "            \"population_density\": 54.47745328719723\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guinea\",\n" +
                "            \"area\": 245857.0,\n" +
                "            \"population\": 13132792,\n" +
                "            \"population_density\": 53.41638432096707\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Georgia\",\n" +
                "            \"area\": 69700.0,\n" +
                "            \"population\": 3714000,\n" +
                "            \"population_density\": 53.285509325681495\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Iran\",\n" +
                "            \"area\": 1648195.0,\n" +
                "            \"population\": 83992953,\n" +
                "            \"population_density\": 50.96056777262399\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Nicaragua\",\n" +
                "            \"area\": 130373.0,\n" +
                "            \"population\": 6624554,\n" +
                "            \"population_density\": 50.81231543341029\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Equatorial Guinea\",\n" +
                "            \"area\": 28051.0,\n" +
                "            \"population\": 1402985,\n" +
                "            \"population_density\": 50.01550746853945\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"British Indian Ocean Territory\",\n" +
                "            \"area\": 60.0,\n" +
                "            \"population\": 3000,\n" +
                "            \"population_density\": 50.0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Fiji\",\n" +
                "            \"area\": 18272.0,\n" +
                "            \"population\": 896444,\n" +
                "            \"population_density\": 49.06107705779335\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"South Africa\",\n" +
                "            \"area\": 1221037.0,\n" +
                "            \"population\": 59308690,\n" +
                "            \"population_density\": 48.57239379314468\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Montserrat\",\n" +
                "            \"area\": 102.0,\n" +
                "            \"population\": 4922,\n" +
                "            \"population_density\": 48.254901960784316\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Madagascar\",\n" +
                "            \"area\": 587041.0,\n" +
                "            \"population\": 27691019,\n" +
                "            \"population_density\": 47.170502571370655\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"DR Congo\",\n" +
                "            \"area\": 2344858.0,\n" +
                "            \"population\": 108407721,\n" +
                "            \"population_density\": 46.23210488652191\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Eritrea\",\n" +
                "            \"area\": 117600.0,\n" +
                "            \"population\": 5352000,\n" +
                "            \"population_density\": 45.51020408163265\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Liberia\",\n" +
                "            \"area\": 111369.0,\n" +
                "            \"population\": 5057677,\n" +
                "            \"population_density\": 45.41368783054531\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Belarus\",\n" +
                "            \"area\": 207600.0,\n" +
                "            \"population\": 9398861,\n" +
                "            \"population_density\": 45.27389691714836\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Montenegro\",\n" +
                "            \"area\": 13812.0,\n" +
                "            \"population\": 621718,\n" +
                "            \"population_density\": 45.01288734433825\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Colombia\",\n" +
                "            \"area\": 1141748.0,\n" +
                "            \"population\": 50882884,\n" +
                "            \"population_density\": 44.565774584234\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lithuania\",\n" +
                "            \"area\": 65300.0,\n" +
                "            \"population\": 2794700,\n" +
                "            \"population_density\": 42.797856049004594\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Djibouti\",\n" +
                "            \"area\": 23200.0,\n" +
                "            \"population\": 988002,\n" +
                "            \"population_density\": 42.58629310344828\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Turks and Caicos Islands\",\n" +
                "            \"area\": 948.0,\n" +
                "            \"population\": 38718,\n" +
                "            \"population_density\": 40.84177215189873\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Palau\",\n" +
                "            \"area\": 459.0,\n" +
                "            \"population\": 18092,\n" +
                "            \"population_density\": 39.4161220043573\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mozambique\",\n" +
                "            \"area\": 801590.0,\n" +
                "            \"population\": 31255435,\n" +
                "            \"population_density\": 38.99179755236467\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cocos (Keeling) Islands\",\n" +
                "            \"area\": 14.0,\n" +
                "            \"population\": 544,\n" +
                "            \"population_density\": 38.857142857142854\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Zimbabwe\",\n" +
                "            \"area\": 390757.0,\n" +
                "            \"population\": 14862927,\n" +
                "            \"population_density\": 38.03623991380832\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"United States\",\n" +
                "            \"area\": 9372610.0,\n" +
                "            \"population\": 329484123,\n" +
                "            \"population_density\": 35.15393502983694\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Faroe Islands\",\n" +
                "            \"area\": 1393.0,\n" +
                "            \"population\": 48865,\n" +
                "            \"population_density\": 35.07896625987078\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kyrgyzstan\",\n" +
                "            \"area\": 199951.0,\n" +
                "            \"population\": 6591600,\n" +
                "            \"population_density\": 32.96607668878875\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Venezuela\",\n" +
                "            \"area\": 916445.0,\n" +
                "            \"population\": 28435943,\n" +
                "            \"population_density\": 31.028531990463147\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Laos\",\n" +
                "            \"area\": 236800.0,\n" +
                "            \"population\": 7275556,\n" +
                "            \"population_density\": 30.724476351351353\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Latvia\",\n" +
                "            \"area\": 64559.0,\n" +
                "            \"population\": 1901548,\n" +
                "            \"population_density\": 29.454421536888738\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Estonia\",\n" +
                "            \"area\": 45227.0,\n" +
                "            \"population\": 1331057,\n" +
                "            \"population_density\": 29.430583501006037\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bahamas\",\n" +
                "            \"area\": 13943.0,\n" +
                "            \"population\": 393248,\n" +
                "            \"population_density\": 28.203973319945494\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Angola\",\n" +
                "            \"area\": 1246700.0,\n" +
                "            \"population\": 32866268,\n" +
                "            \"population_density\": 26.36261169487447\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Peru\",\n" +
                "            \"area\": 1285216.0,\n" +
                "            \"population\": 32971846,\n" +
                "            \"population_density\": 25.654711737171027\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Chile\",\n" +
                "            \"area\": 756102.0,\n" +
                "            \"population\": 19116209,\n" +
                "            \"population_density\": 25.282579599048805\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Vanuatu\",\n" +
                "            \"area\": 12189.0,\n" +
                "            \"population\": 307150,\n" +
                "            \"population_density\": 25.198949872836163\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saint Pierre and Miquelon\",\n" +
                "            \"area\": 242.0,\n" +
                "            \"population\": 6069,\n" +
                "            \"population_density\": 25.078512396694215\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Brazil\",\n" +
                "            \"area\": 8515767.0,\n" +
                "            \"population\": 212559409,\n" +
                "            \"population_density\": 24.960688684882996\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Somalia\",\n" +
                "            \"area\": 637657.0,\n" +
                "            \"population\": 15893219,\n" +
                "            \"population_density\": 24.92440136311528\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Zambia\",\n" +
                "            \"area\": 752612.0,\n" +
                "            \"population\": 18383956,\n" +
                "            \"population_density\": 24.42687068502761\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Solomon Islands\",\n" +
                "            \"area\": 28896.0,\n" +
                "            \"population\": 686878,\n" +
                "            \"population_density\": 23.770694905869323\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sudan\",\n" +
                "            \"area\": 1886068.0,\n" +
                "            \"population\": 43849269,\n" +
                "            \"population_density\": 23.249039271118537\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sweden\",\n" +
                "            \"area\": 450295.0,\n" +
                "            \"population\": 10353442,\n" +
                "            \"population_density\": 22.99257597797\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bhutan\",\n" +
                "            \"area\": 38394.0,\n" +
                "            \"population\": 771612,\n" +
                "            \"population_density\": 20.09720268791999\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Papua New Guinea\",\n" +
                "            \"area\": 462840.0,\n" +
                "            \"population\": 8947027,\n" +
                "            \"population_density\": 19.330712557255207\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Uruguay\",\n" +
                "            \"area\": 181034.0,\n" +
                "            \"population\": 3473727,\n" +
                "            \"population_density\": 19.18825745440083\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Niger\",\n" +
                "            \"area\": 1267000.0,\n" +
                "            \"population\": 24206636,\n" +
                "            \"population_density\": 19.105474348855566\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"New Zealand\",\n" +
                "            \"area\": 270467.0,\n" +
                "            \"population\": 5084300,\n" +
                "            \"population_density\": 18.79822677073358\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Algeria\",\n" +
                "            \"area\": 2381741.0,\n" +
                "            \"population\": 44700000,\n" +
                "            \"population_density\": 18.7677837346714\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Åland Islands\",\n" +
                "            \"area\": 1580.0,\n" +
                "            \"population\": 29458,\n" +
                "            \"population_density\": 18.644303797468353\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"South Sudan\",\n" +
                "            \"area\": 619745.0,\n" +
                "            \"population\": 11193729,\n" +
                "            \"population_density\": 18.06183026890092\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Paraguay\",\n" +
                "            \"area\": 406752.0,\n" +
                "            \"population\": 7132530,\n" +
                "            \"population_density\": 17.53532865234836\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Belize\",\n" +
                "            \"area\": 22966.0,\n" +
                "            \"population\": 397621,\n" +
                "            \"population_density\": 17.313463380649655\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Norway\",\n" +
                "            \"area\": 323802.0,\n" +
                "            \"population\": 5379475,\n" +
                "            \"population_density\": 16.613470577698717\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Republic of the Congo\",\n" +
                "            \"area\": 342000.0,\n" +
                "            \"population\": 5657000,\n" +
                "            \"population_density\": 16.54093567251462\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Oman\",\n" +
                "            \"area\": 309500.0,\n" +
                "            \"population\": 5106622,\n" +
                "            \"population_density\": 16.499586429725362\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Finland\",\n" +
                "            \"area\": 338424.0,\n" +
                "            \"population\": 5530719,\n" +
                "            \"population_density\": 16.342573221757323\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mali\",\n" +
                "            \"area\": 1240192.0,\n" +
                "            \"population\": 20250834,\n" +
                "            \"population_density\": 16.328789413252142\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Argentina\",\n" +
                "            \"area\": 2780400.0,\n" +
                "            \"population\": 45376763,\n" +
                "            \"population_density\": 16.320228384405123\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Saudi Arabia\",\n" +
                "            \"area\": 2149690.0,\n" +
                "            \"population\": 34813867,\n" +
                "            \"population_density\": 16.194831347775725\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Christmas Island\",\n" +
                "            \"area\": 135.0,\n" +
                "            \"population\": 2072,\n" +
                "            \"population_density\": 15.348148148148148\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"New Caledonia\",\n" +
                "            \"area\": 18575.0,\n" +
                "            \"population\": 271960,\n" +
                "            \"population_density\": 14.641184387617766\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Chad\",\n" +
                "            \"area\": 1284000.0,\n" +
                "            \"population\": 16425859,\n" +
                "            \"population_density\": 12.79272507788162\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Turkmenistan\",\n" +
                "            \"area\": 488100.0,\n" +
                "            \"population\": 6031187,\n" +
                "            \"population_density\": 12.356457693095678\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bolivia\",\n" +
                "            \"area\": 1098581.0,\n" +
                "            \"population\": 11673029,\n" +
                "            \"population_density\": 10.625551506898445\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"United States Minor Outlying Islands\",\n" +
                "            \"area\": 34.2,\n" +
                "            \"population\": 300,\n" +
                "            \"population_density\": 8.771929824561402\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Russia\",\n" +
                "            \"area\": 1.7098242E7,\n" +
                "            \"population\": 144104080,\n" +
                "            \"population_density\": 8.42800563941018\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gabon\",\n" +
                "            \"area\": 267668.0,\n" +
                "            \"population\": 2225728,\n" +
                "            \"population_density\": 8.315256212920483\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Central African Republic\",\n" +
                "            \"area\": 622984.0,\n" +
                "            \"population\": 4829764,\n" +
                "            \"population_density\": 7.752629281008822\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kazakhstan\",\n" +
                "            \"area\": 2724900.0,\n" +
                "            \"population\": 18754440,\n" +
                "            \"population_density\": 6.882615875811957\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Niue\",\n" +
                "            \"area\": 260.0,\n" +
                "            \"population\": 1470,\n" +
                "            \"population_density\": 5.653846153846154\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mauritania\",\n" +
                "            \"area\": 1030700.0,\n" +
                "            \"population\": 4649660,\n" +
                "            \"population_density\": 4.511167167944116\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Botswana\",\n" +
                "            \"area\": 582000.0,\n" +
                "            \"population\": 2351625,\n" +
                "            \"population_density\": 4.040592783505154\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Libya\",\n" +
                "            \"area\": 1759540.0,\n" +
                "            \"population\": 6871287,\n" +
                "            \"population_density\": 3.9051610079907246\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Canada\",\n" +
                "            \"area\": 9984670.0,\n" +
                "            \"population\": 38005238,\n" +
                "            \"population_density\": 3.8063589482676945\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Guyana\",\n" +
                "            \"area\": 214969.0,\n" +
                "            \"population\": 786559,\n" +
                "            \"population_density\": 3.6589415218008177\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Suriname\",\n" +
                "            \"area\": 163820.0,\n" +
                "            \"population\": 586634,\n" +
                "            \"population_density\": 3.580966914906605\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Iceland\",\n" +
                "            \"area\": 103000.0,\n" +
                "            \"population\": 366425,\n" +
                "            \"population_density\": 3.55752427184466\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Australia\",\n" +
                "            \"area\": 7692024.0,\n" +
                "            \"population\": 25687041,\n" +
                "            \"population_density\": 3.3394384884914556\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Namibia\",\n" +
                "            \"area\": 825615.0,\n" +
                "            \"population\": 2540916,\n" +
                "            \"population_density\": 3.0776039679511635\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"French Guiana\",\n" +
                "            \"area\": 83534.0,\n" +
                "            \"population\": 254541,\n" +
                "            \"population_density\": 3.047154452079393\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mongolia\",\n" +
                "            \"area\": 1564110.0,\n" +
                "            \"population\": 3278292,\n" +
                "            \"population_density\": 2.0959472159886454\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Western Sahara\",\n" +
                "            \"area\": 266000.0,\n" +
                "            \"population\": 510713,\n" +
                "            \"population_density\": 1.9199736842105264\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pitcairn Islands\",\n" +
                "            \"area\": 47.0,\n" +
                "            \"population\": 56,\n" +
                "            \"population_density\": 1.1914893617021276\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Falkland Islands\",\n" +
                "            \"area\": 12173.0,\n" +
                "            \"population\": 2563,\n" +
                "            \"population_density\": 0.21054793395218926\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"French Southern and Antarctic Lands\",\n" +
                "            \"area\": 7747.0,\n" +
                "            \"population\": 400,\n" +
                "            \"population_density\": 0.051632890151026206\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Svalbard and Jan Mayen\",\n" +
                "            \"area\": 61399.0,\n" +
                "            \"population\": 2562,\n" +
                "            \"population_density\": 0.041727063958696395\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Greenland\",\n" +
                "            \"area\": 2166086.0,\n" +
                "            \"population\": 56367,\n" +
                "            \"population_density\": 0.02602251249488709\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"South Georgia\",\n" +
                "            \"area\": 3903.0,\n" +
                "            \"population\": 30,\n" +
                "            \"population_density\": 0.007686395080707148\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Antarctica\",\n" +
                "            \"area\": 1.4E7,\n" +
                "            \"population\": 1000,\n" +
                "            \"population_density\": 7.142857142857143E-5\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Heard Island and McDonald Islands\",\n" +
                "            \"area\": 412.0,\n" +
                "            \"population\": 0,\n" +
                "            \"population_density\": 0.0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bouvet Island\",\n" +
                "            \"area\": 49.0,\n" +
                "            \"population\": 0,\n" +
                "            \"population_density\": 0.0\n" +
                "        }\n" +
                "    ]";

        List<CountryDensity> countryDensities = List.of(objectMapper.readValue(COUNTRY_DENSITIES_RESPONSE, CountryDensity[].class));
        return countryDensities;
    }
}
