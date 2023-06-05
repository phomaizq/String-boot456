package com.example.ASM7;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ps {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String plainPassword = "123";
        String encodedPassword = passwordEncoder.encode(plainPassword);

        System.out.println(encodedPassword);
    }

}
