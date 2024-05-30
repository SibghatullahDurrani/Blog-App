package com.sibghat.blog_app.services.blog;

import com.sibghat.blog_app.DTOs.blog.BlogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface IBlogServices {

    ResponseEntity<BlogDto> addBlog(MultipartFile image, BlogDto blog);
}
