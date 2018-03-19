package com.eagle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/************************************************************
 * @Description: TODO
 * @Author: jerry.zheng
 * @Date Created in 12:18 2018\3\19 0019        
 ************************************************************/

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}
