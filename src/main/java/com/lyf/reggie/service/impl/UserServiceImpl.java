package com.lyf.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.lyf.reggie.Entity.User;
import com.lyf.reggie.mapper.UserMapper;
import com.lyf.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
