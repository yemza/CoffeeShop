package com.TheCoffeeShop.DTO;


public class MenuItemDetailsDTO {

  private Long idMenuItemDetails;

  private String size;

  private Double price;

  private MenuItemDTO menuItemDTO;


  public Long getIdMenuItemDetails() {
    return idMenuItemDetails;
  }

  public void setIdMenuItemDetails(Long idMenuItemDetails) {
    this.idMenuItemDetails = idMenuItemDetails;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MenuItemDTO getMenuItemDTO() {
    return menuItemDTO;
  }

  public void setMenuItemDTO(MenuItemDTO menuItemDTO) {
    this.menuItemDTO = menuItemDTO;
  }
}
