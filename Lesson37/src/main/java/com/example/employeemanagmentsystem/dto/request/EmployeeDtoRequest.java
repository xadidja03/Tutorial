package com.example.employeemanagmentsystem.dto.request;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDtoRequest {
    Long id;
    String name;
    String department;
    Double salary;
}
