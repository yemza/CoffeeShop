package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
