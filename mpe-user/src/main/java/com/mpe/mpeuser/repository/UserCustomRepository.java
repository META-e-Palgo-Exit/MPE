package com.mpe.mpeuser.Repository;

import com.mpe.mpeuser.Dto.UserDto;

public interface UserCustomRepository {
	UserDto createUser(UserDto userDto);
	UserDto findUserByUserId(UserDto userDto);
	UserDto updateUserByUserId(UserDto userDto);
	UserDto deleteUserByUserId(UserDto userDto);
}
