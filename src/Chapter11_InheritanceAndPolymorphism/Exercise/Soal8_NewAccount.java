package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal8_NewAccount {
    public static void main(String[] args) {
        Soal8b_Account account = new Soal8b_Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("    Account Summary ");
        System.out.println("-----------------------------------");
        System.out.println("Account holder name " + account.getName());
        System.out.println("Interest  rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n      List of transactions ");
        System.out.println("-----------------------------------");
        for (int i = 0; i < account.getTransaction().size(); i++) {
            System.out.println("Date: " + (account.getTransaction()).get(i).getDate());
            System.out.println("Type: " + (account.getTransaction()).get(i).getType());
            System.out.println("Amount: " + (account.getTransaction()).get(i).getAmount());
            System.out.println("Balance: " + (account.getTransaction()).get(i).getBalance());
            System.out.println("Description: " + (account.getTransaction()).get(i).getDescriptions());
        }
    }
}
