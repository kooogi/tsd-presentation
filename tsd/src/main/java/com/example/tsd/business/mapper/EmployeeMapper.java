package com.example.tsd.business.mapper;

import org.springframework.stereotype.Component;

import com.example.tsd.database.entity.Employee;
import com.example.tsd.database.entity.EmployeeDto;

@Component
public class EmployeeMapper {
    public EmployeeDto toDto(Employee employee) {
        return null;
        // implement mapping logic
    }

    public Employee toEntity(EmployeeDto dto) {
        return null;
        // implement mapping logic
    }
}

