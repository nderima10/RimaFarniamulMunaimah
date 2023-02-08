package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal4_AnalizeScores {
    static final int MAX = 100;

    public static void main(String[] args) {
        int[] score = new int [MAX];
        int nomorSkor = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        for (int i = 0; i < MAX; i++) {
            int no = input.nextInt();
            if (no < 0) break;
            score[i] = no;
            nomorSkor++;
        }
        score[nomorSkor] = -1;
        int averagae = getAverage(score, nomorSkor);
        int aboveAETA = scoreAboveAndEqualToAverage(score, averagae);

        System.out.println("Jumlah skor : " + nomorSkor);
        System.out.println("Skor Rata-Ratanya Adalah : " + averagae);
        System.out.println("Skor di atas rata-rata = " + aboveAETA);
        System.out.println("Skor di bawah rata-rata = " + (nomorSkor - aboveAETA));
    }
    public static int getAverage(int[] scores, int nomorSkor) {
        int total = 0;
        for (int i = 0; scores[i] >= 0; i++) {
            total+= scores[i];
        }
        return total / nomorSkor;
    }
    public static int scoreAboveAndEqualToAverage(int[] scores, int average){
        int count = 0;
        for (int i = 0; scores[i] >= 0; i++) {
            if (scores[i] >= average) count++;
        }
        return count;
    }
}
