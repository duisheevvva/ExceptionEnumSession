package models;

import java.time.LocalDate;
import java.util.Arrays;

public class Library {
    private long id;
    private String name;
    private LocalDate foundationDate;
    private Book [] books = new Book[0];
    private Reader [] readers = new Reader[0];

    public Library() {
    }

    public Library(long id, String name, LocalDate foundationDate) {
        this.id = id;
        this.name = name;
        this.foundationDate = foundationDate;
    }

    public Library(long id, String name, LocalDate foundationDate, Book[] books, Reader[] readers) {
        this.id = id;
        this.name = name;
        this.foundationDate = foundationDate;
        this.books = books;
        this.readers = readers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Reader[] getReaders() {
        return readers;
    }

    public void setReaders(Reader[] readers) {
        this.readers = readers;
    }
    // Add reader method:
    public void addReader(Reader reader){
        Reader [] newReaders = new Reader[readers.length + 1];
        for (int i = 0; i < readers.length; i++) {
            newReaders[i] = readers[i];
        }
        newReaders[readers.length] = reader;
        readers = newReaders;
    }




    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundationDate=" + foundationDate +
                ", books=" + Arrays.toString(books) +
                ", readers=" + Arrays.toString(readers) +
                '}';
    }
}
