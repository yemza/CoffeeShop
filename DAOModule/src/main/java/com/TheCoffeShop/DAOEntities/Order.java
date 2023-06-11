package com.TheCoffeShop.DAOEntities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="order_coffee_shop")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="order_id", nullable = false)
  private Long idOrder;

  @Column(name="date")
  private Date date;

  @ManyToOne
  @JoinColumn(name = "coffee_shop_id")
  private CoffeeShop coffeeShop;

  @ManyToOne
  @JoinColumn(name="user_id")
  private User user;

  @OneToMany(mappedBy = "order")
  private Set<OrderDetails> orderDetails;


  public Long getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(Long idOrder) {
    this.idOrder = idOrder;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public CoffeeShop getCoffeeShop() {
    return coffeeShop;
  }

  public void setCoffeeShop(CoffeeShop coffeeShop) {
    this.coffeeShop = coffeeShop;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Set<OrderDetails> getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(Set<OrderDetails> orderDetails) {
    this.orderDetails = orderDetails;
  }
}
