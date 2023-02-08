package Chapter6_Methods.Ujian;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ujian6_4 {
    static SimpleDateFormat thn = new SimpleDateFormat("mmmm");
    static SimpleDateFormat bul = new SimpleDateFormat("yyyy");
    static Date tanggal = new Date();
    static String bulan = bul.format(tanggal);
    static String tahun = thn.format(tanggal);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama karyawan        : ");
        String nama = input.next();
        System.out.print("Status               : ");
        String status = input.next();
        System.out.print("Jumlah anak          : ");
        int anak = input.nextInt();
        System.out.print("Jarak rumah - kantor : ");
        int jarak = input.nextInt();
        System.out.print("Jumlah masuk kerja   : ");
        int jumlah = input.nextInt();
        System.out.print("Tahun masuk          : ");
        int tahunMasuk = input.nextInt();
        System.out.print("Gaji pokok           : ");
        int gajiPokok = input.nextInt();
        System.out.println(" ");

        int tunjanganKeluarga = tKeluarga(gajiPokok, status, anak);
        int tunjanganTransfortasi = tTransfortasi(jumlah, jarak);
        int tunjanganKesehatan = tKesehatan(tahunMasuk);

        int totalGaji = gajiPokok + tunjanganKeluarga + tunjanganTransfortasi + tunjanganKesehatan;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Slip Gaji karyawan Bulan " + bulan + " " + tahun);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Nama karyawan        : " + nama);
        System.out.println("Status               : " + status);
        System.out.println("Jumlah anak          : " + anak);
        System.out.println("Jarak rumah - kantor : " + jarak);
        System.out.println("Jumlah masuk kerja   : " + jumlah);
        System.out.println("Tahun masuk          : " + tahunMasuk);
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Gajih Pokok\t|\tT.Keluarga\t|\tT.Transport\t|\tT.Kesehatan\t|\t");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%,d\t|\t%,d\t\t|\t%,d\t\t|\t%,d\t\t|\n", gajiPokok, tunjanganKeluarga,tunjanganTransfortasi,tunjanganKesehatan);
        System.out.println(" ");
        System.out.println("Total Gaji Bulan " + bulan + " " + totalGaji);
    }
    private static int tKeluarga (int gajiPokok, String status, int anak) {
        double tKel = 0;
        status = status.toLowerCase();

        if (status.equals("menikah") && anak == 0 ) {
            tKel = gajiPokok * 0.05;
        } else if (status.equals("menikah") && anak <= 3) {
            tKel = gajiPokok * 0.075;
        } else if (status.equals("menikah")) {
            tKel = gajiPokok * 0.1;
        } else if (status.equals("duda") & anak > 0) {
            tKel = gajiPokok * 0.05;
        } else if (status.equals("duda") && anak == 0) {
            tKel = gajiPokok * 0.03;
        } else if (status.equals("janda") && anak > 0) {
            tKel = gajiPokok * 0.075;
        } else if (status.equals("janda") && anak == 0) {
            tKel = gajiPokok * 0.05;
        } else {
            System.out.println("error");
        }

        return (int) tKel;
    }
    private static int tTransfortasi (int jumlah, int jarak) {
        double tTrans;

        if (5 >= jarak) {
            tTrans = 5000 * jumlah;
        } else if (jarak <= 10) {
            tTrans = 10000 * jumlah;
        } else {
            tTrans = 15000 * jumlah;
        }
        return (int) tTrans;
    }
    private static int tKesehatan(int tahunMasuk) {
        int tahunIni = Integer.parseInt(tahun);
        int tKes = 0;
        int lama = tahunIni - tahunMasuk;
        if (lama < 2) {
            tKes = 200000;
        } else if (lama < 5) {
            tKes = 500000;
        } else if (lama > 5) {
            tKes = 750000;
        } else {
            System.out.println("Error");
        }
        return tKes;
    }
}
