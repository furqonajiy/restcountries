package com.furqonajiy.restcountries.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringdocConfig {
    @Bean
    public OpenAPI restCountriesOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rest Countries API")
                        .description("Service to get data of the countries.")
                        .version("v1"));
    }
}
