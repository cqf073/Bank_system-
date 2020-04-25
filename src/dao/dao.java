package dao;
import pojo.User;
/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2421:45
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public interface dao {
    User check(String uname,String pwd);
}
