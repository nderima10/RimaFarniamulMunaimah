package Chapter3_Selection.Exercise;

import java.util.Scanner;

public class Soal2AreaVolume {
    public static void main(String[] args) {
        final double PI = 3.14159 ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the radius and length of a cylinder: ") ;
        double length = input.nextDouble() ;
        double radius = input.nextDouble() ;
        double area = radius * radius * PI ;
        double volume = area * length ;
        System.out.println("The area is " + area + String.format("%.2f",area)) ;
        System.out.println("The volume is " + volume + String.format("%.2f",volume)) ;
    }
}
