package com.sibghat.blog_app.services.category.behaviours;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.domains.Category;
import com.sibghat.blog_app.repositories.CategoryRepository;
import com.sibghat.blog_app.services.category.behaviours.interfaces.ICreateCategory;
import com.sibghat.blog_app.utils.mapper.CategoryDtoMapper;
import jakarta.persistence.EntityExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CreateCategory implements ICreateCategory {

    private final CategoryRepository categoryRepository;
    private final CategoryDtoMapper categoryDtoMapper;

    public CreateCategory(CategoryRepository categoryRepository, CategoryDtoMapper categoryDtoMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryDtoMapper = categoryDtoMapper;
    }

    @Override
    public ResponseEntity<CategoryDto> createCategory(CategoryDto createCategory) {
        if(categoryRepository.existsCategoryByCategory(createCategory.getCategory())){
            throw new EntityExistsException("category");
        }else{
            Category categoryToSave = categoryDtoMapper.mapTo(createCategory);
            Category savedCategory = categoryRepository.save(categoryToSave);
            return new ResponseEntity<>(categoryDtoMapper.mapFrom(savedCategory), HttpStatus.CREATED);
        }
    }
}
