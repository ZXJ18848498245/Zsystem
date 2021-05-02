package com.zsystem.mapper;

import com.zsystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    //新增一个员工
      void saveEmployee(Employee employee);

      //查询所有员工
    List<Employee> getAllEmployee();

    //查询一个员工
    Employee getEmployeeById(Integer id);

    //删除一个员工
    void deleteEmployeeById(Integer id);

    //更新员工
    void updateEmployee(Employee employee);


}
