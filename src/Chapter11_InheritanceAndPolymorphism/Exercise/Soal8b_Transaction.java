package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.Date;

public class Soal8b_Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String descriptions;

    public Soal8b_Transaction(char type, double amount, double balance, String descriptions) {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.descriptions = descriptions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
