package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Inventory;
import com.pallavi.project.AirBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
