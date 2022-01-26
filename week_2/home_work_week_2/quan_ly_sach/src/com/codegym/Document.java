package com.codegym;

public class Document {
    String code;
    String imprint;
    String releaseNumber;

    public Document() {
    }

    public Document(String code, String imprint, String releaseNumber) {
        this.code = code;
        this.imprint = imprint;
        this.releaseNumber = releaseNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public void display(){
        System.out.println("Mã tài liệu: " + this.code);
        System.out.println("Tên nhà xuất bản: " + this.imprint);
        System.out.println("Số phát hành: " + this.releaseNumber);
    }
}
