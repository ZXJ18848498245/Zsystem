package com.zsystem.dao;

import com.zsystem.entity.Department;
import com.zsystem.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    private  static Map<Integer, Employee> employees = null;
    //员工所属的部门
    @Autowired
    private  DepartmentDao departmentDao;
  /*  static {
        employees = new HashMap<>();
        employees.put(1001,new Employee(1001,"AA","674919421@163.com",1,new Department(101,"教学部")));
        employees.put(1002,new Employee(1002,"BB","674919422@163.com",1,new Department(102,"行政部")));
        employees.put(1003,new Employee(1003,"CC","674919423@163.com",0,new Department(103,"技术部")));
        employees.put(1004,new Employee(1004,"DD","674919424@163.com",1,new Department(104,"开发部")));
        employees.put(1005,new Employee(1005,"EE","674919425@163.com",0,new Department(105,"市场部")));
    }*/

    //主键自增
    private  static  Integer initid = 1006;
    //增加一个员工
    public  void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initid++);
        }
        //部门关联外键
        employee.setEDepartment(departmentDao.getDepartmentById(employee.getEDepartment().getId()));

        employees.put(employee.getId(),employee);

    }

    //查询所有员工
    public Collection<Employee> getAllEmployee(){
        return  employees.values();
    }

    //通过id查找员工
    public Employee getEmployeeById(Integer id){
        return  employees.get(id);
    }

    //删除员工
    public void deleteEmployeeById(Integer id){
        employees.remove(id);
    }


}
