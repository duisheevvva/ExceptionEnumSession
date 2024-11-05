package models;

import enums.Genre;

public class Book {
    private long id;
    private String bookName;
    private int price;
    private int publishedYear;
    private Genre genre;
    private boolean isBooked;

    public Book() {
    }

    public Book(long id, String bookName, int price, int publishedYear, Genre genre, boolean isBooked) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.publishedYear = publishedYear;
        this.genre = genre;
        this.isBooked = isBooked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", publishedYear=" + publishedYear +
                ", genre=" + genre +
                ", isBooked=" + isBooked +
                '}';
    }
}
