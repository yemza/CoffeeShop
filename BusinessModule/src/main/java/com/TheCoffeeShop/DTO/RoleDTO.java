package com.TheCoffeeShop.DTO;



public class RoleDTO {

  private Long idRole;

  private String role;

  private UserDTO user;

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

  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }
}
