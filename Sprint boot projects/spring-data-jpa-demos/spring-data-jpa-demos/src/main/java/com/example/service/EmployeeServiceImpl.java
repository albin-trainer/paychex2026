package com.example.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.EmployeeDTO;
import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.exceptions.ApplicationException;
import com.example.repository.DepartmentRepo;
import com.example.repository.EmployeeRepository;
@Component 
public class EmployeeServiceImpl  implements  EmployeeService{
    @Autowired 
    private DepartmentRepo deptRepo;
    @Autowired 
    private EmployeeRepository empRepo;

    @Override
    public EmployeeDTO addNewEmployee(EmployeeDTO dto) {
        Department dept=
        deptRepo.findById(dto.getDeptId()).
        orElseThrow(  ()  -> new ApplicationException("Dept not found"));

        Employee e=new Employee();
        e.setEmpName(dto.getEmpName()); 
        e.setSalary(dto.getSalary());
        e.setAddress(dto.getAddress());
        e.setDept(dept);
        empRepo.save(e);
        return  dto;
    }

    @Override
    public List<Employee> searchByAddress(String address) {
        return empRepo.findByAddress(address);
    }

    @Override
    public Employee searchById(int eid) {
        // TODO Auto-generated method stub
        return  empRepo.findById(eid).orElseThrow(()-> new ApplicationException("emp id not found"));    }

    @Override
    public Employee updatEmployee(EmployeeDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatEmployee'");
    }

}
