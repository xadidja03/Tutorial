package com.example.employeemanagmentsystem.controller;
import com.example.employeemanagmentsystem.dto.request.EmployeeDtoRequest;
import com.example.employeemanagmentsystem.dto.response.EmployeeDtoResponse;
import com.example.employeemanagmentsystem.dto.response.ResponseDto;
import com.example.employeemanagmentsystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor

public class EmployeeController {

    private final EmployeeService employeeService;
    @GetMapping("/show")
    public List<EmployeeDtoResponse> employees(){
        log.info("GET- /employees -> request none");
        var response=employeeService.findAll();
        log.info("GET- /employees - response -> {}", response);
        return response;
    }
    @GetMapping("/{id}")
    public EmployeeDtoResponse employeesFindById(@PathVariable Long id) {
        log.info("GET- /employees -> request", id);
        var response=employeeService.findById(id);
        log.info("GET- /employees - response -> {}", id, response);
        return response;
    }
    @PutMapping("/update")
    public ResponseDto update(@RequestBody EmployeeDtoRequest employeeDto){
        log.info("GET- /employees -> request",employeeDto);
        var response=employeeService.update(employeeDto);
        log.info("GET- /employees - response -> {}",employeeDto, response);
        return response;
    }
    @DeleteMapping("/{id}/delete")
    public ResponseDto delete(@PathVariable Long id){
        log.info("GET- /employees -> request", id);
        var response=employeeService.delete(id);
        log.info("GET- /employees - response -> {}", id, response);
        return response;
    }
    @PostMapping("/register")
    public ResponseDto employees(@RequestBody EmployeeDtoRequest employeeDto){
        log.info("GET- /employees -> request",employeeDto);
        var response=employeeService.insert(employeeDto);
        log.info("GET- /employees - response -> {}", employeeDto, response);
        return response;
    }
}
