package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
