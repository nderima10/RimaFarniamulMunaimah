package Chapter5_Loops.Exercise;

import java.util.Scanner;

public class prossesString5_48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String oddPositions = "";

        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }
        System.out.println(oddPositions);
    }
}
