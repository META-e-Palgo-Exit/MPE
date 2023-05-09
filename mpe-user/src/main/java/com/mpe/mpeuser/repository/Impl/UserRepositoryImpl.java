package com.mpe.mpeuser.Repository.Impl;


import static com.mpe.mpeuser.Entity.QUsers.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mpe.mpeuser.Dto.UserDto;
import com.mpe.mpeuser.Entity.QUsers;
import com.mpe.mpeuser.Entity.Users;
import com.mpe.mpeuser.Repository.UserCustomRepository;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserCustomRepository {

	private final JPAQueryFactory queryFactory;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public UserDto createUser(UserDto userDto) {
		return null;
	}

	@Override
	public UserDto findUserByUserId(UserDto userDto) {
		Users result = queryFactory
			.select(users)
			.from(users)
			.fetchOne();


		UserDto resultDto = UserDto.builder()
			.userId(result.getUserId())
			.userAlias(result.getUserAlias())
			.phone(result.getPhone())
			.createDate(result.getCreateDate())
			.updateDate(result.getUpdateDate())
			.likeCount(result.getLikeCount())
			.build();
		return resultDto;
	}

	@Override
	public UserDto updateUserByUserId(UserDto userDto) {
		return null;
	}

	@Override
	public UserDto deleteUserByUserId(UserDto userDto) {
		return null;
	}
}
