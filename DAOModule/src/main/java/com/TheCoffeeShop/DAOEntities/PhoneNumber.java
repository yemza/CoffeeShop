package com.TheCoffeeShop.DAOEntities;

import javax.persistence.*;

@Entity
@Table(name="PhoneNumber")
public class PhoneNumber {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "phone_number_id", nullable = false)
  private Long idPhoneNumber;

  @Column(name = "phone_number", nullable = false)
  private int phoneNumber;
  @ManyToOne
  @JoinColumn(name = "coffeeShop_id")
  private CoffeeShop coffeeShop;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public Long getIdPhoneNumber() {
    return idPhoneNumber;
  }

  public void setIdPhoneNumber(Long idPhoneNumber) {
    this.idPhoneNumber = idPhoneNumber;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
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
}
