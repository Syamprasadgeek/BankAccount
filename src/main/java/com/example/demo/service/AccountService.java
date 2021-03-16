package com.example.demo.service;


import com.example.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private JdbcTemplate jdbctemplate;

    public Account getAccountData(){
        String query = "Select * from Account";
        jdbctemplate.execute(query);

    }
}
