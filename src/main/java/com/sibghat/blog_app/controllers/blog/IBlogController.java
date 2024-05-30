package com.sibghat.blog_app.controllers.blog;

import com.sibghat.blog_app.DTOs.blog.BlogDto;
import com.sibghat.blog_app.DTOs.category.CategoryDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

public interface IBlogController {

    ResponseEntity<BlogDto> addBlog(@Valid @RequestPart("image") MultipartFile image, @Valid @RequestPart("request_json") BlogDto blog);

}
