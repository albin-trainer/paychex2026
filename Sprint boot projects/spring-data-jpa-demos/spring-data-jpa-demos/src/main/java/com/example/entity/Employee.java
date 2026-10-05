package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity 
public class Employee {
    @Id 
     @GeneratedValue  //auto generates
private int empId;
private String empName;
private String address;
private float salary;
@ManyToOne 
private Department dept;


public int getEmpId() {
    return empId;
}
public void setEmpId(int empId) {
    this.empId = empId;
}
public String getEmpName() {
    return empName;
}
public void setEmpName(String empName) {
    this.empName = empName;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public float getSalary() {
    return salary;
}
public void setSalary(float salary) {
    this.salary = salary;
}
public Department getDept() {
    return dept;
}
public void setDept(Department dept) {
    this.dept = dept;
}



}
