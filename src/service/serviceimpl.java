package service;

import dao.daoimpl;
import pojo.User;
import dao.dao;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2510:42
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class serviceimpl implements service {
    dao d= (dao) new daoimpl();
    public User check(String uname, String pwd) {
        // TODO Auto-generated method stub
        return d.check(uname, pwd);
    }

}

