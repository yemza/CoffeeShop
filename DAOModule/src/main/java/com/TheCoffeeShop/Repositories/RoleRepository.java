package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
