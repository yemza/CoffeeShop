package com.TheCoffeShop.Repositories;

import com.TheCoffeShop.DAOEntities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
