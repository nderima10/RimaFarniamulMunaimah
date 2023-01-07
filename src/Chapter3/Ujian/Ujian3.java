package Chapter3.Ujian;

import java.util.Scanner;

public class Ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double penjualan =0, komisi =0, jasa =0, pendapatan=0;

        System.out.print("Nama sales : ");
        String nama = input.nextLine();
        System.out.print("Masukan jumlah penjualan sales hari ini : ");
        penjualan = input.nextDouble();
        System.out.println("=========================================");

        if (penjualan <= 200000) {
            jasa = 10000;
            komisi = penjualan * 0.10;
        }else if (penjualan <= 500000) {
            jasa = 20000;
            komisi = penjualan * 0.15;
        }else if (penjualan >= 500000) {
            jasa = 30000;
            komisi = penjualan * 0.20;
        }else {
            System.out.print("salah ! ");
        }

        pendapatan = jasa + komisi;

        System.out.println("Nama sales " + nama);
        System.out.println("selamat, total penjualan anda hari ini adalah " +  String.format("%.2f", penjualan) );
        System.out.println("Anda berhak mendapatkan komisi " + String.format("%.2f", komisi) + " dan uang jasa " +  String.format("%.2f", jasa) );
        System.out.println("Total pendapatan anda hari ini adalah " + String.format("%.2f", pendapatan) );
    }
}
