package classes;

import classes.Member;
import java.util.ArrayList;

public class Teacher extends Member {

    protected boolean accredited;

    public Teacher(int dni, String name) {
        super(dni, name);
        this.accredited = true;
    }

    public String toString() {
        return this.getName();
    }

    public String createBookLoan(BookLoan book_loans) {
        String message = "";

        if (book_loans.isExceed()) {
            this.setBook_loans(book_loans);
            book_loans.registerBookLoan();
            message = "\n" + getName() + " finished succesfully. You must to return on " + book_loans.getEnd_date() + "\nNumber of loans: " + repositories.BookLoanRepository.getLoans().size();
        } else {
            message = getName() + " exceeds the limit of books";
        }

        return message;
    }
}
