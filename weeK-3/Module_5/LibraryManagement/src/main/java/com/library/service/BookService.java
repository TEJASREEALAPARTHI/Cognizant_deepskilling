package week3.Module_5.LibraryManagement.src.main.java.com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("BookService: Adding book...");
        if (bookRepository != null) {
            bookRepository.save();
        } else {
            System.out.println("BookService: Error - BookRepository is not injected!");
        }
    }
}
