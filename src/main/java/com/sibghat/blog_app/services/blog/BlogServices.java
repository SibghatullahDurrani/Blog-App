package com.sibghat.blog_app.services.blog;

import com.sibghat.blog_app.DTOs.blog.BlogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class BlogServices implements IBlogServices{





    @Override
    public ResponseEntity<BlogDto> addBlog(MultipartFile image, BlogDto blog) {
        return null;
    }
}
