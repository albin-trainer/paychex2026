package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Department {
    @Id 
private int id;
@Column(length = 50)//optional
private String departmentName;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getDepartmentName() {
    return departmentName;
}
public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
}

}
