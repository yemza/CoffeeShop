package com.TheCoffeeShop.DTO;

import java.util.Set;


public class MenuItemDTO {


  private Long idMenuItem;

  private String name;

  private String itemImage;


  private String ingredient;

  private Set<MenuItemDetailsDTO> menuItemDetailsDTO;

  private MenuCategoryDTO menuCategoryDTO;

  private Set<OrderDetailsDTO> orderDetailsDTO;


  public Long getIdMenuItem() {
    return idMenuItem;
  }

  public void setIdMenuItem(Long idMenuItem) {
    this.idMenuItem = idMenuItem;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public Set<MenuItemDetailsDTO> getMenuItemDetailsDTO() {
    return menuItemDetailsDTO;
  }

  public void setMenuItemDetailsDTO(Set<MenuItemDetailsDTO> menuItemDetailsDTO) {
    this.menuItemDetailsDTO = menuItemDetailsDTO;
  }

  public MenuCategoryDTO getMenuCategoryDTO() {
    return menuCategoryDTO;
  }

  public void setMenuCategoryDTO(MenuCategoryDTO menuCategoryDTO) {
    this.menuCategoryDTO = menuCategoryDTO;
  }

  public Set<OrderDetailsDTO> getOrderDetailsDTO() {
    return orderDetailsDTO;
  }

  public void setOrderDetailsDTO(Set<OrderDetailsDTO> orderDetailsDTO) {
    this.orderDetailsDTO = orderDetailsDTO;
  }

  public String getItemImage() {
    return itemImage;
  }

  public void setItemImage(String itemImage) {
    this.itemImage = itemImage;
  }
}
