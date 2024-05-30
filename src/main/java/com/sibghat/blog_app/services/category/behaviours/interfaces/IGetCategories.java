package com.sibghat.blog_app.services.category.behaviours.interfaces;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGetCategories {
    ResponseEntity<List<CategoryDto>> getCategories();
}
