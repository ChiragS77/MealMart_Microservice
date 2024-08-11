package com.category.service;

import com.category.entity.FoodCategory;
import com.category.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements  CategoryService{

    private CategoryRepository categoryRepository;

    public  CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String addCategory(FoodCategory foodCategory) {
        try {
            FoodCategory foodCategory1 = this.categoryRepository.save(foodCategory);
            return "Added succesfully";

        }catch (Exception e){
            e.printStackTrace();
        }
        return "Not added ";
    }

    @Override
    public List<FoodCategory> getCategories() {
        return List.of();
    }

    @Override
    public FoodCategory getFoodCategory(long id) {
        return this.categoryRepository.findById(id).get();
    }
}
