package com.TheCoffeeShop.DAOEntities;

import javax.persistence.*;

@Entity
@Table(name="MenuItemDetails")
public class MenuItemDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "menu_item_details_id", nullable = false)
  private Long idMenuItemDetails;

  @Column(name="size")
  private String size;

  @Column(name="price")
  private Double price;

  @ManyToOne
  @JoinColumn(name = "menu_item_id")
  private MenuItem menuItem;


  public Long getIdMenuItemDetails() {
    return idMenuItemDetails;
  }

  public void setIdMenuItemDetails(Long idMenuItemDetails) {
    this.idMenuItemDetails = idMenuItemDetails;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MenuItem getMenuItem() {
    return menuItem;
  }

  public void setMenuItem(MenuItem menuItem) {
    this.menuItem = menuItem;
  }
}
