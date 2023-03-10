package com.apiux.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                                                      .apis(RequestHandlerSelectors.basePackage("com.apiux.starter"))
                                                      .paths(PathSelectors.any())
                                                      .build()
                                                      .apiInfo(info());
    }

    private ApiInfo info() {
        return new ApiInfoBuilder().title("APIUX")
                                   .description("APIUX Spring boot and MongoDB")
                                   .contact(new Contact("ANA ALONSO", "https://github.com/",
                                                        "@gmail.com"))
                                   .version("1.0.0")
                                   .license("Apache License Version 2.0")
                                   .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                                   .build();
    }
}
