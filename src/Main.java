import models.Library;
import models.Reader;
import service.BookService;
import service.LibraryService;
import service.ReaderService;
import service.serviceImpl.BookServiceImpl;
import service.serviceImpl.LibraryServiceImpl;
import service.serviceImpl.ReaderServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(1L,"Bayalinova", LocalDate.of(1999,2,2));
        LibraryService libraryService = new LibraryServiceImpl();

        System.out.println(libraryService.addLibrary(library));

        ReaderService readerService = new ReaderServiceImpl();
        while (true){
            System.out.println("""
                    Choose command: 
                    1.Register
                    2.Login
                    3.Exit
                    """);
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1 -> System.out.println(readerService.register());
                case 2 -> {String loginResult = readerService.login();
                    if (loginResult.equals("Successfully!")){
                        System.out.println("Welcome!");
                        commands();
                    }else {
                        System.out.println("Login failed");
                    }

                }
                case 3 -> {
                    System.out.println("Exit program!");
                    return;
                }
            }

        }
    }
    public static void commands(){
        LibraryService libraryService = new LibraryServiceImpl();
        BookService bookService = new BookServiceImpl();
        while (true){
            System.out.println("""
                    Choose actions: 
                    1.Add library
                    2.Get all library
                    3.Get library by id
                    4.Update library
                    5.Delete library
                    6.Add book
                    7.Get books by genre
                    8.Get books by year
                    9.Get all books by library id
                    10.Delete book
                    """);
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1 -> libraryService.addLibrary(new Library(1L,"Test",LocalDate.of(2000,1,1)));
                case 2 -> System.out.println(Arrays.toString(libraryService.getAllLibrary()));
            }
        }
    }
}