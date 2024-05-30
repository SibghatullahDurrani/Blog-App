package com.sibghat.blog_app.services.category.behaviours;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.repositories.CategoryRepository;
import com.sibghat.blog_app.services.category.behaviours.interfaces.IGetCategoryById;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetCategoryById implements IGetCategoryById {

    private final CategoryRepository categoryRepository;

    public GetCategoryById(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ResponseEntity<CategoryDto> getCategoryById(Long id) {
        Optional<CategoryDto> categoryReturned = categoryRepository.getCategoryById(id);

        return categoryReturned.map(categoryDto -> new ResponseEntity<>(categoryDto, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
