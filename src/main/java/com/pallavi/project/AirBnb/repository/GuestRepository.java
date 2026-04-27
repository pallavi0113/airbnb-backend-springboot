package com.pallavi.project.AirBnb.repository;

import com.pallavi.project.AirBnb.entity.Guest;
import com.pallavi.project.AirBnb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest,Long> {
    List<Guest> findByUser(User user);
}
