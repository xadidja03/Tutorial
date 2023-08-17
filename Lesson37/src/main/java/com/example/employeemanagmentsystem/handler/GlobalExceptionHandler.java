package com.example.employeemanagmentsystem.handler;
import com.example.employeemanagmentsystem.dto.response.ExceptionResponse;
import com.example.employeemanagmentsystem.enums.Exceptions;
import com.example.employeemanagmentsystem.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ExceptionResponse handle(){
        return ExceptionResponse.builder()
                .localDateTime(LocalDateTime.now())
                .message(Exceptions.EMPLOYEE_NOT_FOUND_EXCEPTION.getMessage())
                .build();

    }
}
