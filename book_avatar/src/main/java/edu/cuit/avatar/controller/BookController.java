package edu.cuit.avatar.controller;

import edu.cuit.avatar.domain.Book;
import edu.cuit.avatar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @program: book_avatar->BookController
 * @description: 图书RESTful接口
 * @author: Tiger
 * @date: 2019-12-06 11:44
 * RESTful：软件即资源，资源即服务，资源应该是名词，动作由服务器进行转换（http协议）
 * 1.获取资源 GET
 * 2.删除资源 DELETE
 * 3.更新资源 PUT
 * 4.创建资源 POST
 *
 * 1.根据id获取指定的图书信息
 *  GET：http://localhost/book/1    1为具体的id
 * 2.获取全部图书信息
 *  GET：http://localhost/book
 * 3.添加图书
 *  POST：http://localhost/book
 * 4.更新图书信息
 *  PUT: http://localhost/book
 * 5.根据id删除图书信息
 *  DELETE: http://localhost/book/1 1为具体的id
 */
@RestController
public class BookController {
    @Autowired private BookService service;
    @PostMapping("/book")
    public Book save(Book book){
        return service.save(book);
    }
    @GetMapping("/book/{id}")
    public Book getBookById(@PathParam("id") Integer id){
        return service.get(id);
    }

    @GetMapping("/book")
    public List<Book> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/book/{id}")
    public Book remove(@PathParam("id") Integer id){
        return service.remove(id);
    }

    @PutMapping("/book")
    public Book edit(Book book){
        return service.edit(book);
    }
}
