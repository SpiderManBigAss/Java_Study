package com.svistunovich.spring.service;

import com.svistunovich.spring.database.repository.CompanyRepository;
import com.svistunovich.spring.database.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository ;
    private final CompanyRepository companyRepository;


    public UserService(UserRepository userRepository,
                       CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
