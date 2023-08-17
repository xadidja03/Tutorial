package com.example.employeemanagmentsystem.service;

import com.example.employeemanagmentsystem.dto.request.EmployeeDtoRequest;
import com.example.employeemanagmentsystem.dto.response.EmployeeDtoResponse;
import com.example.employeemanagmentsystem.dto.response.ResponseDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDtoResponse> findAll();

    EmployeeDtoResponse findById(Long id);

    ResponseDto insert(EmployeeDtoRequest employee);
    ResponseDto update(EmployeeDtoRequest employee);
    ResponseDto delete(Long id);
}
