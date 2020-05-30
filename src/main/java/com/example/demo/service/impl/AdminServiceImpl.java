package com.example.demo.service.impl;

import com.example.demo.dao.AdminDao;
import com.example.demo.pojo.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao ad;

    @Override
    public List<Admin> getAll() {
        return ad.findAdd();
    }
}
