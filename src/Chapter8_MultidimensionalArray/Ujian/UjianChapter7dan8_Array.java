package Chapter8_MultidimensionalArray.Ujian;

import java.util.Scanner;

public class UjianChapter7dan8_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Aplikasi Rekap Nilai ");
        System.out.println("============================");
        System.out.print("Masukan jumlah siswa: ");
        String[] jumlahSiswa = new String[input.nextInt()];
        System.out.print("Masukan jumlah mata pelajaran: ");
        String[] jumlahMapel = new String[input.nextInt()];
        int[] nilai = new int[jumlahSiswa.length];

        System.out.println("*** INPUT MATA PELAJARAN  ***");
        for (int y = 0; y < jumlahMapel.length; y++) {
            System.out.print("Masukan mata pelajaran ke " + (y + 1) + ": ");
            jumlahMapel[y] = input.next();
        }

        System.out.println("*** INPUT  SISWA DAN NILAI  SETIAP MATA PELAJARAN ***");
        for (int r = 0; r < jumlahSiswa.length; r++) {
            System.out.print("Masukan nama siswa Ke " + (r + 1) + " : ");
            jumlahSiswa[r] = input.next();
            for (int i = 0; i < jumlahMapel.length; i++) {
                System.out.print("Nilai " + jumlahMapel[i] + " : ");
                nilai[r] = input.nextInt();

            }
        }

        System.out.println("*** DATA NILAI SISWA ***");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("No\t|\tNama Siswa\t\t|\t Mapel\t|\tRata-Rata\t|\tIndex\t|\tKeterangan\t\t\t|");
        System.out.println("------------------------------------------------------------------------------------------------------");

        //nomor
        int nomor = 10;
        for (int t = 0; t < nomor; t++) {
            System.out.println(t + 1 + "\t|");
        }


        //nama siswa
//            for (int n = 0; n < jumlahSiswa.length; n++) {
//                System.out.println("\t\t\n" + n);
//                jumlahSiswa[n] = input.next();
//            }


        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Nilai Rata-Rata \t\t|\t" + "\t|\t" + "\t|");
        System.out.println("Nilai Tertinggi \t\t|\t" + "\t|\t" + "\t|");
        System.out.println("Nilai Terendah  \t\t|\t" + "\t|\t" + "\t|");
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("Siswa Berprestasi : ");
    }
//    public static int rataRata(int[][]nilai, String[] jumlahSiswa) {
//        for (int i = 0; i < nilai.length; i++) {
//            for (int t = 0; t < nilai.length; t++) {
//                int ratarata = nilai[i][t] / jumlahSiswa.length;
//            }
//        }
//    return ;}


//    public static int Index(int[] nilai) {
//        if (nilai.length >= 80){
//            System.out.printf("%9.f", "A");
//        } else if (nilai.length <= 79) {
//            System.out.printf("%9.f", "B");
//        } else if (nilai.length <= 69) {
//            System.out.printf("%9.f","C");
//        } else if (nilai.length <= 59) {
//            System.out.printf("%9.f","D");
//        } else if (nilai.length <= 49) {
//            System.out.printf("%9.f","E");
//        }
//        return Index(nilai);
//    }

}

