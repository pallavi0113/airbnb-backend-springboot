package com.pallavi.project.AirBnb.dto;

import com.pallavi.project.AirBnb.entity.User;
import com.pallavi.project.AirBnb.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
