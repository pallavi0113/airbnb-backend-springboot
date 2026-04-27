package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Hotel;
import com.pallavi.project.AirBnb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository< Hotel, Long > {
    List<Hotel> findByOwner(User user);
}
