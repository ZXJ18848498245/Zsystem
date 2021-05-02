package com.zsystem.service;

import com.zsystem.entity.Employee;
import com.zsystem.mapper.DepartmentMapper;
import com.zsystem.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Employee> ListEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public Employee ListEmployeeById(Integer id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public void toAddpage(Integer id) {

    }

    @Override
    public void addEmp(Employee employee) {
        employeeMapper.saveEmployee(employee);
    }

    @Override
    public void toUpdateEmp(Integer id) {

    }

    @Override
    public void updateEmp(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void deleteEmp(Integer id) {
        employeeMapper.deleteEmployeeById(id);
    }
}
