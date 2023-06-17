package com.TheCoffeeShop.DTO;

import java.util.Set;

public class MenuCategoryDTO {


  private Long idMenuCategory;
  private String nameMenuCategory;
  private Set<MenuItemDTO> MenuItemsDTO;
  private MenuCoffeeShopDTO menuCoffeeShopDTO;

  public Long getIdMenuCategory() {
    return idMenuCategory;
  }

  public void setIdMenuCategory(Long idMenuCategory) {
    this.idMenuCategory = idMenuCategory;
  }

  public String getNameMenuCategory() {
    return nameMenuCategory;
  }

  public void setNameMenuCategory(String nameMenuCategory) {
    this.nameMenuCategory = nameMenuCategory;
  }

  public Set<MenuItemDTO> getMenuItemsDTO() {
    return MenuItemsDTO;
  }

  public void setMenuItemsDTO(Set<MenuItemDTO> menuItemsDTO) {
    MenuItemsDTO = menuItemsDTO;
  }

  public MenuCoffeeShopDTO getMenuCoffeeShopDTO() {
    return menuCoffeeShopDTO;
  }

  public void setMenuCoffeeShopDTO(MenuCoffeeShopDTO menuCoffeeShopDTO) {
    this.menuCoffeeShopDTO = menuCoffeeShopDTO;
  }
}
