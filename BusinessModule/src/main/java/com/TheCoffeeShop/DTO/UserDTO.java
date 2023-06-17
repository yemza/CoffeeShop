package com.TheCoffeeShop.DTO;

import com.TheCoffeShop.DAOEntities.City;
import com.TheCoffeShop.DAOEntities.Order;
import com.TheCoffeShop.DAOEntities.PhoneNumber;
import com.TheCoffeShop.DAOEntities.Role;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Role")
public class UserDTO {


    private Long idUser;
    private String firstName;
    private String lastName;
    private String CNI;
    private String address;
    private String identityImage;
    private String image;
    private CityDTO city;
    private Set<PhoneNumberDTO> phoneNumbers;
    private Set<RoleDTO> roles;
    private Set<OrderDTO> orders;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCNI() {
        return CNI;
    }

    public void setCNI(String CNI) {
        this.CNI = CNI;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityImage() {
        return identityImage;
    }

    public void setIdentityImage(String identityImage) {
        this.identityImage = identityImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public Set<PhoneNumberDTO> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<PhoneNumberDTO> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
    }

    public Set<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderDTO> orders) {
        this.orders = orders;
    }
}
