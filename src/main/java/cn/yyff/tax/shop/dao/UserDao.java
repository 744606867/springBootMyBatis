package cn.yyff.tax.shop.dao;

import cn.yyff.tax.shop.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserDao {
    User findUserById(int id);

    List<User> findALL();
}
