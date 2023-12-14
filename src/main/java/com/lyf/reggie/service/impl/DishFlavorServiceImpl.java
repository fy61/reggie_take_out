package com.lyf.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyf.reggie.Entity.DishFlavor;
import com.lyf.reggie.mapper.DishFlavorMapper;
import com.lyf.reggie.service.DishFlavorService;
import com.lyf.reggie.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {

    @Autowired
    private DishFlavorService dishFlavorService;

    /**
     * 根据dish中id删除flavor中口味
     * @param id
     */
    @Override
    public void removeBydish_id(Long id) {
        //添加查询条件，根据分类id进行查询
        LambdaQueryWrapper<DishFlavor> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DishFlavor::getDishId, id);
//        System.out.println(dishFlavorMapper.selectList(queryWrapper));
//        System.out.println(dishFlavorService.list(queryWrapper));
        super.remove(queryWrapper);

    }
}
