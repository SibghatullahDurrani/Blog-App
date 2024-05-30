package com.sibghat.blog_app.utils.mapper;

public interface IMapper<A,B>{

    A mapTo (B b);
    B mapFrom (A a);

}
