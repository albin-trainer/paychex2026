package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByAddress(String address);
    List<Employee> findBySalaryGreaterThanEqual(float salary);

    @Query ("select e from Employee e where e.address= :addr")
    List<Employee> searchEmpBasedOnAddress(@Param ("addr")   String address);
}
