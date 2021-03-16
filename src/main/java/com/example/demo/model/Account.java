package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "account")
@ToString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountid;
    private String accountType;
    private long clientCardNo;
    private long creditCardNo;
    @Column(name="first_name")
    private String customerName;
    private int branchNo;
    private int transitCode;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="customerid",referencedColumnName = "accountid")
    private List<Customer> customer;


}
