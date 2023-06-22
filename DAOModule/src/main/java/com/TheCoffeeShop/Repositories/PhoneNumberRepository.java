package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
}
