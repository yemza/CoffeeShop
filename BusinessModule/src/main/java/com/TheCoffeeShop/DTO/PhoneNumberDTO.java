package com.TheCoffeeShop.DTO;



public class PhoneNumberDTO {
  private Long idPhoneNumber;
  private int phoneNumber;
  private CoffeeShopDTO coffeeShop;
  private UserDTO user;

  public Long getIdPhoneNumber() {
    return idPhoneNumber;
  }

  public void setIdPhoneNumber(Long idPhoneNumber) {
    this.idPhoneNumber = idPhoneNumber;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CoffeeShopDTO getCoffeeShop() {
    return coffeeShop;
  }

  public void setCoffeeShop(CoffeeShopDTO coffeeShop) {
    this.coffeeShop = coffeeShop;
  }

  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }
}
