package com.example.netology_authorizationservice_spring.exception;

public class InvalidCredentials  extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}