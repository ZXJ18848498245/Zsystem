package com.zsystem.service;

import com.zsystem.entity.Department;
import com.zsystem.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    public List<Department> getDepartments() {
        return departmentMapper.queryDepartmentList();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.queryDepartmentById(id);
    }
}
