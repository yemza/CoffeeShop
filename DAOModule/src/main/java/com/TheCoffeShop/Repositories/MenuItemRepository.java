package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
