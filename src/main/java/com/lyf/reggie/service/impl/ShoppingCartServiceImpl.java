package com.lyf.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.lyf.reggie.Entity.ShoppingCart;
import com.lyf.reggie.mapper.ShoppingCartMapper;
import com.lyf.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
