package com.pallavi.project.AirBnb.dto;


import com.pallavi.project.AirBnb.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}

