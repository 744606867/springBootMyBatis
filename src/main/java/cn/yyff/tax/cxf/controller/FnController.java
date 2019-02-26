package cn.yyff.tax.cxf.controller;

import cn.yyff.tax.cxf.bean.User;
import cn.yyff.tax.cxf.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @RequestMapping("/bb")
    public PageInfo<User> fun2(@RequestParam(name = "page", defaultValue = "1") int page) {
        PageInfo<User> all = userService.findALL(page, 5);
     /*   int i=10;
         i = i/0;*/
        System.out.println(all.getList());
        System.out.println(all.getPageNum());
        System.out.println(all.getEndRow());

        return all;
    }
}
