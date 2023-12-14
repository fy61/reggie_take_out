package com.lyf.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyf.reggie.Entity.DishFlavor;

public interface DishFlavorService extends IService<DishFlavor> {
    public void removeBydish_id(Long id);
}
