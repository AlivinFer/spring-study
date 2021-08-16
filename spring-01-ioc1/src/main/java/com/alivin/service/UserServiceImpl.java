package com.alivin.service;

import com.alivin.dao.UserDao;

public class UserServiceImpl implements UserService{

    // 业务层调用 dao 层
//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new MySqlImpl();
    private UserDao userDao;
    // 引入 set 方法使得程序不再具有主动性
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
//        userDao.getUser();
        userDao.getUser();
    }

}
