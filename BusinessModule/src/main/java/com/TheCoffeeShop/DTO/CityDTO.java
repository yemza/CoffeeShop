package com.TheCoffeeShop.DTO;

import java.util.Set;


public class CityDTO {

  private Long idCity;

  private String name;

  private CountryDTO countryDTO;

  private Set<CoffeeShopDTO> coffeeShopsDTO;

  private Set<UserDTO> usersDTO ;

  public Long getIdCity() {
    return idCity;
  }

  public void setIdCity(Long idCity) {
    this.idCity = idCity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountryDTO getCountryDTO() {
    return countryDTO;
  }

  public void setCountryDTO(CountryDTO countryDTO) {
    this.countryDTO = countryDTO;
  }

  public Set<CoffeeShopDTO> getCoffeeShopsDTO() {
    return coffeeShopsDTO;
  }

  public void setCoffeeShopsDTO(Set<CoffeeShopDTO> coffeeShopsDTO) {
    this.coffeeShopsDTO = coffeeShopsDTO;
  }

  public Set<UserDTO> getUsersDTO() {
    return usersDTO;
  }

  public void setUsersDTO(Set<UserDTO> usersDTO) {
    this.usersDTO = usersDTO;
  }
}
