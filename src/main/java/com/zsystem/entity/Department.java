package com.zsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                        /* get set 方法*/
@AllArgsConstructor           /*有参构造*/
@NoArgsConstructor          /*无参构造*/
public class Department {
    private Integer id;
    private String departmentName;
}
