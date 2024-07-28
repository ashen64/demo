package com.ctx.test.mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface MyMapper {
    List<Map<String,Object>> getList();
}