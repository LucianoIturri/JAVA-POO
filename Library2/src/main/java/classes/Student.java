package classes;

import classes.Member;
import java.util.ArrayList;

public class Student extends Member {

    private boolean accredited;

    public Student(boolean accredited, int dni, String name) {
        super(dni, name);
        this.accredited = accredited;
    }

    public boolean isAccredited() {
        return accredited;
    }

    public void setAccredited(boolean accredited) {
        this.accredited = accredited;
    }

    public String createBookLoan(BookLoan book_loans) {
        String message = "";

        if (isAccredited()) {
            if (book_loans.isExceed()) {
                this.setBook_loans(book_loans);
                book_loans.registerBookLoan();
                message = "\n"+getName() + " finished succesfully. You must to return on " + book_loans.getEnd_date()+"\nNumber of loans: "+repositories.BookLoanRepository.getLoans().size();
            } else {
                message = getName() + " exceeds the limit of books";
            }
        } else {
            message = getName() + " is not available to take this book";
        }

        return message;
    }

    @Override
    public String toString() {
        return this.getName() + " accredited: " + accredited;
    }
}
