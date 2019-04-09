package com.ssh.daoImpl;

import com.ssh.bean.Book;
import com.ssh.dao.BookDao;

import java.util.List;

public class BookDaoImpl extends JdbcDaoSupport implements BookDao {
    @Override
    public int addBook(Book book) {
        return 0;
    }

    @Override
    public int deleteBook(Book book) {
        return 0;
    }

    @Override
    public int updateBook(Book book) {
        return 0;
    }

    @Override
    public List<Book> bookList() {
        return null;
    }

    @Override
    public String bookNameOfId(Book book) {
        return null;
    }

    @Override
    public Book bookOfId(Book book) {
        return null;
    }
}
