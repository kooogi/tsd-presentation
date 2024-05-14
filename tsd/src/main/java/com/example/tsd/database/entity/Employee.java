package com.example.tsd.database.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String position;
    private BigDecimal salary;
}
