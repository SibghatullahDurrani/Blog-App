package com.sibghat.blog_app.controllers.category;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.services.category.ICategoryServices;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController implements ICategoryController{

    private final ICategoryServices categoryServices;

    public CategoryController(ICategoryServices categoryServices) {
        this.categoryServices = categoryServices;
    }

    @Override
    public ResponseEntity<CategoryDto> createCategory(@RequestBody @Valid CategoryDto category) {
        return this.categoryServices.createCategory(category);
    }

    @Override
    public ResponseEntity<List<CategoryDto>> getCategories() {
        return categoryServices.getCategories();
    }

    @Override
    public ResponseEntity<CategoryDto> getCategoryById(Long id) {
        return categoryServices.getCategoryById(id);
    }

    @Override
    public ResponseEntity<?> deleteCategoryById(Long id) {
        return categoryServices.deleteCategoryById(id);
    }

    @Override
    public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto category, @PathVariable Long id) {
        return categoryServices.updateCategory(category, id);
    }
}
