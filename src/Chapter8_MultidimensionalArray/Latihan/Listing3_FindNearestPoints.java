package Chapter8_MultidimensionalArray.Latihan;

import java.util.Scanner;

public class Listing3_FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah poin : ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Masukan " + numberOfPoints + " poin: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }
        int p1 = 0, p2 = 1;
        double shortestDistence = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length; i++){
            for (int j = 0; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestDistence > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistence = distance;
                }
            }
        }
        System.out.println("'Dua titik terdekat adalah " + "(" + points[p1][0] + ", " +
                points[p1][1] + ") dan (" + points[p2][0] + ", " + points[p2][1] + ")");
    }
    public static double distance ( double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
