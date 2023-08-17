package com.company.firstspringproject.service;

import com.company.firstspringproject.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<List<Employee>> findAll();
    ResponseEntity<Employee> findById(Long id);
    ResponseEntity<String> update(Employee employee);
    ResponseEntity<String> delete(Long id);
    ResponseEntity<Employee> create(Employee employee);

}
