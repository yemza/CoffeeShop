package com.TheCoffeShop.DAOEntities;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="MenuCoffeeShop")
public class MenuCoffeeShop {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="menu_coffee_shop_id")
  private Long idMenuCoffeeShop;

  @OneToMany(mappedBy = "menuCoffeeShop")
  private Set<MenuCategory> menuCoffeeShops;


  @ManyToOne
  @JoinColumn(name="coffee_shop_id")
  private CoffeeShop coffeeShop;


  public Long getIdMenuCoffeeShop() {
    return idMenuCoffeeShop;
  }

  public void setIdMenuCoffeeShop(Long idMenuCoffeeShop) {
    this.idMenuCoffeeShop = idMenuCoffeeShop;
  }

  public Set<MenuCategory> getMenuCoffeeShops() {
    return menuCoffeeShops;
  }

  public void setMenuCoffeeShops(Set<MenuCategory> menuCoffeeShops) {
    this.menuCoffeeShops = menuCoffeeShops;
  }

  public CoffeeShop getCoffeeShop() {
    return coffeeShop;
  }

  public void setCoffeeShop(CoffeeShop coffeeShop) {
    this.coffeeShop = coffeeShop;
  }
}
