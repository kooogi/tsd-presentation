package com.example.tsd.business.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tsd.database.entity.Employee;
import com.example.tsd.database.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // implement other CRUD operations
}
