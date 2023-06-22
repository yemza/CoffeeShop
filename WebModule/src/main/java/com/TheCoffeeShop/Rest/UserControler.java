package com.TheCoffeeShop.Rest;


import com.TheCoffeeShop.DAOEntities.User;
import com.TheCoffeeShop.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControler {

  private UserService userService;

  public UserControler(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("users")
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }


  @GetMapping("user")
  public User getUserById(@PathVariable Long userId){
    return userService.getUserById(userId);
  }



  @PostMapping("user")
  public User addNewUser(@RequestBody User user){
    return userService.addNewUser(user);
  }


  @PutMapping("user")
  public User updateUser(@RequestBody User user){
    return userService.updateUser(user);
  }

  @DeleteMapping("user")
  public void deleteUser(@PathVariable Long userId){
    userService.deleteUser(userId);
  }

}


















