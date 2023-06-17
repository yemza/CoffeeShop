package com.TheCoffeeShop.DTO;

import java.util.Set;


public class MenuCoffeeShopDTO {

  private Long idMenuCoffeeShop;

  private Set<MenuCategoryDTO> menuCoffeeShopsDTO;

  private CoffeeShopDTO coffeeShopDTO;

  public Long getIdMenuCoffeeShop() {
    return idMenuCoffeeShop;
  }

  public void setIdMenuCoffeeShop(Long idMenuCoffeeShop) {
    this.idMenuCoffeeShop = idMenuCoffeeShop;
  }

  public Set<MenuCategoryDTO> getMenuCoffeeShopsDTO() {
    return menuCoffeeShopsDTO;
  }

  public void setMenuCoffeeShopsDTO(Set<MenuCategoryDTO> menuCoffeeShopsDTO) {
    this.menuCoffeeShopsDTO = menuCoffeeShopsDTO;
  }

  public CoffeeShopDTO getCoffeeShopDTO() {
    return coffeeShopDTO;
  }

  public void setCoffeeShopDTO(CoffeeShopDTO coffeeShopDTO) {
    this.coffeeShopDTO = coffeeShopDTO;
  }
}
