package com.moetez.driver.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.moetez.driver.entities.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}

