package com.ilinksolutions.UKVisaDb.config;


import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ilinksolutions.UKVisaDb.rservices"))
                .paths(regex("/*"))
                .build()
                .apiInfo(metaInfo());
    }

	    private ApiInfo metaInfo() {
	    	
	        return new ApiInfoBuilder().title("UK Visa REST API")
	            .description("This APIs used to save and update person data.")
	            .contact(new Contact("I-Link Solutions, Inc.",  "http://ilinksolution.com/", "junaid.qureshi@ilinksolution.com"))
	            .license("I-Link Solutions, Inc. License Version 2.0")
	            .licenseUrl("http://ilinksolution.com/")
	            .version("1.0.0")
	            .build();
	    }
	
}
