package com.mpe.mpeuser.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "users")
public class Users extends BaseTimeEntity{
	@Id
	@Column
	private String userId;
	@Column
	private String userAlias;
	@Column
	private String phone;
	@Column
	private int enable;
	@Column
	private LocalDateTime exitDate;
	@Column
	private int likeCount;
}
