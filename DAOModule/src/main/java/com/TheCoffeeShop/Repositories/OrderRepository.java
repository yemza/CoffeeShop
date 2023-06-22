package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
