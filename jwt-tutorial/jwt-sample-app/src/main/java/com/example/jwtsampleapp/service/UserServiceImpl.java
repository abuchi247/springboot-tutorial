package com.example.jwtsampleapp.service;

import com.example.jwtsampleapp.domain.Role;
import com.example.jwtsampleapp.domain.UserInfo;
import com.example.jwtsampleapp.repo.RoleRepository;
import com.example.jwtsampleapp.repo.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor // create a constructor and make sure all the arguments are passed into the construction - lombok
@Transactional  // make sure everything is transactional
@Slf4j // want to log everything
public class UserServiceImpl implements UserService {
    private final UserInfoRepository userInfoRepository;
    private final RoleRepository roleRepository;

    @Override
    public UserInfo saveUser(UserInfo userInfo) {
        log.info("Saving new user {} to the database", userInfo.getName());
        return userInfoRepository.save(userInfo);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        // find the user by username
        UserInfo userInfo = userInfoRepository.findByUsername(username);
        // check if user is null
        if (userInfo == null) {
            log.info("Username {} not found!", username);
        }
        Role role = roleRepository.findByName(roleName);

        // check if role is null
        if (role == null) {
            log.info("Role {} not found!", roleName);
        }

        if (role != null && userInfo != null) {
            log.info("Adding role {} to user {}!", roleName, username);
            // add to the user role
            userInfo.getRoles().add(role); // will automatically save in the database because we have transactional
        }
    }

    @Override
    public UserInfo getUser(String username) {
        log.info("Fetching user {}!", username);
        return userInfoRepository.findByUsername(username);
    }

    @Override
    public List<UserInfo> getUsers() {
        log.info("Fetching all users");
        return userInfoRepository.findAll();
    }
}
