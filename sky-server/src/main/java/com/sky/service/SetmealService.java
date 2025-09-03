package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetmealService {
    /**
     * 新增套餐和对应的套餐菜品关系
     *
     * @param setmealDTO
     */
    void saveWithSetmealDish(SetmealDTO setmealDTO);
}
