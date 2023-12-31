package com.TheCoffeeShop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CrossConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry){
      registry.addMapping("/**")
              .allowedOrigins("http://localhost:4201")
              .allowedMethods("GET" , "POST" , "PUT" , "DELETE")
              .allowCredentials(true);
  }


}
