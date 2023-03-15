package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.ArrayList;
import java.util.Date;

public class Soal8b_Account {
    private String name;
    private int id;
    private double  balance;
    private static double annualInterestRate;
    private Date dataCreated;
    private ArrayList<Soal8b_Transaction> transactions;

    Soal8b_Account(){
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dataCreated = new Date();
        transactions = new ArrayList<Soal8b_Transaction>();
    }

    public Soal8b_Account(int id, double balance) {
        name = "";
        this.id = id;
        this.balance = balance;
        dataCreated = new Date();
        transactions = new ArrayList<Soal8b_Transaction>();
    }

    public Soal8b_Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        Soal8b_Account.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() {
        return dataCreated;
    }
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterest() / 100);
    }
    public void withdraw(double amount){
        balance -= amount;
        transactions.add(new Soal8b_Transaction('W', amount, balance, "Withdraw from account"));
    }
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Soal8b_Transaction('D', amount, balance, "Deposit  to account"));
    }
    public ArrayList<Soal8b_Transaction> getTransaction(){
        return transactions;
    }
}
