package repositories;

import classes.Book;
import java.util.ArrayList;

/**
 *
 * @author LucianoJoseIturriCar
 */
public class BooksRepository {

    private static ArrayList<Book> books;

    public static void init() {
        createBooks();
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void setBooks(ArrayList<Book> books) {
        BooksRepository.books = books;
    }

    private static void createBooks() {
        books = new ArrayList<Book>();
        String[] key_words = {"key_word1", "key_word2", "key_word3"};

        Book book1 = new Book(1, "First Book", "First Author", key_words);
        Book book2 = new Book(2, "Second Book", "Second Author", key_words);
        Book book3 = new Book(3, "Third Book", "Third Author", key_words);
        Book book4 = new Book(4, "Fourth Book", "Fourth Author", key_words);
        Book book5 = new Book(5, "Fifth Book", "Fifth Author", key_words);
        Book book6 = new Book(6, "Sixth Book", "Sixth Author", key_words);
        Book book7 = new Book(7, "Seventh Book", "Seventh Author", key_words);
        Book book8 = new Book(8, "Eighth Book", "Eighth Author", key_words);
        Book book9 = new Book(9, "Nineth Book", "Nineth Author", key_words);
        Book book10 = new Book(1, "Tenth Book", "Tenth Author", key_words);

        
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
    }
}
