package com.lyf.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyf.reggie.Entity.Setmeal;
import com.lyf.reggie.dto.SetmealDto;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐数据和菜单与菜品的关联关系数据
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
