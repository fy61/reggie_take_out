package com.lyf.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyf.reggie.Entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
