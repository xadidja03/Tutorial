package com.company.firstspringproject.service.impl;

import com.company.firstspringproject.entity.Employee;
import com.company.firstspringproject.repository.EmployeeRepository;
import com.company.firstspringproject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @Override
    public ResponseEntity<Employee> findById(Long id) {
        return ResponseEntity.ok(employeeRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Employee not found")));
    }

    @Override
    public ResponseEntity<String> update(Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.ok("Employee updated successfully");
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        employeeRepository.deleteById(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    @Override
    public ResponseEntity<Employee> create(Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity(employee,HttpStatus.CREATED);
    }
}
