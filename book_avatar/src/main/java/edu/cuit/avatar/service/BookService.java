package edu.cuit.avatar.service;

import edu.cuit.avatar.domain.Book;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @program: book_avatar->BookService
 * @description: 图书管理业务接口
 * @author: Tiger
 * @date: 2019-12-06 11:33
 */
public interface BookService {
    /**
     * 上架图书==将图书信息保存进数据库
     * @param book 图书信息
     * @return 保存后的图书信息
     */
    Book save(Book book);
    Book remove(Integer id);
    Book edit(Book book);
    Book get(Integer id);
    List<Book> getAll();
    Page<Book> list(int pageIndex,int pageSize);
}
