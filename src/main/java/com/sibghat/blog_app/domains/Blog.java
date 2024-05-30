package com.sibghat.blog_app.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    private Long id;

    private String title;

    private String author;

    @Column(
            columnDefinition = "TEXT"
    )
    private String description;

    private String imagePath;

    private LocalDateTime createdAt;

    @ManyToMany
    @JoinTable(
            name = "blogs_categories",
            joinColumns = {
                    @JoinColumn(name = "blog_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "category_id")
            }
    )
    private List<Category> categories;

}
