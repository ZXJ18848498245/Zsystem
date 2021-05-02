package com.zsystem.controller;

import com.zsystem.dao.DepartmentDao;
import com.zsystem.dao.EmployeeDao;
import com.zsystem.entity.Department;
import com.zsystem.entity.Employee;
import com.zsystem.service.DepartmentService;
import com.zsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {

   /* @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;*/
   @Autowired
   EmployeeService employeeService;

   @Autowired
    DepartmentService departmentService;

    @RequestMapping("/emps")
    public String List(Model model){
        List<Employee> employees = employeeService.ListEmployee();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
//restful 风格
    @GetMapping("/emp") //限定只能用get方式提交
    public  String toAddpage(Model model){ //model向前端传递参数
        //查出所有部门的信息
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return  "emp/add";

    }
    @PostMapping("/emp") //限定只能用post方式提交
    public  String addEmp(Employee employee){ //model向前端传递参数
        //添加的操作 forward  redirect
        employeeService.addEmp(employee);
        return  "redirect:/emps";

    }

    //去员工的修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id , Model model){
        //查询原来的数据
        Employee employee = employeeService.ListEmployeeById(id);
        System.out.println(employee.getLastName());

        model.addAttribute("emp",employee);
        //查出所有部门的信息
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);

        return "emp/update";
    }
    @PostMapping("/updateEmp")
    public  String updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        System.out.println(employee);
        return "redirect:/emps";
    }
    @GetMapping("/deleteemp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeService.deleteEmp(id);
        return "redirect:/emps";
    }

}
