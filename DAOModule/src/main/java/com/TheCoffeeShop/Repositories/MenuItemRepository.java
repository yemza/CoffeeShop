package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
