package repositories;

import classes.BookLoan;
import classes.Book;
import java.util.ArrayList;

public class BookLoanRepository {

    private static ArrayList<BookLoan> loans;

    public static ArrayList<BookLoan> getLoans() {
        return loans;
    }

    public static void setLoans(ArrayList<BookLoan> loans) {
        BookLoanRepository.loans = loans;
    }

    public static void init() {
        createBookLoans();
    }

    private static void createBookLoans() {
        loans = new ArrayList<BookLoan>();
    }
}
