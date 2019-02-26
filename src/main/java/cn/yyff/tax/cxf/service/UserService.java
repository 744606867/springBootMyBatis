package cn.yyff.tax.cxf.service;

import cn.yyff.tax.cxf.bean.User;

import java.util.List;

public interface UserService {
    User findUserById(int id);

    List<User> findALL();
}
