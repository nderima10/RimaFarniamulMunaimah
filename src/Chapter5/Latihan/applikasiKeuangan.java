package Chapter5.Latihan;

import java.util.Scanner;

public class applikasiKeuangan {
    public static void main(String[] args) {
        int totalCost = 0;
        int tuition = 10000;
        Scanner input = new Scanner(System.in);
        int tuitionsTenthYear = input.nextInt();

        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.05);

            if (year > 10)
                totalCost += tuition;
            if (year == 10)
                tuitionsTenthYear = tuition;
        }

        System.out.println("Biaya pada sepuluh tahun $" + tuitionsTenthYear);
        System.out.println("Total Biaya untuk empat tahun " + "setelah 10th : $" + totalCost);
    }
}
