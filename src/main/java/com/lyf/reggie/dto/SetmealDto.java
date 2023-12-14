package com.lyf.reggie.dto;

import com.lyf.reggie.Entity.Setmeal;
import com.lyf.reggie.Entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
