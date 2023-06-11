package com.TheCoffeShop.DAOEntities;

import javax.persistence.*;

@Entity
@Table(name="Role")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "phone_number_id", nullable = false)
  private Long idRole;

  @Column(name = "role", nullable = false)
  private String role;

  @ManyToOne
  @JoinColumn(name="use_id")
  private User user;

  public Long getIdRole() {
    return idRole;
  }

  public void setIdRole(Long idRole) {
    this.idRole = idRole;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
