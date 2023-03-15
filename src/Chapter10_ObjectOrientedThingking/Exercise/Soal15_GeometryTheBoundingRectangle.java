package Chapter10_ObjectOrientedThingking.Exercise;

import java.util.Scanner;

public class Soal15_GeometryTheBoundingRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points =  new double[5][2];
        System.out.print("\nEnter five points: ");
        for (int i = 0; i < points.length; i++){
            for (int j = 0; j < points[i].length; j++){
                points[i][j] = input.nextDouble();
            }
        }
        Soal15b r1 = Soal15b.getRectangle(points);
        System.out.println("The bounding rectangle's center (" + r1.getX() + ", " +r1.getY() + ")," +
                "width " + r1.getWidth() + ", height " + r1.getHeight());
    }
}
