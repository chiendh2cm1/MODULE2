package com.codegym;

public class Magazine extends Document {
    String issueNumber;
    int releaseMonth;

    public Magazine() {
    }

    public Magazine(String issueNumber, int releaseMonth) {
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine(String code, String imprint, String releaseNumber, String issueNumber, int releaseMonth) {
        super(code, imprint, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Số phát hành: " + this.issueNumber);
        System.out.println("Tháng phát hành: " + this.releaseMonth);
    }
}
