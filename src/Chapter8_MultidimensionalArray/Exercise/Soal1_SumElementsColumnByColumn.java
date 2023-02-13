package Chapter8_MultidimensionalArray.Exercise;

import java.util.Scanner;

public class Soal1_SumElementsColumnByColumn {
    public static void main(String[] args) {
        double[][] matrix = getatrix();
        for (int co1 = 0; co1 < matrix[0].length; co1++) {
            System.out.println("Sum of yhe element at column " + co1 + " is " + sumColumn(matrix, co1));
        }
    }
    public static double[][] getatrix() {
        Scanner input = new Scanner(System.in);
        final int Rows = 3;
        final int Columns = 4;
        double[][] m = new double[Rows][Columns];
        System.out.println("Enter a " + Rows + "-by-" + Columns + "Matrix row by row: ");
        for (int row = 0; row < m.length; row++)
            for (int co1 = 0; co1 < m[row].length; co1++)
                m[row][co1] = input.nextDouble();
        return m;
    }
    public static double sumColumn (double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
