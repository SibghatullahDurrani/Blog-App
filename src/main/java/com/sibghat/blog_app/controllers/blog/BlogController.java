package com.sibghat.blog_app.controllers.blog;

import com.sibghat.blog_app.DTOs.blog.BlogDto;
import com.sibghat.blog_app.services.blog.IBlogServices;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

public class BlogController implements IBlogController{


    private final IBlogServices blogServices;

    public BlogController(IBlogServices blogServices) {
        this.blogServices = blogServices;
    }

    @Override
    public ResponseEntity<BlogDto> addBlog(@Valid  @RequestPart("image") MultipartFile image, @Valid @RequestPart("request_json") BlogDto blog) {
        return this.blogServices.addBlog(image, blog);
    }
}
