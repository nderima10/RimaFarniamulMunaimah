package Chapter5_Loops.Exercise;

import java.util.Scanner;

public class countPositiveNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;
        System.out.print("Enter an integer, the input enda if it is : ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("no numbeers are entered except 0");

            System .exit(1);
        }
        while (number != 0) {
            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count ++;
            number = input.nextInt();
        }
        double average = total / count;
        System.out.println("The number of positif is " + positives);
        System.out.println("The number of negatif is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
