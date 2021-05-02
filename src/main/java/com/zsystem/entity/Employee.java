package com.zsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private  Integer id;
    private  String lastName;
    private  String email;
    private  Integer gender;
    private Integer departmentId;
    private  Department eDepartment;
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Integer departmentId, Department eDepartment) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.departmentId = departmentId;
        this.eDepartment = eDepartment;
        this.birth = new Date();
    }
}
