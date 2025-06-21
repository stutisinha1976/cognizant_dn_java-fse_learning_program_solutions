import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "John Doe"),
            new Book(2, "Data Structures", "Jane Smith"),
            new Book(3, "Algorithms", "Robert Martin")
        };

        System.out.println("Linear Search: 'Data Structures'");
        Book result1 = Library.linearSearch(books, "Data Structures");
        System.out.println(result1 != null ? result1 : "Book not found");

        System.out.println("\nSorting books for binary search...");
        Library.sortBooksByTitle(books);

        System.out.println("Binary Search: 'Algorithms'");
        Book result2 = Library.binarySearch(books, "Algorithms");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
