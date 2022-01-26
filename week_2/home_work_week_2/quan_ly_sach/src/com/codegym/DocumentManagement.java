package com.codegym;
import java.util.ArrayList;
import java.util.List;
public class DocumentManagement {

    List<Document> documentList = new ArrayList<>(10);

    public DocumentManagement(List<Document> documentList) {
        this.documentList = documentList;
    }

    public DocumentManagement() {
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public int size() {
        return this.documentList.size();
    }

    public void display() {
        for (Document document : documentList)
            document.display();
    }

    public void addDocument(Document document) {
        documentList.add(document);
    }

    public void addDocument(int index, Document document) {
        documentList.add(index, document);
    }

    public void searchByCode(String code) {
        int count = 0;
        for (Document document : documentList) {
            if (document.code.equalsIgnoreCase(code)) {
                document.display();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy tài liệu");
        }
    }

    public void searchByDocumentType(String typeOfDocument){
        for (Document document: documentList){
            if (typeOfDocument.equalsIgnoreCase("sách") && document instanceof Book){
                document.display();
            }else if (typeOfDocument.equalsIgnoreCase("tạp chí")  && document instanceof Magazine){
                document.display();
            }else if (typeOfDocument.equalsIgnoreCase("báo") && document instanceof Newspaper){
                document.display();
            }else {
                System.out.println("Không có kiểu tại liệu mà bạn tìm kiếm");
            }
        }
    }
}
