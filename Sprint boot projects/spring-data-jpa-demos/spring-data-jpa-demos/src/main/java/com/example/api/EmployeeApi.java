package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.EmployeeDTO;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController 
@RequestMapping ("/employees")
public class EmployeeApi {
    @Autowired 
    private EmployeeService employeeService;
    @PostMapping 
    public EmployeeDTO addEmp( @RequestBody  EmployeeDTO dto){
        return employeeService.addNewEmployee(dto);            
        
    }
    // /search?address=Bangalore
    @GetMapping ("/search")
    public List<Employee> searchByAddress(@RequestParam ("address") String address){
        return employeeService.searchByAddress(address);
    }
}
