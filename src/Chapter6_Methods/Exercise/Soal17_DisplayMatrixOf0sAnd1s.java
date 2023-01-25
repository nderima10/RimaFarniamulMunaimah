package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal17_DisplayMatrixOf0sAnd1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan n: ");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            System.out.print((int) (Math.random() * 2));
        }
        System.out.println();
    }
}
