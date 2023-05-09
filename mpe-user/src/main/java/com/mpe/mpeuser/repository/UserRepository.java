package com.mpe.mpeuser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mpe.mpeuser.Entity.Users;

public interface UserRepository extends JpaRepository<Users, String>, UserCustomRepository{
}
