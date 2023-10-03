package com.example.jwtlogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtlogin.Entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>  {
	
	 Optional<UserInfo> findByName(String username);

}
