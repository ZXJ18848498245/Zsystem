package com.zsystem.mapper;

import com.zsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User findByUsernameAndPassword(String username, String password);
}
