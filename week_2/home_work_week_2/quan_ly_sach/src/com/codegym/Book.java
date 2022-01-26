package com.codegym;

public class Book extends Document{
        String theWriteName;
        int numberOfpages;

    public Book() {
    }

    public Book(String theWriteName, int numberOfpages) {
        this.theWriteName = theWriteName;
        this.numberOfpages = numberOfpages;
    }

    public Book(String code, String imprint, String releaseNumber, String theWriteName, int numberOfpages) {
        super(code, imprint, releaseNumber);
        this.theWriteName = theWriteName;
        this.numberOfpages = numberOfpages;
    }

    public String getTheWriteName() {
        return theWriteName;
    }

    public void setTheWriteName(String theWriteName) {
        this.theWriteName = theWriteName;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public void setNumberOfpages(int numberOfpages) {
        this.numberOfpages = numberOfpages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tên tác giả: " + this.theWriteName);
        System.out.println("Số trang: " + this.numberOfpages);
    }
}
