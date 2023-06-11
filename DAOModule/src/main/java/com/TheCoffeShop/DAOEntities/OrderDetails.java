package com.TheCoffeShop.DAOEntities;


import javax.persistence.*;

@Entity
@Table(name="OrderDetails")
public class OrderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="order_details_id", nullable = false)
  private Long idOrderDetails;

  @Column(name="quantity")
  private int quantity;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  @ManyToOne
  @JoinColumn(name="menu_item_id")
  private MenuItem menuItem;

  public Long getIdOrderDetails() {
    return idOrderDetails;
  }

  public void setIdOrderDetails(Long idOrderDetails) {
    this.idOrderDetails = idOrderDetails;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public MenuItem getMenuItem() {
    return menuItem;
  }

  public void setMenuItem(MenuItem menuItem) {
    this.menuItem = menuItem;
  }
}

