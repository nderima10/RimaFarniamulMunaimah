package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Slip Gaji karyawan Bulan Februari 2023");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Nama karyawan      : Nde Rima");
        System.out.println("Status             : Belum Menikah");
        System.out.print("Jumlah anak        : ");
        double anak = input.nextDouble();
//        System.out.println("Jarak rumah kantor : ");
//        String jarak = input.nextLine();
//        System.out.println("Jumlah masuk kerja : ");
//        double jumlah = input.nextDouble();
//        System.out.println("Tahun masuk        : ");
//        double tahun = input.nextDouble();


        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(
                """
                        Gaji pokok      |     T. Keluarga     |      T. Transportasi      |     T. Kesehatan    \s
                        -------------------------------------------------------------------------------------""");
         System.out.println(tKeluarga(anak)); 
    }

    public static boolean tKeluarga(double anak) {
        double gajiPokok = 10.000000;
        
        System.out.printf("%4.6f", gajiPokok);
        System.out.print("       |        ");
        if (anak == 0)
            System.out.printf("%4.3f",    gajiPokok * 0.50);
         else if (anak <= 3)
            System.out.printf("%4.6f",    gajiPokok * 0.075);
         else if (anak >= 3)
            System.out.printf("%4.1f",    gajiPokok * 0.010);
         else
            System.out.print(gajiPokok);
         System.out.print("     |     ");

        return false;
    }
}

//    public static boolean tTransfortasi (String jarak, ) {
//        if (jarak < 5) {
//            System.out.printf("%7.3f", 5000 / jumlah);
//        } else if (jarak <= 10) {
//            System.out.printf("%7.3f", 10000 / grtJumlah);
//        } else if (jarak >= 10) {
//            System.out.printf("%7.3f", 15000 / grtJumlah);
//        }  else {
//            System.out.printf("%7.3f");
//        }
//        return false;






//
//            System.out.printf("%7.6f\n", gajiPokok);
//
//            for (tKeluarga = 0; tKeluarga <= 0; tKeluarga++) {
//                System.out.println(0);
//            }
//             for (tKeluarga = ) {
//            System.out.printf("%7.3f", gajiPokok * tKeluarga);
//            for (tKeluarga = 0.075; tKeluarga <= 3; tKeluarga++)
//            System.out.printf("%7.3f", gajiPokok * tKeluarga);

//        tunjanganKeluarga(gajiPokok, tKeluarga);
//    }
////        tunjanganKeluarga(gajiPokok, status, anak);
////    }
////    public static double tunjanganKeluarga (double gajiPokok, double status, double anak) {
////        //Tunjangan keluarga
////        if (gajiPokok <= 100.000) {
////            status = 0, 0;
////            anak = gajiPokok * status;
////        }
////        // menikah belm punya anak
////        else if (gajiPokok = 100.0000) {
////            status = 0, 10;
////            anak = gajiPokok * status;
////        }
////        // Duda beranak
////        else if (gajiPokok = 100.000) {
////            status = 0, 5;
////            anak = gajiPokok * status;
////        }
////        // janda beranak
////        else if (gajiPokok = 100.000) {
////            status = 0, 7.5;
////            anak = gajiPokok * status;
////        }
////        // Duda
////        else if (gajiPokok = 100.000) {
////            status = 0, 3;
////            anak = gajiPokok * status;
////        }
////        // Janda
////        else if (gajiPokok = 100.000) {
////            status = 0, 5;
////            anak = gajiPokok * status;
////        }
////        return anak;
////        transforasi(jarak, tTransfortasi, masuk);
////    }
////    public static void transforasi (double jarak, double tTransformasi, double masuk){
////        if (jarak < 5 && tTransformasi == 5000 / masuk) {
////            return;
//    public static void tunjanganKeluarga (double gajiPokok, double tKeluarga) {
//  for(gajiPokok = 10.000000, tKeluarga = 750.000;
//    gajiPokok <= 1.0;gajiPokok++,tKeluarga +=1)
//
//    {
//        System.out.printf("%7.6f    ", gajiPokok);
//        System.out.printf("%12.3f", gajiPokok(tKeluarga));
//        System.out.print("      |     ");
//        System.out.printf("%7.3f     ", tKeluarga);
//        System.out.printf("%12.3f\n", metersToInch(tKeluarga));
//        inc
//    }
//    public static double inchToMeters(double gajiPokok) {
//
//        return 0.00 * gajiPokok;
//    }
//
//    public static double metersToInch(double tKeluarga){
//
//            return 0.010 * tKeluarga;
//        }


