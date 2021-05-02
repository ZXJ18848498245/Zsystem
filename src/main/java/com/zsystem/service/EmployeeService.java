package com.zsystem.service;


import com.zsystem.entity.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {

    //获取所有员工信息
     List<Employee> ListEmployee();

     //获取员工信息by id
    Employee ListEmployeeById(Integer id);

    //去查询部门信息
      void toAddpage(Integer id);

      //新增员工信息
    void addEmp(Employee employee);

    void toUpdateEmp(Integer id);

    void updateEmp(Employee employee);

    void deleteEmp(Integer id);


}
