package com.sibghat.blog_app.services.category.behaviours;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.repositories.CategoryRepository;
import com.sibghat.blog_app.services.category.behaviours.interfaces.IGetCategories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetCategories implements IGetCategories {

    private final CategoryRepository categoryRepository;

    public GetCategories(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ResponseEntity<List<CategoryDto>> getCategories() {
        return new ResponseEntity<>(this.categoryRepository.getCategories(), HttpStatus.OK);
    }
}
