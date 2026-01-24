package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository< Hotel, Long > {
}
