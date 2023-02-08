package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal3_CountOccurentOfNumbers {
    static int SIZE = 100;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai antara 1 dan 100 : ");
        int[][] nilai = new int[2][SIZE];
        for (int i = 0; i < SIZE; i++) {
            int no = input.nextInt();
            if (no >= 100 || no <= 0)
                break;
            nilai[0][i] = no;
            nilai[1][no] = nilai[1][no] + 1;
        }
        for (int i = 0; i < nilai[1].length; i++) {
            if (nilai[1][i] == 0)
                continue;
            if (nilai[1][i] > 1)
                System.out.println(i + " jadi " + nilai[1][i] + " waktu. ");
            else
                System.out.println(i + " jadi " + nilai[1][i] + " waktu");
        }
    }
}
