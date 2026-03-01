package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Long> {
}
