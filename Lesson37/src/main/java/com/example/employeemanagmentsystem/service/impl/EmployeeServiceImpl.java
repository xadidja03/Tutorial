package com.example.employeemanagmentsystem.service.impl;
import com.example.employeemanagmentsystem.dto.request.EmployeeDtoRequest;
import com.example.employeemanagmentsystem.dto.response.EmployeeDtoResponse;
import com.example.employeemanagmentsystem.dto.response.ResponseDto;
import com.example.employeemanagmentsystem.exception.EmployeeNotFoundException;
import com.example.employeemanagmentsystem.model.Employee;
import com.example.employeemanagmentsystem.repo.EmployeeRepository;
import com.example.employeemanagmentsystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Component
@Service
@RequiredArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<EmployeeDtoResponse> findAll() {
     return employeeRepository.findAll().stream()
             .map(employee -> modelMapper.map(employee,EmployeeDtoResponse.class))
             .collect(Collectors.toList());
    }
    @Override
    public EmployeeDtoResponse findById(Long id) {
        return modelMapper.map(employeeRepository.findById(id).orElseThrow(EmployeeNotFoundException::new),
                EmployeeDtoResponse.class);
    }
    @Override
    public ResponseDto insert(EmployeeDtoRequest employeeDto) {
        return employeeRepository.insert(modelMapper.map(employeeDto,Employee.class)) >0
                ? new ResponseDto("Employee created successfully!")     :
                    new ResponseDto("Employee created failed!")      ;
    }
    @Override
    public ResponseDto update(EmployeeDtoRequest employeeDto) {
        return employeeRepository.update(modelMapper.map(employeeDto, Employee.class)) > 0
                ? new ResponseDto("Employee updated successfully!") :
                new ResponseDto("Employee updated failed!");
    }
    @Override
    public ResponseDto delete(Long id) {
        return employeeRepository.delete(id) > 0
                ? new ResponseDto("Employee deleted successfully!") :
                new ResponseDto("Employee deleted failed!");
    }
}
