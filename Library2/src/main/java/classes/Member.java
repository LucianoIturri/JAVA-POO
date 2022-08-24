package classes;

import classes.BookLoan;
import java.util.ArrayList;

public class Member {

    private int dni;
    private String name;
    private BookLoan book_loans;

    public Member(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookLoan getBook_loans() {
        return book_loans;
    }

    public void setBook_loans(BookLoan book_loans) {
        this.book_loans = book_loans;
    }
}
