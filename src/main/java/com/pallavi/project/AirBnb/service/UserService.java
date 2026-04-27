package com.pallavi.project.AirBnb.service;

import com.pallavi.project.AirBnb.dto.ProfileUpdateRequestDto;
import com.pallavi.project.AirBnb.dto.UserDto;
import com.pallavi.project.AirBnb.entity.User;

public interface UserService {
    User getUserById(Long id);
    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
