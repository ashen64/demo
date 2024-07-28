package com.ctx.test;
import com.ctx.test.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    private MyMapper mapper;
    @Override
    public List<Map<String,Object>> getList() {
        List<Map<String,Object>> list = mapper.getList();
        System.out.println(list);
        return list;
    }
}