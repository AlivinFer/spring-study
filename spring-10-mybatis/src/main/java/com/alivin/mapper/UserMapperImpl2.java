package com.alivin.mapper;

import com.alivin.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

// 通过继承来 SqlSessionDaoSupport 来提供 SqlSession
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }
}
