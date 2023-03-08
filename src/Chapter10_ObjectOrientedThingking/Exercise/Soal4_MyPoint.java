package Chapter10_ObjectOrientedThingking.Exercise;

import java.util.Scanner;

public class Soal4_MyPoint {
    public static void main(String[] args) {
       Soal4b point1 =new Soal4b();
       Soal4b point2 = new Soal4b(10, 30.5);

        System.out.println("The distance between (" + point1.getX() +
                ", " + point1.getY() + ") and (" +point2.getX() +
                ", " + point1.getY() + ") is: " + point1.distance(point2));
    }
}
