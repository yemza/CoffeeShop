package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
}
