package com.lyf.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyf.reggie.Entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
