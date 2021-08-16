package com.alivin.mapper;

import com.alivin.pojo.User;

import java.util.List;

public interface UserMapper {
    public int addUser(User user);

    public int deleteUser(int id);

    public int updateUser(User user);

    public List<User> selectUser();
}
