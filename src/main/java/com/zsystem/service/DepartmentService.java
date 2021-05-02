package com.zsystem.service;

import com.zsystem.entity.Department;

import java.util.Collection;
import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();

    Department getDepartmentById(Integer id);
}
