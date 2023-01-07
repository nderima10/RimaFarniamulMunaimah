package Chapter3.Ujian;

import java.util.Scanner;

public class Ujian5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Aplikasi penilaian (Renatang nilai 0 - 100)");
        System.out.print("Masukan nilai kehadiran : ");
        double NK = input.nextInt();
        System.out.print("Masukan nilai tugas : " );
        double NT = input.nextInt();
        System.out.print("Masukan nilai uts : " );
        double NUTS = input.nextInt();
        System.out.print("Masukan nilai uas : " );
        double NUAS = input.nextInt();
        System.out.print("masukan nilai project akhir : " );
        double NP = input.nextInt();

        double nilaiKehadiran = 0.5 * NK;
        double nilaiTugas = 0.20 * NT;
        double nilaiProject = 0.30 * NP;
        double nialiUTS = 0.20 * NUTS;
        double nilaiUAS = 0.25 * NUAS;
        double nilaiAkhir = (nilaiKehadiran + nilaiTugas + nilaiProject + nialiUTS + nilaiUAS);

        if (nilaiAkhir >= 90) {
            System.out.print("selamat anda Lulus dengan nilai A");
        }else if (nilaiAkhir >= 85) {
            System.out.print("selamat anda Lulus dengan nilai B+");
        }else if (nilaiAkhir >= 80) {
            System.out.print("selamat anda Lulus dengan nilai B");
        }else if (nilaiAkhir >= 75) {
            System.out.print("selamat anda Lulus dengan nilai B-");
        }else if (nilaiAkhir >= 70) {
            System.out.print("selamat anda Lulus dengan nilai C+");
        }else if (nilaiAkhir >= 65) {
            System.out.print("selamat anda Lulus dengan nilai C");
        }else if (nilaiAkhir >= 60) {
            System.out.print("selamat anda Lulus dengan nilai C-");
        }else if (nilaiAkhir >= 50) {
            System.out.println("nilai anda D dinyatakan tidak Lulus");
        }else {
            System.out.println("nilai anda E dinyatakan tidak Lulus");
        }

        if (nilaiAkhir <= 60)
            System.out.println(" Anda harus mengulangi mata kuliah ini");

    }
}
