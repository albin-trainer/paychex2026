package com.example.dto;

public class EmployeeDTO {
private int empId;
private String empName;
private String address;
private float salary;
private int deptId;

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
public int getDeptId() {
    return deptId;
}
public void setDeptId(int deptId) {
    this.deptId = deptId;
}

}
