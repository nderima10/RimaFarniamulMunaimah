package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal3_CheckingAccount extends Soal3_Account{
    private double overdraftLimit;
    public Soal3_CheckingAccount() {
        super();
        overdraftLimit = -20;
    }
    public Soal3_CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void withdraw(double amount) {
        if(getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! amount exceeds overdraft limit,");
    }
    public String toString() {
        return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", overdraftLimit);
    }
}
