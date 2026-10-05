package com.example.service;

import java.util.List;

import com.example.dto.EmployeeDTO;
import com.example.entity.Employee;

public interface EmployeeService {
EmployeeDTO addNewEmployee(EmployeeDTO dto);
 List<Employee> searchByAddress(String address);
Employee searchById(int eid);
Employee updatEmployee(EmployeeDTO dto);
}
