import java.util.*;


class Book {

    private String bookId;
    private String title;
    private String author;


    public Book(String bookId,
                String title,
                String author) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }


    public String getTitle() {

        return title;
    }



    @Override
    public String toString() {

        return "'" + title +
                "' by " + author +
                " [ID: " + bookId + "]";
    }
}





public class LibraryManagement {



    // Linear Search By Title

    public static Book linearSearchByTitle(
            List<Book> books,
            String targetTitle) {


        for (Book book : books) {


            if (book.getTitle()
                    .equalsIgnoreCase(targetTitle)) {


                return book;
            }
        }


        return null;
    }







    // Binary Search By Title

    public static Book binarySearchByTitle(
            List<Book> books,
            String targetTitle) {


        int low = 0;

        int high = books.size() - 1;



        while (low <= high) {



            int mid = low + (high - low) / 2;



            int result =
                    books.get(mid)
                    .getTitle()
                    .compareToIgnoreCase(targetTitle);




            if (result == 0) {


                return books.get(mid);


            } else if (result < 0) {


                low = mid + 1;


            } else {


                high = mid - 1;

            }

        }


        return null;
    }







    public static void main(String[] args) {



        // Books should be sorted by title for Binary Search

        List<Book> library = new ArrayList<>();



        library.add(
                new Book(
                        "BK101",
                        "Atomic Habits",
                        "James Clear"
                )
        );



        library.add(
                new Book(
                        "BK102",
                        "Clean Code",
                        "Robert C. Martin"
                )
        );



        library.add(
                new Book(
                        "BK103",
                        "Java Programming",
                        "Herbert Schildt"
                )
        );



        library.add(
                new Book(
                        "BK104",
                        "The Alchemist",
                        "Paulo Coelho"
                )
        );





        System.out.println("Linear Search Result:");

        System.out.println(
                linearSearchByTitle(
                        library,
                        "Java Programming"
                )
        );





        System.out.println("\nBinary Search Result:");

        System.out.println(
                binarySearchByTitle(
                        library,
                        "The Alchemist"
                )
        );

    }
}