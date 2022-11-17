package com.example.questionbank.data;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {

    private UserInfo userInfo;

    public UserDetailsImpl(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // check if the user role is null
        if(userInfo.getRoles() != null && !userInfo.getRoles().isEmpty()){
            // create an array of the roles with ROLE_<role>
            return Arrays.stream(userInfo.getRoles().split(",")).map(role -> new SimpleGrantedAuthority("ROLE_"+role)).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    /**
     * @return
     */
    @Override
    public String getPassword() {
        return userInfo.getPassword();
    }

    /**
     * @return
     */
    @Override
    public String getUsername() {
        return userInfo.getUsername();
    }

    /**
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean isEnabled() {
        return userInfo.isActive();
    }
}
