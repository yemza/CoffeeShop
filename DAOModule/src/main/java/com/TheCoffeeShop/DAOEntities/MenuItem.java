package com.TheCoffeeShop.DAOEntities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="MenuItem")
public class MenuItem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "menu_item_id" ,nullable = false)
  private Long idMenuItem;

  @Column(name = "name")
  private String name;

  @Column(name = "image_item" , length = Integer.MAX_VALUE)
  private String itemImage;

  @Column(name = "ingredient")
  private String ingredient;

  @OneToMany(mappedBy = "menuItem")
  private Set<MenuItemDetails> menuItemDetails;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "menu_category_id")
  private MenuCategory menuCategory;

  @OneToMany(mappedBy = "menuItem")
  private Set<OrderDetails> orderDetails;


  public Long getIdMenuItem() {
    return idMenuItem;
  }

  public void setIdMenuItem(Long idMenuItem) {
    this.idMenuItem = idMenuItem;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public Set<MenuItemDetails> getMenuItemDetails() {
    return menuItemDetails;
  }

  public void setMenuItemDetails(Set<MenuItemDetails> menuItemDetails) {
    this.menuItemDetails = menuItemDetails;
  }

  public MenuCategory getMenuCategory() {
    return menuCategory;
  }

  public void setMenuCategory(MenuCategory menuCategory) {
    this.menuCategory = menuCategory;
  }

  public Set<OrderDetails> getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(Set<OrderDetails> orderDetails) {
    this.orderDetails = orderDetails;
  }

  public String getItemImage() {
    return itemImage;
  }

  public void setItemImage(String itemImage) {
    this.itemImage = itemImage;
  }
}
