package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
