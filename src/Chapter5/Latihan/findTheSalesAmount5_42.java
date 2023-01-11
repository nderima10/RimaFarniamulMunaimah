package Chapter5.Latihan;

import java.util.Scanner;

public class findTheSalesAmount5_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double commission = 0.0, balance, salesAmount;

        System.out.print("Masukan komisi yang dicari: ");
        double commissionSought = input.nextDouble();

        for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
            balance = commission = 0.0;

            if (salesAmount >= 10000.01)
                commission += (balance = salesAmount - 10000) * 0.12;

            if (salesAmount >= 5000.01)
                commission += (balance -= balance - 5000) * 0.10;

            if (salesAmount >= 0.01)
                commission += balance * 0.08;
        }

        System.out.printf("penjualan minimum untuk menghasilkan $%.0f: $%.0f\n", commissionSought, salesAmount);
    }
}
