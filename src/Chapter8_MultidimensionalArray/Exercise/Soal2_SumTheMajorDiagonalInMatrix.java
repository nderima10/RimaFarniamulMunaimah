package Chapter8_MultidimensionalArray.Exercise;

import java.util.Scanner;

public class Soal2_SumTheMajorDiagonalInMatrix {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        System.out.println("Sum of elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int Rows = 4;
        final int Columns = 4;
        double[][] m = new double[Rows][Columns];

        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int row = 0; row < Rows; row++) {
            for (int co1 = 0; co1 < Columns; co1++) {
                m[row][co1] = input.nextDouble();
            }
        }
        return m;
    }
    public static double sumMajorDiagonal(double[][]m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
