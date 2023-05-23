package com.madeeasy.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
//    private final UserRepository userRepository;

    public String getName() {
        return "pabitra";
    }

    public boolean validateUserName(String name) {
        return getName().equals(name);
    }
}
