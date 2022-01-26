package com.codegym;

import java.util.ArrayList;

public class LibraryCardManagement {
    private ArrayList<LibraryCard> libraryCardArrayList = new ArrayList<>();

    public ArrayList<LibraryCard> getLibraryCardArrayList() {
        return libraryCardArrayList;
    }

    public void setLibraryCardArrayList(ArrayList<LibraryCard> libraryCardArrayList) {
        this.libraryCardArrayList = libraryCardArrayList;
    }

    public void displayArrayList() {
        for (LibraryCard libraryCard : libraryCardArrayList) {
            System.out.println(libraryCard);
        }
    }

    public void addLibraryCard(int index, LibraryCard libraryCard) {
        this.libraryCardArrayList.add(index, libraryCard);
    }

    public void searchLibraryCardOfArrayList(String name) {
        for (LibraryCard libraryCard : libraryCardArrayList) {
            if (libraryCard.getStudent().getName().equalsIgnoreCase(name))
                System.out.println(libraryCard);
        }
    }

    public void removeArrayList(LibraryCard libraryCard) {
        this.libraryCardArrayList.remove(libraryCard);
    }

    public void updateArrayList(int index, LibraryCard libraryCard) {
        this.libraryCardArrayList.set(index, libraryCard);
    }

    public void displayListUserPayBookLastMonth() {
        for (LibraryCard libraryCard : libraryCardArrayList) {
            if (libraryCard.getReturnDate().getDate() == 31 || libraryCard.getReturnDate().getDate() == 30) {
                System.out.println(libraryCard);
            }
        }
    }

}
