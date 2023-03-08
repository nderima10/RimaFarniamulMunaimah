package Chapter10_ObjectOrientedThingking.Exercise;

import java.util.Date;

public class Soal7b {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    Soal7b() {
        this.id = 0;
        this.balance = 0;
        annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    Soal7b(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Soal7b.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit (double amount) {
        balance += amount;
    }
}
