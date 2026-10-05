package com.example.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;
import com.example.exceptions.ApplicationException;
import com.example.repository.DepartmentRepo;

@RestController 
@RequestMapping ("/departments")
public class DepartmentApi {
    @Autowired 
    private DepartmentRepo repo;

    @PostMapping 
    public   ResponseEntity<Department> addNewDepartment(@RequestBody   Department d){
        repo.save(d);
        return  new ResponseEntity<>(d, HttpStatus.CREATED);
    }
    @GetMapping 
    public List<Department> getAllDepartments(){
        return repo.findAll();
    }
    @GetMapping("/{deptId}")
    public Department getById( @PathVariable("deptId") int id){
        //optional to avoid null pointer exceptions
        Optional<Department> optional  =repo.findById(id);
        if(optional.isPresent()){
           return  optional.get();
        }
        //throw used to throw  a exception explicitly .....
        throw new ApplicationException("The department id "+id+" is not found");
    }
}
