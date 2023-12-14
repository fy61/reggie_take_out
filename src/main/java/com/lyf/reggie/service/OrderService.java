package com.lyf.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyf.reggie.Entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface OrderService extends IService<Orders> {


    void submit(Orders orders);
}
