package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
