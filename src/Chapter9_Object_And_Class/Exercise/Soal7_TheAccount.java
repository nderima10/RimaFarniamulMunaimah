package Chapter9_Object_And_Class.Exercise;

import java.util.Date;

public class Soal7_TheAccount {
    private int id;
    private double balance;
    private static double  annualInterestRate;
    private Date dateCreated;

    Soal7_TheAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Soal7_TheAccount(int  newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    public void setId(int newId) {
        id = newId;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInterest() {
        return balance * (getAnnualInterestRate() / 100);
    }
    public void withDrow(double amount) {
        balance -= amount;
    }
    public void deposit (double amount) {
        balance += amount;
    }
}
