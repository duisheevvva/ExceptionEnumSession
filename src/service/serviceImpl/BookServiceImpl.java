package service.serviceImpl;

import enums.Genre;
import models.Book;
import service.BookService;

public class BookServiceImpl implements BookService {
    @Override
    public String addBookToLibrary(long libraryId) {
        return null;
    }

    @Override
    public Book[] getBooksByGenre(long libraryId, Genre genre) {
        return new Book[0];
    }

    @Override
    public Book[] getBooksByPublishedYear(long libraryId, int year) {
        return new Book[0];
    }

    @Override
    public Book[] getAllByLibraryId(long libraryId) {
        return new Book[0];
    }

    @Override
    public String deleteBookById(long libraryId, long bookId) {
        return null;
    }
}
