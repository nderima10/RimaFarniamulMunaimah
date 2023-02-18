package Chapter8_MultidimensionalArray.Ujian;

import java.util.Scanner;

public class Ujian8dan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("*** apk pengolahan nilai siswa ***");
        System.out.println("============================================");


        System.out.print("Masukan jumlah siswa: ");
        int jmlSiswa = input.nextInt();
        System.out.print("masukan jumlah mapel: ");
        int jmlMapel = input.nextInt();

        String[] namaSiswa = new String[jmlSiswa];
        String[] namaMapel = new String[jmlMapel];

        System.out.println("*** INPUT MATA PELAJARAN  ***");

        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("Masukan Mata pelajaran ke " + (i + 1) + " : ");
            namaMapel[i] = input.next();
        }

        double[][] nilaiSiswa = new double[jmlSiswa][jmlMapel];
        double jmlhNilai;
        double[] rataRataNilaiSiswa = new double[jmlSiswa];
        char[] indexNilaiSiswa = new char[jmlSiswa];
        String[] keterangan = new String[jmlSiswa];

        System.out.println("*** INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN ***");
        for (int i = 0; i < jmlSiswa; i++) {
            jmlhNilai = 0;
            System.out.print("masukan nama siswa ke " + (i + 1) + " : ");
            namaSiswa[i] = input.next();
            for (int j = 0; j < jmlMapel; j++) {
                System.out.print("masukan nilai " + namaMapel[j]);
                nilaiSiswa[i][j] = input.nextDouble();
                jmlhNilai += nilaiSiswa[i][j];
            }
            rataRataNilaiSiswa[i] = jmlhNilai / jmlMapel;

            if (rataRataNilaiSiswa[i] >= 80) {
                indexNilaiSiswa[i] = 'A';
            }
            if (rataRataNilaiSiswa[i] >= 70) {
                indexNilaiSiswa[i] = 'B';
            }
            if (rataRataNilaiSiswa[i] >= 60) {
                indexNilaiSiswa[i] = 'C';
            }
            if (rataRataNilaiSiswa[i] >= 50) {
                indexNilaiSiswa[i] = 'D';
            }

            if (indexNilaiSiswa[i] == 'A') {
                keterangan[i] = "Lulus dengan baik";
            } else if (indexNilaiSiswa[i] == 'B' && indexNilaiSiswa[i] == 'C') {
                keterangan[i] = "Lulus";
            } else if (indexNilaiSiswa[i] == 'D') {
                keterangan[i] = "Lulus dengan pertimbangan";
            } else {
                keterangan[i] = "Tidak Lulus";
            }
        }
        double[] rataRataNilaiMapel = new double[jmlMapel];
        double[] nilaiTertinggi = new double[jmlMapel];
        double[] nilaiTerendah = new double[jmlMapel];
        String[] siswaBerprestasi = new String[jmlMapel];

        for (int i = 0; i < jmlMapel; i++) {
            double max = 0, min = 100, jumlahNilaiMapel = 0;
            String namaSiswaBerprestasi = " ";
            for (int j = 0; i < jmlSiswa; i++) {
                jumlahNilaiMapel += nilaiSiswa[j][i];

                if (nilaiSiswa[j][i] > max) {
                    max = nilaiSiswa[j][i];
                    namaSiswaBerprestasi = namaSiswa[j];
                }
                if (nilaiSiswa[j][i] < min) {
                    min = nilaiSiswa[j][i];
                }
            }
            rataRataNilaiMapel[i] = jumlahNilaiMapel / jmlSiswa;
            nilaiTertinggi[i] = max;
            nilaiTerendah[i] = min;
            siswaBerprestasi[i] = namaSiswaBerprestasi;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("*** DATA NILAI SISWA ***");
        System.out.println(" ");

        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.println("----------------------------------------------\n");

        System.out.printf("| %-5s  | %-15s | ", "No", "Nama Siswa");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10s | ", namaMapel[i]);
        }

        System.out.printf("%-10s | %-5s | %-25s |\n", "Rata-Rata", "Index", "Keterangan");
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        for (int i = 0; i < jmlSiswa; i++) {
            System.out.printf("| %-5s | %-15s | ", (i + 1), namaSiswa[i]);
            for (int j = 0; j < jmlMapel; j++) {
                System.out.printf("%-10s | ", nilaiSiswa[i][j]);
            }
            System.out.printf("%-20.2f | %-5s | %-25s | \n", rataRataNilaiSiswa[i], indexNilaiSiswa[i], keterangan[i]);
        }
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        System.out.print("Nilai Rata-rata       | ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10.2f | ", rataRataNilaiMapel[i]);
        }
        System.out.print("                                               | ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10.2f | ", nilaiTertinggi[i]);
        }
        System.out.print("                                               | ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.printf("%-10.2f | ", nilaiTertinggi[i]);
        }

        System.out.print("                                               | ");
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        System.out.println("Siswa berprestasi ");
        for (int i = 0; i < jmlMapel; i++) {
            System.out.println((i + 1) + ". " + namaMapel[i] + " = " + siswaBerprestasi[i]);
        }
    }
}



