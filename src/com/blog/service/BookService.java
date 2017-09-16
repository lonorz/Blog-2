package com.blog.service;

import com.blog.pojo.Book;
import com.blog.utils.TTResult;

public interface BookService {
    //向表中添加一条数据
	TTResult createBook(Book book);
	//查询
	TTResult queryBook(Integer id);
}
