package com.mpe.mpeuser.Dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private String userId;
	private String userAlias;
	private String phone;
	private int enable;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	private LocalDateTime exitDate;
	private int likeCount;
}
