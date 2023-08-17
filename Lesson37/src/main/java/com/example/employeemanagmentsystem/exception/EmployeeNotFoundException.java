package com.example.employeemanagmentsystem.exception;
import com.example.employeemanagmentsystem.enums.Exceptions;
public class EmployeeNotFoundException extends  RuntimeException {
    public EmployeeNotFoundException(){
        super(Exceptions.EMPLOYEE_NOT_FOUND_EXCEPTION.getMessage());
    }
}
