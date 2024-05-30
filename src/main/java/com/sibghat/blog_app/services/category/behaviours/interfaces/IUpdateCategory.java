package com.sibghat.blog_app.services.category.behaviours.interfaces;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import org.springframework.http.ResponseEntity;

public interface IUpdateCategory {
    ResponseEntity<CategoryDto> updateCategory(CategoryDto category, Long id);
}
