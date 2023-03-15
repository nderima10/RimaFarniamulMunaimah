package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.Date;

public class Soal3_Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    Soal3_Account() {
        this(0,0);
    }
    Soal3_Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterest() / 100);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public String toString() {
        return super.toString() + "\nAccount ID" + id + "\nDate created: " + getDateCreated() +
                "\nBalance: $ " + String.format("%.2f", balance) + "\nMonthly  interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}
