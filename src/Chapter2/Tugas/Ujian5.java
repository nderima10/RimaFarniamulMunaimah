package Chapter2.Tugas;

import java.util.Scanner;

public class Ujian5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jarak perjalanan dalam kilometer: ");
        double jarak = input.nextDouble();
        System.out.print("Masukan kansumsi bahan bakar kendaraan ada dalam kilometer/ liter: ");
        double liters = input.nextDouble();
        System.out.print("Masukan harga bahan bakar dalam 1 liter: ");
        double harga = input.nextDouble();
        double total = jarak / liters * harga;
        System.out.println("Maka totak biaya perjalanan anda dalam " + jarak + " km adalah Rp." + String.format("%.2f", total));
    }
}
