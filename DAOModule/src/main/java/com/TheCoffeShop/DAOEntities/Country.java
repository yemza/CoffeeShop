package com.TheCoffeShop.DAOEntities;


import javax.persistence.*;
import java.util.Set;

@Entity()
@Table(name="Country")
public class Country {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "country_id", nullable = false)
  private Long idCountry;

  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy = "country")
  private Set<City> cities;

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

  public Set<City> getCities() {
    return cities;
  }

  public void setCities(Set<City> cities) {
    this.cities = cities;
  }

}
