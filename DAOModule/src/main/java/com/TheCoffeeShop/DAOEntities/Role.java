package com.TheCoffeeShop.DAOEntities;

import javax.persistence.*;

@Entity
@Table(name="Role")
public class Role {
  @Id
  @Column(name = "role", nullable = false)
  private String role;


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
