package com.TheCoffeeShop.Services.Impl;

import com.TheCoffeShop.DAOEntities.CoffeeShop;
import com.TheCoffeShop.Repositories.CoffeeShopRepository;
import com.TheCoffeeShop.Services.CoffeeShopService;

import java.util.List;

public class CoffeeShopServiceImpl implements CoffeeShopService {

   private CoffeeShopRepository coffeeShopRepository;

   CoffeeShopServiceImpl(CoffeeShopRepository coffeeShopRepository){
     this.coffeeShopRepository = coffeeShopRepository;
   }


    @Override
    public List<CoffeeShop> getAllCoffeeShops() {
      return null;
    }

    @Override
    public CoffeeShop getCoffeeShop(Long id) {
      return null;
    }

    @Override
    public CoffeeShop updateCoffeeShop(Long id, CoffeeShop coffeeShop) {
      return null;
    }

    @Override
    public void removeCoffeeShop(Long id) {

    }

    @Override
    public CoffeeShop getCoffeeShopByName(String name) {
      return null;
    }
}
