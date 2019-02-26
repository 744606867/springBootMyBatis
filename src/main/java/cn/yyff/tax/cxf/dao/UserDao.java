package cn.yyff.tax.cxf.dao;

import cn.yyff.tax.cxf.bean.User;

import java.util.List;


public interface UserDao {
    User findUserById(int id);

    List<User> findALL();
}
