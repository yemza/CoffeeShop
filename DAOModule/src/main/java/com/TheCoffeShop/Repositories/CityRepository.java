package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
