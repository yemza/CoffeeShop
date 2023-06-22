package com.TheCoffeeShop.Repositories;

import com.TheCoffeeShop.DAOEntities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
