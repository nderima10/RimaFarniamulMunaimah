package Chapter5_Loops.Latihan;

import java.util.Scanner;

public class MenampilkanPiramida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukan jumlah baris : ");
        int numberOfLines = input.nextInt();


        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}

