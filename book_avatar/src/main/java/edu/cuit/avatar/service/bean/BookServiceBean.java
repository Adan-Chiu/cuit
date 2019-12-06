package edu.cuit.avatar.service.bean;

import edu.cuit.avatar.domain.Book;
import edu.cuit.avatar.repository.BookRepository;
import edu.cuit.avatar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: book_avatar->BookServiceBean
 * @description: 图书管理业务实现类
 * @author: Tiger
 * @date: 2019-12-06 11:37
 */
@Service
@Transactional
public class BookServiceBean implements BookService {
    @Autowired private BookRepository repository;
    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public Book remove(Integer id) {
        var book = get(id);
        repository.delete(book);
        return book;
    }

    @Override
    public Book edit(Book book) {
        return repository.saveAndFlush(book);
    }

    @Override @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Book get(Integer id) {
        return repository.getOne(id);
    }

    @Override @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Page<Book> list(int pageIndex, int pageSize) {
        return repository.findAll(PageRequest.of(pageIndex - 1,pageSize));
    }
}
