package com.TheCoffeeShop.DAOEntities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="MenuCategory")
public class MenuCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "menu_category_id", nullable = false)
  private Long idMenuCategory;
  @Column(name="name_category")
  private String nameMenuCategory;

  @OneToMany(mappedBy = "menuCategory")
  @Column(name="menu_item_id")
  private Set<MenuItem> MenuItems;

  @ManyToOne
  @JoinColumn(name = "menu_coffee_shop")
  private MenuCoffeeShop menuCoffeeShop;


  public Long getIdMenuCategory() {
    return idMenuCategory;
  }

  public void setIdMenuCategory(Long idMenuCategory) {
    this.idMenuCategory = idMenuCategory;
  }

  public String getNameMenuCategory() {
    return nameMenuCategory;
  }

  public void setNameMenuCategory(String nameMenuCategory) {
    this.nameMenuCategory = nameMenuCategory;
  }

  public Set<MenuItem> getMenuItems() {
    return MenuItems;
  }

  public void setMenuItems(Set<MenuItem> menuItems) {
    MenuItems = menuItems;
  }

  public MenuCoffeeShop getMenuCoffeeShop() {
    return menuCoffeeShop;
  }

  public void setMenuCoffeeShop(MenuCoffeeShop menuCoffeeShop) {
    this.menuCoffeeShop = menuCoffeeShop;
  }
}
