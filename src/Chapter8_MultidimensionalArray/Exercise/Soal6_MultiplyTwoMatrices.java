package Chapter8_MultidimensionalArray.Exercise;

import java.util.Scanner;

public class Soal6_MultiplyTwoMatrices {
    public static void main(String[] args) {
        double[][] matrix1 = getMatrix(1);
        double[][] matrix2 = getMatrix(2);
        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);
        print(matrix1, matrix2, matrix3);
    }
    public static double[][] getMatrix(int n) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix " + n + " : ");
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();
            }
            return m;
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c =new double[3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int h = 0; h < c.length; h++) {
                    c[i][j] += a[i][h] * b[i][j];
                }
            }
        }
        return c;
    }
    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.printf("%5.1f", m[r][j]);
        }
    }
    public static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrix are added as follows");
        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? " * " : "  "));
            print(m2, i);
            System.out.print((i == 1 ? " * " : "  "));
            print(m3, i);
            System.out.println();
        }
    }
}
