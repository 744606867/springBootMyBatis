package cn.yyff.tax.cxf.serviceimpl;

import cn.yyff.tax.cxf.bean.User;
import cn.yyff.tax.cxf.dao.UserDao;
import cn.yyff.tax.cxf.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    public PageInfo<User> findALL(int page, int size) {
        PageHelper.startPage(page, size);
        List<User> users = userDao.findALL();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }


}
