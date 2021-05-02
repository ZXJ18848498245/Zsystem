package com.zsystem;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.zsystem")
public class ZsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZsystemApplication.class, args);
    }

}
