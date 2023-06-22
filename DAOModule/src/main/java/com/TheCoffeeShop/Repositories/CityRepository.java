package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
