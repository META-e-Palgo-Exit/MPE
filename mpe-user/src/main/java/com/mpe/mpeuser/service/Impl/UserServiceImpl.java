package com.mpe.mpeuser.Service.Impl;

import org.springframework.stereotype.Service;

import com.mpe.mpeuser.Dto.UserDto;
import com.mpe.mpeuser.Repository.UserRepository;
import com.mpe.mpeuser.Service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public UserDto setUserInfo(UserDto userDto) {
		return null;
	}

	@Override
	public UserDto getUserInfo(UserDto userDto) {
		return userRepository.findUserByUserId(userDto);
	}

	@Override
	public UserDto updateUserInfo(UserDto userDto) {
		return null;
	}

	@Override
	public UserDto deleteUserInfo(UserDto userDto) {
		return null;
	}
}
