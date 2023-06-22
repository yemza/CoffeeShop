package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.MenuCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuCategoryRepository  extends JpaRepository<MenuCategory, Long> {
}
