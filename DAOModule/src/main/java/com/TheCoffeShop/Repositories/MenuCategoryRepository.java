package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.MenuCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuCategoryRepository  extends JpaRepository<MenuCategory, Long> {
}
