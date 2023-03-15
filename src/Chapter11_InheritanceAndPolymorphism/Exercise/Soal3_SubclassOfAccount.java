package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal3_SubclassOfAccount {
    public static void main(String[] args) {
        Soal3_Account account = new Soal3_Account();
        Soal3_savingAccount saving = new Soal3_savingAccount(1001, 20000);
        Soal3_CheckingAccount checking = new Soal3_CheckingAccount(1004, 20000, -20);

        account.setAnnualInterestRate(4.5);
        saving.setAnnualInterestRate(4.5);
        checking.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        saving.withdraw(2500);
        checking.withdraw(2500);

        account.deposit(3000);
        saving.deposit(3000);
        checking.deposit(3000);

        System.out.println(account.toString());
        System.out.println(saving.toString());
        System.out.println(checking.toString());
    }
}
