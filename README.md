# About this Project

This project has 2 API.

1. `rc/v1/country/population` will shows you all countries sorted by descending population density.
2. `rc/v1/country/border/{region}` will shows countries with the most border outside its region.

# Before Running the Application

1. We need to pull this repository
2. Make sure we already setup `maven` in your computer
3. All Java IDE is fine, but IntellIJ is recommended
4. Run `mvn clean install -U` to build
   5After all environment is setup, you can run `Application.class` then you can hit the available API

# Task 1

1. First we need to hit `localhost:8080/rc/v1/country/population`
2. The Application will receive our request and then directly hit backend `http://restcountries.com/v3.1/all`
3. The response from that URL is `a list of object` which contains complex JSON related to countries
4. Thus, we don't need to take all of the response to be processed, we only need a particular parameter from the response. Those are:

    1. `"name": {"common": "Netherlands"}` to get the common name of the country
    2. `"area" : 41850` to get area of the country
    3. `"population" : 16655799` to get population of the country
5. After got 3 parameters above we could calculate population density with this formula `population_density = population/area`
6. After calculating the `population_density`, we sort them descending then return the result as JSON

# Task 2

1. First we need to hit `localhost:8080/rc/v1/region/{region}`
2. We can hit using all region, but we are going to hit `rc/v1/region/asia` because we will analyze Asian country
3. The Application will receive our request and then directly hit backend `http://restcountries.com/v3.1/region/asia`
4. Like Task 1, we don't need all of the parameters, only a few of them:

    1. `"name": {"common": "Turkey"}` to get the common name of the country
    2. ```
      "borders": [
         "ARM",
         "AZE",
         "BGR",
         "GEO",
         "GRC",
         "IRN",
         "IRQ",
         "SYR"
      ]"
      ```
       to get list of borders. The country listed in `borders` is using `cca3`.
    2. `"cca3": "TUR"` to be compared by `borders`
5. Because the result returned by backend will return all Asian Country, we check if the `borders` of each countries exist in the response, then it's Asian Country, otherwise it's not
6. If `borders` is not existed in the response, we can add it to the `borders_different_region` parameter
7. Calculate the number of `borders_different_region` for each Asian Country
8. Sort the list based on `number_of_borders_different_region`
9. Turkey is Asian Country containing the most bordering countries of a different region (6 Asia + 2 Europe)