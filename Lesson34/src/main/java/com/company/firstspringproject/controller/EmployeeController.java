package com.company.firstspringproject.controller;

import com.company.firstspringproject.entity.Employee;
import com.company.firstspringproject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/application-info")
    public Map<String, String> getApplicationInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("name", appName);
        info.put("version", appVersion);
        return info;
    }
    @GetMapping
    public ResponseEntity<List<Employee>> employees(){
     return  employeeService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> employeesFindById(@PathVariable Long id) {
        return employeeService.findById(id);
    }
    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody  Employee employee){
        return  employeeService.update(employee);
    }
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return  employeeService.delete(id);
    }
    @PostMapping("/register")
    public ResponseEntity<Employee> employees(@RequestBody Employee employee){
        return  employeeService.create(employee);
    }



}
