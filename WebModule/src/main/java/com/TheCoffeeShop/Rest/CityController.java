package com.TheCoffeeShop.Rest;

import com.TheCoffeeShop.DAOEntities.City;
import com.TheCoffeeShop.Services.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "city Controller" , tags = {"City Controller"})
@SwaggerDefinition(tags = {@Tag(name = "City Controller" , description = "city controller")})
@RestController
public class CityController {


  private final CityService cityService;

  public CityController(CityService cityService){
    this.cityService = cityService;
  }


  @GetMapping("/cities")
  public List<City> getCities(){
    return null; //cityService
  }


  @GetMapping("/city/{id}")
  public City getCity(@PathVariable Long id){
    return null; // cityService
  }

  @GetMapping("/hello")
  public String getCity(){
    return "hello world"; // cityService
  }

}
