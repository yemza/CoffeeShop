package com.TheCoffeeShop.Services.Impl;

import com.TheCoffeeShop.DAOEntities.User;
import com.TheCoffeeShop.Repositories.UserRepository;
import com.TheCoffeeShop.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
  @Override
  public User getUserById(Long userId) {
    return userRepository.getById(userId);
  }

  @Override
  public User addNewUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public User updateUser(User user) {
    return userRepository.saveAndFlush(user);
  }

  @Override
  public void deleteUser(Long userId) {
   userRepository.delete(getUserById(userId));
  }
}
