package com.sibghat.blog_app.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_generator")
    @SequenceGenerator(name = "category_generator", sequenceName = "category_generator", allocationSize = 1)
    private Long id;

    @Column(
            unique = true
    )
    private String category;

    @ManyToMany(mappedBy = "categories")
    private List<Blog> blogs;
}
