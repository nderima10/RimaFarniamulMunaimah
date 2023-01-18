package Chapter2_Elementary.Tugas;

import java.util.Scanner;

public class Ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double dolarToRupiah = 15665;
        System.out.print("masukan nilai rupiah: ");
        double nilai = input.nextDouble();
        double rupiah = nilai / dolarToRupiah;
        System.out.println("nilai dolar adalah " + " $ " + String.format("%.2f" , rupiah));
    }
}
