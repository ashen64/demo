package com.ctx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    @Autowired
    private Service service;
    /**
     * http://localhost:8010/fun
     * @return
     */
    @GetMapping("/fun")
    public String fun(){
        return "hello world!";
    }


    @PostMapping("/getList")
    public List<Map<String,Object>> getList(){
        return service.getList();
    }

}