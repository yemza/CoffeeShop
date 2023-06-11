package com.TheCoffeShop.DAOEntities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="City")
public class City {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "city_id", nullable = false)
  private Long idCity;

  @Column(name = "name")
  private String name;

  @ManyToOne
  @JoinColumn(name ="country_id")
  private Country country;

  @OneToMany(mappedBy = "city")
  @JsonIgnore
  private Set<CoffeeShop> coffeeShops;

  @OneToMany(mappedBy = "city")
  @JsonIgnore
  private Set<User> users ;

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

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public Set<CoffeeShop> getCoffeeShops() {
    return coffeeShops;
  }

  public void setCoffeeShops(Set<CoffeeShop> coffeeShops) {
    this.coffeeShops = coffeeShops;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }
}
