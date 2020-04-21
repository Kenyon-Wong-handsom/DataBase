package pers.sanne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sanne.message.Message;

import java.util.List;

public class DeptController {
/*    @Autowired
    DeptService deptService;

    *//**
     *  返回全部部门信息的json数据
     *//*
    @RequestMapping("/depts")
    @ResponseBody
    public Message findAll() {
        List<Dept> depts =  deptService.findAll();
        return Message.success().add("depts", depts);
    }*/
}
