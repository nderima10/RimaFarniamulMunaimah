package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Slip Gaji karyawan Bulan Februari 2023");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Nama karyawan        : ");
        System.out.println("Status               : ");
//        double status = input.nextDouble();
        System.out.print("Jumlah anak          : ");
        double anak = input.nextDouble();
        System.out.print("Jarak rumah - kantor : ");
        String jarak = String.valueOf(input.nextDouble());
        System.out.print("Jumlah masuk kerja   : ");
        double jumlah = input.nextDouble();
//        System.out.print("Tahun masuk        : ");
//        double tahun = input.nextDouble();
        System.out.println(tKeluarga(anak));

        System.out.println(tTransfortasi(Double.parseDouble(jarak), jumlah));

//        System.out.println(tKesehatan(tahun));



    }

    public static char tKeluarga(double anak) {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(
                """
                        Gaji pokok      |     T. Keluarga     |      T. Transportasi      |     T. Kesehatan    \s
                        -------------------------------------------------------------------------------------""");
        double gajiPokok = 10000000;
        System.out.printf("%4.2f", gajiPokok);
        System.out.print("       |        ");

        if (anak == 0)
            System.out.printf("%4.2f",    gajiPokok * 0.50);
         else if (anak <= 3)
            System.out.printf("%4.2f",    gajiPokok * 0.075);
         else if (anak >= 3)
            System.out.printf("%4.2f",    gajiPokok * 0.010);
         else
            System.out.print(gajiPokok);
         System.out.println("     |     ");
        System.out.println("-------------------------------------------------------------------------------------");
        return 0;
    }
    public static int tTransfortasi(double jarak, double jumlah) {
        if (jarak <= 5) {
            System.out.printf("%6.3f", 5000/ jumlah);
        } else if (jarak >= 5 & jarak <= 10) {
            System.out.printf("%6.3f", 10000 / jumlah);
        } else if (jarak >= 10) {
            System.out.printf("%6.3f", 15000 / jumlah);
        }
        return 0;
    }
//    private static double tKesehatan(int tahun, int bulan) {
//        if (tahun <= 2) {
//            System.out.printf("%8.3f", 200000 / bulan);
//        } else if (tahun <= 5) {
//            System.out.printf("%8.3f", 500000 / bulan);
//        } else {
//            System.out.printf("%8.3f", 750000 / bulan);
//        }
//        return 0;
//    }

}
