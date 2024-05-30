package com.sibghat.blog_app.services.category.behaviours;

import com.sibghat.blog_app.repositories.CategoryRepository;
import com.sibghat.blog_app.services.category.behaviours.interfaces.IDeleteCategory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class DeleteCategory implements IDeleteCategory {

    private final CategoryRepository categoryRepository;

    public DeleteCategory(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ResponseEntity<?> deleteCategoryById(Long id) {
        if(categoryRepository.existsById(id)){
            categoryRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
