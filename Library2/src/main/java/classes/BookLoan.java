package classes;

import java.util.ArrayList;

public class BookLoan {

    private ArrayList<Book> books;
    private String start_date;
    private String end_date;

    public BookLoan(String start_date, String end_date, ArrayList<Book> books) {
        this.books = books;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String toString() {
        return "FROM: " + start_date + " TO: " + end_date;
    }

    public boolean isExceed() {
        if (this.books.size() <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public void registerBookLoan() {
        repositories.BookLoanRepository.getLoans().add(this);
        System.out.print(repositories.BookLoanRepository.getLoans());
    }
}
