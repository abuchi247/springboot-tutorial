package com.example.jwtsampleapp.service;

import com.example.jwtsampleapp.domain.Role;
import com.example.jwtsampleapp.domain.UserInfo;

import java.util.List;

public interface UserService {
    UserInfo saveUser(UserInfo userInfo);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    UserInfo getUser(String username);
    List<UserInfo> getUsers();
}
