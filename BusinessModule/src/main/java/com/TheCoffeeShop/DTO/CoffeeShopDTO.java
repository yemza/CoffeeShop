package com.TheCoffeeShop.DTO;

import java.util.Set;

public class CoffeeShopDTO {

  private Long idCoffeeShop;
  private int licenceNumber;
  private String coffeeShopName;
  private String address;
  private String logoCoffeeShop;
  private CityDTO cityDTO;
  private Set<PhoneNumberDTO> phonesNumbersDTO;
  private Set<ImageCoffeeShopDTO> coffeeShopImagesDTO;
  private Set<MenuCoffeeShopDTO> menuCoffeeShopsDTO;
  private Set<OrderDTO> ordersDTO;


  public Long getIdCoffeeShop() {
    return idCoffeeShop;
  }

  public void setIdCoffeeShop(Long idCoffeeShop) {
    this.idCoffeeShop = idCoffeeShop;
  }

  public int getLicenceNumber() {
    return licenceNumber;
  }

  public void setLicenceNumber(int licenceNumber) {
    this.licenceNumber = licenceNumber;
  }

  public String getCoffeeShopName() {
    return coffeeShopName;
  }

  public void setCoffeeShopName(String coffeeShopName) {
    this.coffeeShopName = coffeeShopName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLogoCoffeeShop() {
    return logoCoffeeShop;
  }

  public void setLogoCoffeeShop(String logoCoffeeShop) {
    this.logoCoffeeShop = logoCoffeeShop;
  }

  public CityDTO getCityDTO() {
    return cityDTO;
  }

  public void setCityDTO(CityDTO cityDTO) {
    this.cityDTO = cityDTO;
  }

  public Set<PhoneNumberDTO> getPhonesNumbersDTO() {
    return phonesNumbersDTO;
  }

  public void setPhonesNumbersDTO(Set<PhoneNumberDTO> phonesNumbersDTO) {
    this.phonesNumbersDTO = phonesNumbersDTO;
  }

  public Set<ImageCoffeeShopDTO> getCoffeeShopImagesDTO() {
    return coffeeShopImagesDTO;
  }

  public void setCoffeeShopImagesDTO(Set<ImageCoffeeShopDTO> coffeeShopImagesDTO) {
    this.coffeeShopImagesDTO = coffeeShopImagesDTO;
  }

  public Set<MenuCoffeeShopDTO> getMenuCoffeeShopsDTO() {
    return menuCoffeeShopsDTO;
  }

  public void setMenuCoffeeShopsDTO(Set<MenuCoffeeShopDTO> menuCoffeeShopsDTO) {
    this.menuCoffeeShopsDTO = menuCoffeeShopsDTO;
  }

  public Set<OrderDTO> getOrdersDTO() {
    return ordersDTO;
  }

  public void setOrdersDTO(Set<OrderDTO> ordersDTO) {
    this.ordersDTO = ordersDTO;
  }
}
