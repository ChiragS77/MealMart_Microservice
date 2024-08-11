package com.category.service;

import com.category.entity.FoodCategory;

import java.util.List;

public interface CategoryService {


    public String addCategory(FoodCategory foodCategory);

    public List<FoodCategory> getCategories();

    public FoodCategory getFoodCategory(long id);



}
