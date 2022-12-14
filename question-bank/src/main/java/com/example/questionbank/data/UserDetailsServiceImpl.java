package com.example.questionbank.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
    @Autowired
    private UserInfoRepository userInfoRepository;


    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // find the user using the username
        UserInfo userInfo = userInfoRepository.findByUsername(username);

        // user not found
        if (userInfo == null){
            logger.info(username + " not found");
            throw new UsernameNotFoundException("User not found!");
        }
        return new UserDetailsImpl(userInfo);
    }
}
