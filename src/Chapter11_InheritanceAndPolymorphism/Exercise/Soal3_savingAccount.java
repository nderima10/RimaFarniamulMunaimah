package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal3_savingAccount extends Soal3_Account{
    public Soal3_savingAccount() {
        super();
    }
    public Soal3_savingAccount(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double  amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("error! saving account overdrawn transaction rejected");
    }
}
