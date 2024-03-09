package JavaQuestions.book;

import java.util.Arrays;
import java.util.List;

public class BookStreamSolutions {
    public static void main(String[] args) {

        // Create a list of books
        List<Book> books = Arrays.asList(
                new Book("Java 8 in Action", "Raul-Gabriel Urma", 2014,40.00),
                new Book("Effective Java", "Joshua Bloch", 2008, 35.50),
                new Book("Clean Code", "Robert C. Martin", 2008,45.0),
                new Book("The Pragmatic Programmer", "Andrew Hunt, David Thomas",1999,50.00));
//
// Use Stream Lambda expressions to perform operations on the list book

       // 1.Print the Title of book published after 2000
        System.out.println("Title book published after 2000");
        books.stream()
                .filter(book -> book.getYear() > 2000)
                .map(Book::getTitle)
                .forEach(System.out::println);

        //2. Calculate the total price of all books
        System.out.println("Calculate the total price");
        double totalPrice = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();
        System.out.println("Total price of al books: $" + totalPrice );


        //3. Find the book with the highest price
        //4. Create a new list books price less than $40

    }
}
