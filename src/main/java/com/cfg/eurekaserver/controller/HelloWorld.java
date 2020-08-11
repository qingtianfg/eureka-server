package com.cfg.eurekaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 描述
 * @author: chenfg
 * @time: 2020/8/6 23:18
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "hello", produces = {"application/json;charset=UTF-8"})
    public Object helloworld(HttpServletRequest req){
        String ip = req.getLocalAddr();
        String port = String.valueOf(req.getLocalPort());
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("ip",ip);
        resultMap.put("port",port);
        resultMap.put("message","hello I am "+ip+":"+port);
        return resultMap;
    }

}