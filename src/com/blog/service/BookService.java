package com.blog.service;

import com.blog.pojo.Book;
import com.blog.utils.TTResult;

public interface BookService {
    //��������һ������
	TTResult createBook(Book book);
	//��ѯ
	TTResult queryBook(Integer id);
}
