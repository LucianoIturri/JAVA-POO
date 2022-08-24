/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.library2;

import java.util.ArrayList;
import classes.*;
import java.util.ArrayList;
import repositories.*;

/**
 *
 * @author lucia
 */
public class Library2 {

        public static void main(String[] args) {
        //init repos
        BooksRepository books_repo = new BooksRepository();
        books_repo.init();
        BookLoanRepository loans_repo = new BookLoanRepository();
        loans_repo.init();

        //create a new Student
        Student student = new Student(true, 1234, "Luccio");

        //create a new Student
        Teacher teacher = new Teacher(12345, "Teacher");

        //create a books arraylist and puts some books into
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(books_repo.getBooks().get(0));
        books.add(books_repo.getBooks().get(1));

        //create a new book loan with the books list earlier 
        BookLoan book_loans = new BookLoan("2022-08-22", "2022-08-23", books);

        //executes the function to register a new loan 
        System.out.println(student.createBookLoan(book_loans));
        System.out.println(teacher.createBookLoan(book_loans));

    }
}
