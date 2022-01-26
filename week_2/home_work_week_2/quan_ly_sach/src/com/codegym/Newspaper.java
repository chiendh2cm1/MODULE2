package com.codegym;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Newspaper extends Document {
    Date releaseDate;

    public Newspaper() {
    }

    public Newspaper(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Newspaper(String code, String imprint, String releaseNumber, Date releaseDate) {
        super(code, imprint, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public void display() {
        super.display();
        System.out.println("Ngày phát hành: " + sdf.format(releaseDate));
    }
}
