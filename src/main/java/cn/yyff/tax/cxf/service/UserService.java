package cn.yyff.tax.cxf.service;

import cn.yyff.tax.cxf.bean.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    User findUserById(int id);

    PageInfo<User> findALL(int page, int size);
}