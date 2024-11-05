package service.serviceImpl;

import database.Database;
import models.Library;
import service.LibraryService;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public String addLibrary(Library library) {
            Library [] libraries = new Library[Database.libraries.length + 1];
            for (int i = 0; i < Database.libraries.length; i++) {
                libraries[i] = Database.libraries[i];
            }
            libraries[Database.libraries.length] = library;

            Database.libraries = libraries;
        return "Success!";
    }

    @Override
    public Library getLibraryById(long id) {
        return null;
    }

    @Override
    public Library[] getAllLibrary() {
        return Database.libraries;
    }

    @Override
    public String updateLibrary(long id, Library newLibrary) {
        return null;
    }

    @Override
    public String deleteLibrary(long id) {
        return null;
    }
}
