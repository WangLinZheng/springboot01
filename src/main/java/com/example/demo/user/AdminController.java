package com.example.demo.user;

import com.example.demo.pojo.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class AdminController {

    @Autowired
    AdminService as;

    @RequestMapping("/ee")
    public List<Admin> ret(){
     /*   Admin admin = new Admin(1,"张三","123");
        Admin admin2 = new Admin(1,"李四","123");
        List<Admin> list = new ArrayList<>();
        list.add(admin);
        list.add(admin2);*/
        List<Admin> list = as.getAll();
        System.out.println("数据："+list);
        return list;
    }
}
