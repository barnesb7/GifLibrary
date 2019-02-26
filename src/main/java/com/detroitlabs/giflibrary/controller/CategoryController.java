package com.detroitlabs.giflibrary.controller;

import com.detroitlabs.giflibrary.data.CategoryRepository;
import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String getCategories(ModelMap modelMap){
    modelMap.put("categoriesRepository", categoryRepository);
    return "categories";
    }

    @RequestMapping("/category/{id}")
    public String getCategory(@PathVariable int id,  ModelMap modelMap){
        Category categoryById = categoryRepository.findById(id);
        modelMap.put("getGifsByCategory", gifRepository.getAllGifsByCategory(categoryById));
        return "category";
    }

}
