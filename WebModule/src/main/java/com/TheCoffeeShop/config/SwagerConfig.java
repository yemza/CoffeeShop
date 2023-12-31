package com.TheCoffeeShop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwagerConfig extends WebMvcConfigurationSupport {


  /**
   * @return Docket
   *
   * */

  @Bean
  public Docket api(){
    return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.TheCoffeeShop.Rest"))
               .paths(PathSelectors.any())
      .build()
      .apiInfo(getApiInfo());

  }

  private ApiInfo getApiInfo(){
    return   new ApiInfo("Swagger2 Api Documentation",
      "How to generate Swagger documentation for your Rest API",
      "1.0", "urn:tos",
      new Contact("Java Dev Journal","www.javadevjournal.com","contact-us@javadevjournal.com"),
      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
  }


  @Override
  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html")
      .addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars/**")
      .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }
}
