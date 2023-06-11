package com.TheCoffeShop.Rest;


import com.TheCoffeShop.DAOEntities.CoffeeShop;
import com.TheCoffeeShop.Services.CoffeeShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoffeShopControler {
  
    private CoffeeShopService coffeeShopService;
    
    CoffeShopControler(CoffeeShopService coffeeShopService){
      this.coffeeShopService = coffeeShopService;
    }
  

  // get all CoffeeShop
   @GetMapping("coffeeShops")
  public List<CoffeeShop> getAllCoffeeShops(){
      return null ;//coffeeShopService;
   }

  // get CoffeeShop by id
  @GetMapping("coffeeShop/{id}")
  public CoffeeShop getCoffeeShop(@PathVariable Long id){
      return  null;
  }

  // update CoffeeShop
  @PutMapping("coffeeShop/{id}")
  public CoffeeShop updateCoffeeShop(@PathVariable Long id ,
                                     @RequestBody CoffeeShop coffeeShop){

      return null;
  }
  // remove CoffeeShop
  @DeleteMapping("coffeeShop/{id}")
  public void removeCoffeeShop(@PathVariable Long id){

  }

  // get CoffeeShop by name
  @GetMapping("coffeeShop/{name}")
  public CoffeeShop getCoffeeShopByName(@PathVariable String name){
      return null;
  }


  
}
