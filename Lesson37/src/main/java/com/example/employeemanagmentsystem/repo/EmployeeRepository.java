package com.example.employeemanagmentsystem.repo;
import com.example.employeemanagmentsystem.model.Employee;
import java.util.List;
import java.util.Optional;
public interface EmployeeRepository {
    List<Employee> findAll();

    Optional <Employee> findById(Long id);

    int insert(Employee employee);

    int update(Employee employee);

    int delete(Long id);
}