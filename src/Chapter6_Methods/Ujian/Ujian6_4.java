package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Slip Gaji karyawan Bulan Februari ");
        int tahun = input.nextInt();
        System.out.print("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.print("Nama karyawan        : ");
        String nama = input.next();
        System.out.print("Status               : ");
        double status = input.nextDouble();
        switch ((int) status){
            case 1:
                System.out.println("                       menikah");
                break;
            case 2:
                System.out.println("                       Belum Menikah");
                break;
            case 3:
                System.out.println("                       Duda");
                break;
            case 4:
                System.out.println("                       Janda");
        }
        System.out.print("Jumlah anak          : ");
        double anak = input.nextDouble();
        System.out.print("Jarak rumah - kantor : ");
        double jarak = input.nextDouble();
        System.out.print("Jumlah masuk kerja   : ");
        double jumlah = input.nextDouble();
        System.out.print("Tahun masuk          : ");
        double tahunMasuk = input.nextDouble();
        System.out.print("Gaji pokok           : ");
        double gajiPokok = input.nextDouble();
        System.out.println(" ");

        System.out.println(tunjangan(anak,status,jarak,jumlah,tahunMasuk,tahun,gajiPokok));

    }
    public static int tunjangan(double anak, double status, double jarak, double jumlah, double tahunMasuk,double tahun, double gajiPokok) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(
                """
                        Gaji pokok      |     T. Keluarga     |   T. Transportasi   |     T. Kesehatan    \s
                        --------------------------------------------------------------------------------""");
        System.out.printf("%4.0f", gajiPokok);
        System.out.print("        |      ");

        double tKeluarga = 0;
        if ( status == 2)
            System.out.printf("%4.0f", tKeluarga = gajiPokok * 0.0);
        else if (status == 1 && anak == 0)
            System.out.printf("%4.0f", tKeluarga = gajiPokok * 0.05);
        else if (anak <= 3)
            System.out.printf("%4.0f", tKeluarga = gajiPokok * 0.075);
        else if (anak >= 3)
            System.out.printf("%4.0f", tKeluarga = gajiPokok * 0.010);
        else if (status == 3 && anak > 0)
            System.out.printf("%4.0f", tKeluarga = gajiPokok * 0.05);
        else if (status == 4 && anak > 0)
            System.out.printf("%4.0f",tKeluarga = gajiPokok * 0.075);
        else if (status == 3)
            System.out.printf("%4.0f",tKeluarga = gajiPokok *0.03);
        else if (status == 4)
            System.out.printf("%4.0f",tKeluarga = gajiPokok * 0.05);
        else
            System.out.printf("%4.0f", "Error");
        System.out.print("         |      ");

        // tunjangan transfortasi
        double tTransfortasi = 0;
        if (jarak <= 5) {
            System.out.printf("%4.0f",tTransfortasi = 5000 * jumlah);
        } else if (jarak >= 5 & jarak <= 10) {
            System.out.printf("%4.0f",tTransfortasi = 10000 * jumlah);
        } else if (jarak >= 10) {
            System.out.printf("%4.0f",tTransfortasi = 15000 * jumlah);
        }
        System.out.print("         |      ");

        //tunjangan kesehatan
        double tKesehatan;
        tahunMasuk = tahun - tahunMasuk;
        double bulan = 0;
        if (tahunMasuk <= 2) {
            System.out.printf("%8.0f",tKesehatan = 200000 + bulan);
        } else if (tahunMasuk <= 5) {
            System.out.printf("%8.0f",tKesehatan = 500000 + bulan);
        } else {
            System.out.printf("%8.0f",tKesehatan = 750000 + bulan);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        double total = gajiPokok + tKeluarga + tTransfortasi + tKesehatan;
        System.out.printf("Total Gaji Bulan Februari : %4.0f\n", total);
        System.out.println("---------------------------------------------------------------------------------");

    return 0;
    }
}
