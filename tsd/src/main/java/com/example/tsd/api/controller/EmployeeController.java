package com.example.tsd.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tsd.business.impl.EmployeeService;
import com.example.tsd.business.mapper.EmployeeMapper;
import com.example.tsd.database.entity.Employee;
import com.example.tsd.database.entity.EmployeeDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService service;
    private final EmployeeMapper mapper;

    @GetMapping
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = service.getAllEmployees();
        return employees.stream()
        .map(mapper::toDto)
        .toList();
    }

    // implement other CRUD operations
}

