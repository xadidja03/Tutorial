package com.example.employeemanagmentsystem.enums;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
@Getter
@RequiredArgsConstructor
public enum Exceptions {
    EMPLOYEE_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND,"Employee not found!");
    private final HttpStatus status;
    private final String message;

}
