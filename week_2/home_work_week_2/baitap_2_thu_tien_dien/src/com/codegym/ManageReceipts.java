package com.codegym;

public class ManageReceipts {
    Receipt[] receipts = new Receipt[0];

    public Receipt[] getReceipts() {
        return receipts;
    }

    public void setReceipts(Receipt[] receipts) {
        this.receipts = receipts;
    }

    public int size() {
        return receipts.length;
    }

    public void displayReceipt() {
        for (Receipt receipt : receipts) {
            System.out.println(receipt);
        }
    }

    public void addReceipt(int index, Receipt receipt) {
        Receipt[] newReceipts = new Receipt[receipts.length + 1];
        for (int i = 0; i < newReceipts.length; i++) {
            if (i< index)
                newReceipts[i] = receipts[i];
            else if (index == i)
                newReceipts[i] = receipt;
            else
                newReceipts[i] = receipts[i - 1];
        }
        this.receipts = newReceipts;
    }

    public void updateReceipt(int index, Receipt receipt) {
        this.receipts[index] = receipt;
    }

    public void removeReceipt(int index) {
        Receipt[] newReceipts = new Receipt[receipts.length - 1];
        for (int i = 0; i < newReceipts.length; i++) {
            if (index < i)
                newReceipts[i] = receipts[i];
            else
                newReceipts[i] = receipts[i + 1];
        }
        this.receipts = newReceipts;
    }

    public double amountToPay(String name) {
        double money = 0;
        int count = 0;
        for (Receipt receipt : receipts) {
            if (receipt.getCostomer().getName().equalsIgnoreCase(name)) {
                money = (receipt.getOldPowerIndicator() - receipt.getNewPowerIdecator()) * 750;
                count++;
            }
        }
        if (count !=0){
            System.out.println("Không tìm được hộ dân cần thanh toán.");
        }
        return money;
    }
}
