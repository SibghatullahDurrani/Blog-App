package com.sibghat.blog_app.services.category;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.services.category.behaviours.interfaces.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices implements ICategoryServices{

    private final ICreateCategory createCategory;
    private final IGetCategories getCategories;
    private final IGetCategoryById getCategoryById;
    private final IDeleteCategory deleteCategory;
    private final IUpdateCategory updateCategory;

    public CategoryServices(
            ICreateCategory createCategory,
            IGetCategories getCategories,
            IGetCategoryById getCategoryById,
            IDeleteCategory deleteCategory,
            IUpdateCategory updateCategory
    ) {
        this.createCategory = createCategory;
        this.getCategories = getCategories;
        this.getCategoryById = getCategoryById;
        this.deleteCategory = deleteCategory;
        this.updateCategory = updateCategory;
    }
    @Override
    public ResponseEntity<CategoryDto> createCategory(CategoryDto category) {
        return createCategory.createCategory(category);
    }

    @Override
    public ResponseEntity<List<CategoryDto>> getCategories() {
        return getCategories.getCategories();
    }

    @Override
    public ResponseEntity<CategoryDto> getCategoryById(Long id) {
        return getCategoryById.getCategoryById(id);
    }

    @Override
    public ResponseEntity<?> deleteCategoryById(Long id) {
        return deleteCategory.deleteCategoryById(id);
    }

    @Override
    public ResponseEntity<CategoryDto> updateCategory(CategoryDto category, Long id) {
        return updateCategory.updateCategory(category,id);
    }
}
