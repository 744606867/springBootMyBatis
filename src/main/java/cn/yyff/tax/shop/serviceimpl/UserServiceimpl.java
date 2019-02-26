package cn.yyff.tax.shop.serviceimpl;

import cn.yyff.tax.shop.bean.User;
import cn.yyff.tax.shop.dao.UserDao;
import cn.yyff.tax.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
     @Autowired
     private UserDao userDao;
    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findALL() {
        return userDao.findALL();
    }
}
