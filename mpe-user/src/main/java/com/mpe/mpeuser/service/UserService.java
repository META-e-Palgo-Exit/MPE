package com.mpe.mpeuser.Service;

import com.mpe.mpeuser.Dto.UserDto;

public interface UserService {
	UserDto setUserInfo(UserDto userDto);
	UserDto getUserInfo(UserDto userDto);
	UserDto updateUserInfo(UserDto userDto);
	UserDto deleteUserInfo(UserDto userDto);
}
