package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    public static final List<Category> All_CATEGORIES = Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "goofy"),
            new Category(3, "slick")
    );

    public List<Category> getAllCategories(){
        return All_CATEGORIES;
    }

    public Category findById(int id){
        for(Category category : All_CATEGORIES){
            if(category.getId() == id){
                return category;
            }
        }
            return null;
    }
}
