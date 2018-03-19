package com.eagle.controller;

import com.eagle.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/************************************************************
 * @Description: TODO
 * @Author: jerry.zheng
 * @Date Created in 12:18 2018\3\19 0019        
 ************************************************************/

@RestController
public class HelloController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
