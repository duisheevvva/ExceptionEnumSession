package service;

import models.Library;

public interface LibraryService {
    String addLibrary(Library library);
    Library getLibraryById(long id);
    Library[] getAllLibrary();
    String updateLibrary(long id,Library newLibrary);
    String deleteLibrary(long id);

}
