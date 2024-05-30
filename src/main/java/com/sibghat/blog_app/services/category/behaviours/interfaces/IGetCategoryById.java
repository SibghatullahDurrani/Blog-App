package com.sibghat.blog_app.services.category.behaviours.interfaces;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import org.springframework.http.ResponseEntity;

public interface IGetCategoryById {

    ResponseEntity<CategoryDto> getCategoryById(Long id);

}
