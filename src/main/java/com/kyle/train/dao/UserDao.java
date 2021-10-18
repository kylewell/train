package com.kyle.train.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.kyle.train.model.User;

import java.util.List;

public interface UserDao {
    User queryById(@Param("id") int id);
    List<User> queryAll();
    int add(User user);
    int delById(int id);
    int updateById(User user);
}
