package com.zsystem.mapper;

import com.zsystem.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解表示了这是一个mybatis
@Mapper
@Repository
public interface DepartmentMapper {

    List<Department> queryDepartmentList();

    Department queryDepartmentById(int id);

    int addDepartment(Department department);

    int updateDepartment(Department department);

    int deleteDepartment(int id);
}
