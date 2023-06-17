package com.TheCoffeeShop.DTO;

import java.util.Date;
import java.util.Set;

public class OrderDTO {

  private Long idOrder;

  private Date date;

  private CoffeeShopDTO coffeeShopDTO;

  private UserDTO userDTO;

  private Set<OrderDetailsDTO> orderDetailsDTO;

  public Long getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(Long idOrder) {
    this.idOrder = idOrder;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public CoffeeShopDTO getCoffeeShopDTO() {
    return coffeeShopDTO;
  }

  public void setCoffeeShopDTO(CoffeeShopDTO coffeeShopDTO) {
    this.coffeeShopDTO = coffeeShopDTO;
  }

  public UserDTO getUserDTO() {
    return userDTO;
  }

  public void setUserDTO(UserDTO userDTO) {
    this.userDTO = userDTO;
  }

  public Set<OrderDetailsDTO> getOrderDetailsDTO() {
    return orderDetailsDTO;
  }

  public void setOrderDetailsDTO(Set<OrderDetailsDTO> orderDetailsDTO) {
    this.orderDetailsDTO = orderDetailsDTO;
  }
}
