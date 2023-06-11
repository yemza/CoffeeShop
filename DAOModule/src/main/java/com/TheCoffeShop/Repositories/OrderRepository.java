package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
