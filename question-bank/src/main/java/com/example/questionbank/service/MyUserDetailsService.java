package com.example.questionbank.service;

import com.example.questionbank.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implement the user details service that looks up the username
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByUsername(username);

        System.out.println(user);

        // throw exception
        if (user == null)
            throw new UsernameNotFoundException("Not found: " + username);

        Role role = roleRepository.findRoleByRoleId(user.getRoleId());
        return new MyUserDetails(user, role);
    }


}
