package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal1_AssignGrades {
    static final int PERMULAAN = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nomor Siswa : ");
        int nomorSiswa = input.nextInt();
        System.out.print("Masukan " + nomorSiswa + " Score : ");

        int[][] siswa = new int[3][nomorSiswa + PERMULAAN];

        for (int i = 0; i < nomorSiswa; i++) {
            siswa[0][i] = input.nextInt();
        }
        int skorTerbaik = getBestScore(siswa);
        mengaturRentangKelas(siswa,skorTerbaik);

        for (int i = 0; i < siswa[0].length - PERMULAAN; i++) {
            char grade = getStudentGrade(siswa, i);
            System.out.println("Siswa " + i + " skornya adalah " + siswa[0][i] + " dan nilainya adalah " + grade );
        }
    }
    public static int getBestScore(int [][] siswa) {
        int skorTerbaik =siswa[0][0];
        for (int i : siswa[0]) {
            if (i > skorTerbaik){
                skorTerbaik = i;
            }
        }
        return skorTerbaik;
    }
    public static void mengaturRentangKelas (int[][] siswa, int skorTerbaik) {
        for (int i = 0; i < 4; i++) {
            siswa[1][i] = skorTerbaik - (10 * (i + 1));
            siswa[2][i] = ('A' + i);
        }
    }
    public static char getStudentGrade (int[][] siswa, int index) {
        int nilai = siswa[0][index];
        for (int i = 0; i < 4; i++) {
            if (nilai >= siswa[1][i]) {
                return (char)siswa[2][i];
            }
        }
        return 'F';
    }
}
