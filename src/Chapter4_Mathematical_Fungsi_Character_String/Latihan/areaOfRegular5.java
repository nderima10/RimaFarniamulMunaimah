package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

import java.util.Scanner;

public class areaOfRegular5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides : " );
        double number = input.nextDouble();
        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double area = (number * Math.pow(side, 2) / (4 * Math.tan(Math.PI / number)));

        System.out.println("The area of hexagon is " + area);


    }
}
