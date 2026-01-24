package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
