package com.category.controller;

import com.category.entity.FoodCategory;
import com.category.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public String addCategory(@RequestBody FoodCategory foodCategory){
      String msg  = this.categoryService.addCategory(foodCategory);
       return msg;
    }

    @GetMapping
    public List<FoodCategory>  getAllCategories(){
        List<FoodCategory> list = this.categoryService.getCategories();
        return  list;
    }

    @GetMapping("/{id}")
    public FoodCategory getCategory(@PathVariable long id){
       FoodCategory foodCategory = this.categoryService.getFoodCategory(id);

       return foodCategory;
    }


}
