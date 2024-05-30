package com.sibghat.blog_app.repositories;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.domains.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean existsCategoryByCategory(String category);

    @Query("""
    SELECT new com.sibghat.blog_app.DTOs.category.CategoryDto(
    c.id, c.category
    )FROM Category c
""")
    List<CategoryDto> getCategories();

    @Query("""
    SELECT new com.sibghat.blog_app.DTOs.category.CategoryDto(
    c.id, c.category
    )FROM Category c WHERE c.id = ?1
""")
    Optional<CategoryDto> getCategoryById(Long id);
}
