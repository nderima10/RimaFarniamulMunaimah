package Chapter10_ObjectOrientedThingking.Exercise;

import java.util.Scanner;

public class Soal7_ATMMachine {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        Soal7b[] accounts = new Soal7b[10];
        initialBalance(accounts);
        do {
            System.out.print("enter an id: ");
            int id = input.nextInt();
            if (isValidID(id, accounts)) {
                int choice;
                do {
                    choice = displayMainMenu(input);
                    if (isTransaction(choice)) {
                        executeTransaction(choice, accounts, id, input);
                    }
                } while (choice != 4);
            }
        } while (true);
    }
    public static void initialBalance(Soal7b[] a) {
        int initialBalance = 100;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Soal7b(i, initialBalance);
        }
    }
    public static boolean isTransaction (int choice) {
        return choice > 0 && choice < 4;
    }
    public static boolean isValidID(int id, Soal7b[] a) {
        for (int i = 0; i < a.length; i++) {
            if (id == a[i].getId())
                return true;
        }
        return false;
    }
    public static int displayMainMenu(Scanner input) {
        System.out.print("\nMain Menu\n1: check balance\n2: withdraw " +
                "\n3: deposit\n4: exit\nEnter a choice: ");
        return input.nextInt();
    }
    public static void executeTransaction(int c, Soal7b[] a, int id, Scanner input) {
        switch (c) {
            case 1:
                System.out.print("The balance is " + a[id].getBalance());
                break;
            case 2:
                System.out.print("Masukkan jumlah untuk ditarik: ");
                a[id].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Masukkan jumlah untuk deposit: ");
                a[id].deposit(input.nextDouble());
        }
    }
}
