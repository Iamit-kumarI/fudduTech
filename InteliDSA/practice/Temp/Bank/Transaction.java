package Temp.Bank;

import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.date = new Date();
        this.amount = amount;
        this.type = type;
    }

    public String toString() {
        return date + " | " + type + " | Amount: " + amount;
    }
}