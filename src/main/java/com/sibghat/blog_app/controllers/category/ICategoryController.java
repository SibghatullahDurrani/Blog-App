package com.sibghat.blog_app.controllers.category;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ICategoryController {

    @PostMapping("/category")
    ResponseEntity<CategoryDto> createCategory(@RequestBody @Valid CategoryDto category);

    @GetMapping("/category")
    ResponseEntity<List<CategoryDto>> getCategories();

    @GetMapping("category/{id}")
    ResponseEntity<CategoryDto> getCategoryById(@PathVariable Long id);

    @DeleteMapping("/category/{id}")
    ResponseEntity<?> deleteCategoryById(@PathVariable Long id);

    @PutMapping("/category/{id}")
    ResponseEntity<CategoryDto> updateCategory(@RequestBody @Valid CategoryDto category, @PathVariable Long id);



}
