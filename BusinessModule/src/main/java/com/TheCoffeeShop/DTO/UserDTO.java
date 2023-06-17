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

}
