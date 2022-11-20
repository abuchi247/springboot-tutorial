package com.example.jwtsampleapp.utils;

import com.auth0.jwt.algorithms.Algorithm;


public class Helper {
    private final String APP_SECRET = "secret";
    private final Algorithm algorithm = Algorithm.HMAC256(APP_SECRET.getBytes());

    public Helper() {
    }

    public String getAPP_SECRET() {
        return APP_SECRET;
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }
}
