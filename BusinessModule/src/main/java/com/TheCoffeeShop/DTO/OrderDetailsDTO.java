package com.TheCoffeeShop.DTO;


public class OrderDetailsDTO {

  private Long idOrderDetails;

  private int quantity;

  private OrderDTO orderDTO;

  private MenuItemDTO menuItemDTO;

  public Long getIdOrderDetails() {
    return idOrderDetails;
  }

  public void setIdOrderDetails(Long idOrderDetails) {
    this.idOrderDetails = idOrderDetails;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public OrderDTO getOrderDTO() {
    return orderDTO;
  }

  public void setOrderDTO(OrderDTO orderDTO) {
    this.orderDTO = orderDTO;
  }

  public MenuItemDTO getMenuItemDTO() {
    return menuItemDTO;
  }

  public void setMenuItemDTO(MenuItemDTO menuItemDTO) {
    this.menuItemDTO = menuItemDTO;
  }
}

