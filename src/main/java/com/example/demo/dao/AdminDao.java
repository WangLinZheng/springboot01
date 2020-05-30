package com.example.demo.dao;

import com.example.demo.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminDao {



    @Results({
            @Result(property = "adminid", column = "adminid"),
            @Result(property = "adminaccount", column = "adminaccount"),
            @Result(property = "adminpwd", column = "adminpwd")
    })


    @Select("select * from admin")
    List<Admin> findAdd();
}
