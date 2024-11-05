package service;

import enums.Genre;
import models.Book;

public interface BookService {
    String addBookToLibrary(long libraryId);
    Book[] getBooksByGenre(long libraryId,Genre genre);
    Book[] getBooksByPublishedYear(long libraryId,int year);
    Book[] getAllByLibraryId(long libraryId);
    String deleteBookById(long libraryId,long bookId);

}
