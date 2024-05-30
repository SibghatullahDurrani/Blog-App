package com.sibghat.blog_app.services.category.behaviours.interfaces;

import org.springframework.http.ResponseEntity;

public interface IDeleteCategory {

    ResponseEntity<?> deleteCategoryById(Long id);

}
