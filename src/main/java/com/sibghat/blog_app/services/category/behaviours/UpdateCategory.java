package com.sibghat.blog_app.services.category.behaviours;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.domains.Category;
import com.sibghat.blog_app.repositories.CategoryRepository;
import com.sibghat.blog_app.services.category.behaviours.interfaces.IUpdateCategory;
import com.sibghat.blog_app.utils.mapper.CategoryDtoMapper;
import jakarta.persistence.EntityExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UpdateCategory implements IUpdateCategory {

    private final CategoryRepository categoryRepository;
    private final CategoryDtoMapper categoryDtoMapper;

    public UpdateCategory(CategoryRepository categoryRepository, CategoryDtoMapper categoryDtoMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryDtoMapper = categoryDtoMapper;
    }

    @Override
    public ResponseEntity<CategoryDto> updateCategory(CategoryDto category, Long id) {
        if(categoryRepository.existsCategoryByCategory(category.getCategory())){
            throw new EntityExistsException("category");
        }else{
            Optional<Category> categoryReturned = categoryRepository.findById(id);

            if(categoryReturned.isPresent()){
                categoryReturned.get().setCategory(category.getCategory());
                categoryRepository.save(categoryReturned.get());
                return new ResponseEntity<>(categoryDtoMapper.mapFrom(categoryReturned.get()), HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
}
