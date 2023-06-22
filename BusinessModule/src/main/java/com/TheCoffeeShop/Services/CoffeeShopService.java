package com.TheCoffeeShop.Services;

import com.TheCoffeeShop.DAOEntities.CoffeeShop;

import java.util.List;

public interface CoffeeShopService {

  List<CoffeeShop> getAllCoffeeShops();
  CoffeeShop getCoffeeShop(Long id);
  CoffeeShop updateCoffeeShop(Long id,CoffeeShop coffeeShop);
  void removeCoffeeShop(Long id);
  CoffeeShop getCoffeeShopByName(String name);

}
