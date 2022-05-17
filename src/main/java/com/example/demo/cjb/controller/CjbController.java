package com.example.demo.cjb.controller;

import com.example.demo.cjb.service.CjbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cjb")
public class CjbController {
    @Autowired
    CjbService cjbService;

    @Value("${spring.profiles.active}")
    private String filePath;

    /*
    提交代码
    vjk23
     */
    @GetMapping("/add")
    public String bb(){
        String vvv=filePath;
        cjbService.cjb();
        String kk = "fdgdfg";
        return "sfrdf";
    }

    /*
    代码后退测试
     */
    @GetMapping("/a1dd")
    public String b11b(){
        String vvv=filePath;
        cjbService.cjb();
        String kk = "fdgdfg";
        return "sfrdf";
    }
}
