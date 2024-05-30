package com.sibghat.blog_app.DTOs.blog;

import com.sibghat.blog_app.domains.Category;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogDto {

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String description;

    private String imagePath;

    private LocalDateTime createdAt;

    private List<Category> categories;

}
