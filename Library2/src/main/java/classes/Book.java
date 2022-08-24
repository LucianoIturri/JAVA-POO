package classes;

/**
 *
 * @author LucianoJoseIturriCar
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private String[] key_words;

    public Book(int id, String title, String author, String[] key_words) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.key_words = key_words;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getKey_words() {
        return key_words;
    }

    public void setKey_words(String[] key_words) {
        this.key_words = key_words;
    }

    @Override
    public String toString() {
        return title + ", by " + author + "\n";
    }

    public Book getBookByAuthor(String author) {
        Book founded_book = new Book();
        
        for (Book book : repositories.BooksRepository.getBooks()) {
            if (book.getAuthor().equals(author)) {
                founded_book = book;
            }
        }

        return founded_book;
    }

    public Book getBookByKeyWord(String key_word) {
        Book founded_book = new Book();
        
        for (Book book : repositories.BooksRepository.getBooks()) {
            for (String key_words : book.getKey_words()) {
                if (key_words.equals(key_word)) {
                    founded_book = book;
                }
            }
        }

        return founded_book;
    }
    
    public Book getBookByTitle(String title) {
        Book founded_book = new Book();
        
        for (Book book : repositories.BooksRepository.getBooks()) {
            if (book.getTitle().equals(title)) {
                founded_book = book;
            }
        }

        return founded_book;
    }
}
