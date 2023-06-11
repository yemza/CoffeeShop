package com.TheCoffeShop.Rest;

import com.TheCoffeShop.DAOEntities.City;
import com.TheCoffeeShop.Services.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityControler {

  private CityService cityService;

  CityControler(CityService cityService){
    this.cityService = cityService;
  }


  @GetMapping("cities")
  public List<City> getCities(){
    return null; //cityService
  }


  @GetMapping("city/{id}")
  public City getCity(@PathVariable Long id){
    return null; // cityService
  }


}
