package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

import java.util.Scanner;

public class compareCity {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the firt city : ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city : ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);
    }
}
