package com.example.jwtsampleapp.repo;

import com.example.jwtsampleapp.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUsername(String username);
}
