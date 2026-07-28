package week3.Module_5.LibraryManagement.src.main.java.com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring Application Context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration and dependency injection
        System.out.println("LibraryManagementApplication starting tests...");
        bookService.addBook();
        System.out.println("LibraryManagementApplication tests completed successfully.");
    }
}
