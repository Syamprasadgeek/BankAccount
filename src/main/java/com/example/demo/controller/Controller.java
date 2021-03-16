package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    public AccountRepository accountRepository;

    @Autowired
    public CustomerRepository customerRepository;

    @GetMapping("/AcctInfo")
    public Iterable<Account> getAcct(){
        return accountRepository.findAll();
    }

    @PostMapping("/AcctInfo")
    public Map postAcct(@RequestBody Account acct){
        accountRepository.save(acct);
        return Collections.singletonMap("Message","Account added to the databse");
    }

    @PostMapping("/CustInfo")
    public Map postAcct(@RequestBody Customer cust){
        customerRepository.save(cust);
        return Collections.singletonMap("Message","Account added to the databse");
    }
}
