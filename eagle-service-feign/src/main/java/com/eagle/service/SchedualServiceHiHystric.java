package com.eagle.service;

import org.springframework.stereotype.Component;

/************************************************************
 * @Description: TODO
 * @Author: jerry.zheng
 * @Date 2018-03-20 23:18
 ************************************************************/

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
