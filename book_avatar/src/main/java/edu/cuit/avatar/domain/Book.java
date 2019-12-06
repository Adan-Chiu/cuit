package edu.cuit.avatar.domain;


import javax.persistence.*;

/**
 * @program: book_avatar->Book
 * @description: 图书实体
 * @author: Tiger
 * @date: 2019-12-06 11:29
 */
@Entity
@Table(name = "tb_book")
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20,nullable = false)
    private String title;
    @Column(length = 20)
    private String author;
    private float price;
    @Column(length = 40)
    private String publisher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
