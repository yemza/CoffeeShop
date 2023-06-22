package com.TheCoffeeShop.DAOEntities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="CoffeeShop")
public class CoffeeShop {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "coffee_shop_id", nullable = false)
  private Long idCoffeeShop;

  @Column(name = "licence_number")
  private int licenceNumber;
  @Column(name = "coffee_shop_name")
  private String coffeeShopName;

  @Column(name = "coffee_shop_address")
  private String address;

  @ManyToOne
  @JoinColumn(name = "city_id")
  private City city;

  @OneToMany(mappedBy = "coffeeShop")
  @Column(name = "phones_numbers_id")
  private Set<PhoneNumber> phonesNumbers;

  @OneToMany(mappedBy = "coffeeShop")
  @Column(name = "coffee_shop_images_id")
  private Set<ImageCoffeeShop> coffeeShopImages;

  @Column(name = "coffee_shop_logo")
  private String logoCoffeeShop;

  @OneToMany(mappedBy = "coffeeShop")
  private Set<MenuCoffeeShop> menuCoffeeShops;

  @OneToMany(mappedBy = "coffeeShop")
  private Set<Order> orders;

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

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Set<PhoneNumber> getPhonesNumbers() {
    return phonesNumbers;
  }

  public void setPhonesNumbers(Set<PhoneNumber> phonesNumbers) {
    this.phonesNumbers = phonesNumbers;
  }

  public Set<ImageCoffeeShop> getCoffeeShopImages() {
    return coffeeShopImages;
  }

  public void setCoffeeShopImages(Set<ImageCoffeeShop> coffeeShopImages) {
    this.coffeeShopImages = coffeeShopImages;
  }

  public String getLogoCoffeeShop() {
    return logoCoffeeShop;
  }

  public void setLogoCoffeeShop(String logoCoffeeShop) {
    this.logoCoffeeShop = logoCoffeeShop;
  }

  public Set<MenuCoffeeShop> getMenuCoffeeShops() {
    return menuCoffeeShops;
  }

  public void setMenuCoffeeShops(Set<MenuCoffeeShop> menuCoffeeShops) {
    this.menuCoffeeShops = menuCoffeeShops;
  }

  public Set<Order> getOrders() {
    return orders;
  }

  public void setOrders(Set<Order> orders) {
    this.orders = orders;
  }
}
