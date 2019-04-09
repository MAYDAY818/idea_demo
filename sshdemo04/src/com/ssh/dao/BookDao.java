package com.ssh.dao;

import com.ssh.bean.Book;

import java.util.List;

public interface BookDao {
    public int addBook(Book book);
    public int deleteBook(Book book);
    public int updateBook(Book book);
    public List<Book> bookList();
    public String bookNameOfId(Book book);
    public Book bookOfId(Book book);

}
