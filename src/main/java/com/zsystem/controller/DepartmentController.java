package com.zsystem.controller;

import com.zsystem.entity.Department;
import com.zsystem.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public class DepartmentController {
    @Autowired
     DepartmentMapper departmentMapper;

    @GetMapping("/queryDepartmentList")
    public List<Department> queryDepartmentList(){
        List<Department> departments = departmentMapper.queryDepartmentList();
        return departments;

    }
}
