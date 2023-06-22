package com.TheCoffeeShop.DAOEntities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id" , nullable = false)
    private Long idUser;

    @Column(name = "first_name" )
    private String firstName;

    @Column(name = "last_name" )
    private String lastName;

    @Column(name = "CNI" )
    private String CNI;

    @Column(name = "address" )
    private String address;

    @Column(name = "identity_image" )
    private String identityImage;

    @Column(name = "image" )
    private String image;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;


    @OneToMany(mappedBy = "user")
    private Set<PhoneNumber> phoneNumbers;


    @JsonIgnore
    @ManyToMany
    @JoinTable(
      name = "user_role",
      joinColumns = { @JoinColumn(name = "id_user", referencedColumnName = "user_id") },
      inverseJoinColumns = { @JoinColumn(name = "role_name", referencedColumnName = "role") }
    )
    private Set<Role> roles = new HashSet<>();;


    @OneToMany(mappedBy = "user")
    private Set<Order> orders;


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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
