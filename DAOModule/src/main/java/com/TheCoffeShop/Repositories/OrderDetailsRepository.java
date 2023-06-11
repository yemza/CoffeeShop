package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.Order;
import com.TheCoffeShop.DAOEntities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
