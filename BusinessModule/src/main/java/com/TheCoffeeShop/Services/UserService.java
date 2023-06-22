package com.TheCoffeeShop.Services;

import com.TheCoffeeShop.DAOEntities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserService {
  
   List<User> getAllUsers();
   User getUserById(@PathVariable Long userId);
   User addNewUser(@RequestBody User user);
   User updateUser(@RequestBody User user);
   void deleteUser(@PathVariable Long userId);
}
