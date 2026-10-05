package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.repository.DepartmentRepo;

@RestController 
@RequestMapping ("/departments")
public class DepartmentApi {
    @Autowired 
    private DepartmentRepo repo;
    
    @PostMapping 
    public Department addNewDepartment(@RequestBody   Department d){
        repo.save(d);
        return d;
    }
    @GetMapping 
    public List<Department> getAllDepartments(){
        return repo.findAll();
    }
}
