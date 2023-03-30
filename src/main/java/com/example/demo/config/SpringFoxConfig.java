package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SpringFoxConfig {
    @Value("${swagger.host.url}")
    private String hostUrl;
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(hostUrl)
                .groupName("Spring Actuator")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
