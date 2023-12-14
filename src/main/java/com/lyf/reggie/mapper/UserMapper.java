package com.lyf.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyf.reggie.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
