package com.ctx.test.mapper;

import java.util.List;
import java.util.Map;

/**
 * 反反复复反反复复333
 */

@org.apache.ibatis.annotations.Mapper
public interface MyMapper {
    List<Map<String,Object>> getList();
}