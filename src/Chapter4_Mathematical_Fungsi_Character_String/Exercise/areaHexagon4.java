package Chapter4_Mathematical_Fungsi_Character_String.Exercise;

import java.util.Scanner;

public class areaHexagon4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The are of the hexagon is %4.2f\n", area);
    }
}
