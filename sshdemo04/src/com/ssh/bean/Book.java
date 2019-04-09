package com.ssh.bean;

public class Book {
    private Integer bookId;
    private String bookName;
    private Integer bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public Book(String bookName, Integer bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Book(Integer bookId, String bookName, Integer bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
}
