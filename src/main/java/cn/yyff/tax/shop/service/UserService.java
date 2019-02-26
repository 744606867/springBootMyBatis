package cn.yyff.tax.shop.service;

import cn.yyff.tax.shop.bean.User;

import java.util.List;

public interface UserService {
    User findUserById(int id);

    List<User> findALL();
}
