package edu.cuit.avatar.repository;

import edu.cuit.avatar.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: book_avatar->BookRepository
 * @description: 图书Repository
 * @author: Tiger
 * @date: 2019-12-06 11:38
 */
public interface BookRepository extends JpaRepository<Book,Integer>, JpaSpecificationExecutor<Book> {
}
