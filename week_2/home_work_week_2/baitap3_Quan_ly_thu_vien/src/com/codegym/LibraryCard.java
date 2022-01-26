package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryCard {
    private String libraryCardNumber;
    private Date borrowedDate;
    private Date returnDate;
    private String bookNumber;
    private Student student;

    public LibraryCard() {
    }

    public LibraryCard(String libraryCardNumber, Date borrowedDate, Date returnDate, String bookNumber, Student student) {
        this.libraryCardNumber = libraryCardNumber;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
        this.bookNumber = bookNumber;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public String toString() {
        return this.student + ", "
                + this.libraryCardNumber + ", "
                + sdf.format(this.borrowedDate) + ", "
                + sdf.format(this.returnDate) + ", "
                + this.bookNumber;
    }
}
