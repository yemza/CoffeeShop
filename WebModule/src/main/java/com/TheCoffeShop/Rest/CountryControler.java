package com.TheCoffeShop.Rest;


import com.TheCoffeShop.DAOEntities.Country;
import com.TheCoffeeShop.Services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryControler {

      private CountryService countryService ;


  CountryControler(CountryService countryService){
        this.countryService = countryService;
      }


  @GetMapping("countries")
  public List<Country> getCountries(){
    return null;
  }

  @GetMapping("country")
  public Country getCountry(@PathVariable Long id) {
    return null ;
  }


















  }
