package com.sibghat.blog_app.utils.mapper;

import com.sibghat.blog_app.DTOs.category.CategoryDto;
import com.sibghat.blog_app.domains.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryDtoMapper implements IMapper<Category, CategoryDto> {
    @Override
    public Category mapTo(CategoryDto categoryDto) {
        return Category.builder()
                .id(categoryDto.getId())
                .category(categoryDto.getCategory())
                .build();
    }

    @Override
    public CategoryDto mapFrom(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .category(category.getCategory())
                .build();
    }
}
