package com.TheCoffeeShop.DTO;


import java.util.Set;

public class CountryDTO {

  private Long idCountry;

  private String name;

  private Set<CityDTO> citiesDTO;

  public Long getIdCountry() {
    return idCountry;
  }

  public void setIdCountry(Long idCountry) {
    this.idCountry = idCountry;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<CityDTO> getCitiesDTO() {
    return citiesDTO;
  }

  public void setCitiesDTO(Set<CityDTO> citiesDTO) {
    this.citiesDTO = citiesDTO;
  }
}
