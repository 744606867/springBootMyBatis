package cn.yyff.tax.cxf.serviceimpl;

import cn.yyff.tax.cxf.bean.User;
import cn.yyff.tax.cxf.dao.UserDao;
import cn.yyff.tax.cxf.service.UserService;
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
