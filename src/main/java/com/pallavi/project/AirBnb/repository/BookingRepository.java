package com.pallavi.project.AirBnb.repository;


import com.pallavi.project.AirBnb.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
