package Chapter5_Loops.Latihan;

import java.util.Scanner;

public class computeCDValue5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah setoran awal: ");
        double jumlah = input.nextDouble();
        System.out.print("Masukan hsil presentasi tahunan: ");
        double hasil = input.nextDouble();
        System.out.print("Masukan jatuh tempo (jumlah bulan): ");
        int tempo = input.nextInt();

        System.out.println("month   CD Value");
        for (int t = 1; t <= tempo; t++) {
            jumlah += jumlah * (hasil / 1200);
            System.out.printf("%-7d%.2f\n", t, jumlah);
        }
    }
}
