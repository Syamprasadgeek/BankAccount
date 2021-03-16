package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import com.example.demo.model.Account;

import java.util.List;

@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //  @JsonIgnore
    private int Id;
    private String CustomerName;
    private String CustomerLastName;
    private String Email;
    private String motherMaidenName;
    private String Address;
//  @ManyToOne(cascade = CascadeType.ALL)
//   @JoinColumn()//name="accountid")
//    private Account account;
}
