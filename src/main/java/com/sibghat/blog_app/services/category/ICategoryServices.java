package com.sibghat.blog_app.services.category;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICategoryServices {

    ResponseEntity<CategoryDto> createCategory(CategoryDto category);

    ResponseEntity<List<CategoryDto>> getCategories();

    ResponseEntity<CategoryDto> getCategoryById(Long id);

    ResponseEntity<?> deleteCategoryById(Long id);

    ResponseEntity<CategoryDto> updateCategory(CategoryDto category, Long id);
}
