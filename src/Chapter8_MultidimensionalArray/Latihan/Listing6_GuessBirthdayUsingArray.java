package Chapter8_MultidimensionalArray.Latihan;

import java.util.Scanner;

public class Listing6_GuessBirthdayUsingArray {
    public static void main(String[] args) {
        int day = 0;
        int answer;

        int[][][] dates = {
                {{ 1, 3, 5, 7},
                 { 9, 11, 13, 15},
                 {17, 19, 21, 23},
                 {25, 27, 29, 31}},
                {{  2,  3,  6, 7},
                 {10, 11, 14, 15},
                 {18, 19, 22, 23},
                 {26, 27, 30, 31}},
                {{  4,  5,  6, 7},
                 {12, 13, 14, 15},
                 {20, 21, 22, 23},
                 {28, 29, 30, 31}},
                {{  8, 9, 10, 11},
                 {12, 13, 14, 15},
                 {24, 25, 26, 27},
                 {28, 29, 30, 31}},
                {{16, 17, 18, 19},
                 {20, 21, 22, 23},
                 {24, 25, 26, 27},
                 {28, 29, 30, 31}}};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Apakah ulang tahunmu sudah diatur" + (i + 1) + "?");
            for (int k = 0; k < 4; k++)
                for (int j = 0 ; j < 4; j++) {
                System.out.printf("%4d", dates[i][j][k]);
                System.out.println();
            }
            System.out.print("\n masukkan 0 untuk Tidak dan 1 untuk ya : ");
            answer = input.nextInt();
            if (answer == 1)
                day += dates[i][0][0];
        }
        System.out.println(" ulang tahunmu " + day);
    }
}
