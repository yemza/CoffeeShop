package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.CoffeeShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeShopRepository extends JpaRepository<CoffeeShop, Long> {
}
