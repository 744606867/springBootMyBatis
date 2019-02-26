package cn.yyff.tax.shop.controller;

import cn.yyff.tax.shop.bean.User;
import cn.yyff.tax.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class FnController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test/{id}")
    public User fun1(@PathVariable("id") int id) {
        User user = userService.findUserById(id);
        return user;
    }


    @RequestMapping("/aa")
    public List<User> fun2() {
        List<User> users = userService.findALL();

        return users;
    }
}
