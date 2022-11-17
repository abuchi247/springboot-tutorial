package com.example.questionbank.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Initialize Database
 */
@Component
public class DbInitializer implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DbInitializer.class);

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        logger.info("Inside the DbInitializer");
        // delete everything in the user table
        userInfoRepository.deleteAll();
        List<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(new UserInfo("user1", passwordEncoder.encode("pass1"), "USER"));
        userInfoList.add(new UserInfo("user2", passwordEncoder.encode("pass2"), "USER"));
        userInfoList.add(new UserInfo("admin1", passwordEncoder.encode("admin1"), "ADMIN"));
        userInfoList.add(new UserInfo("admin2", passwordEncoder.encode("admin2"), "ADMIN"));

        // save to db
        userInfoRepository.saveAll(userInfoList);
        logger.info("Successfully inserted records inside user table!");
    }
}
