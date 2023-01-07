package Chapter5.Exerrcise;

import java.util.Scanner;

public class Listing6 {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter an integer (the input ends if it is 0) : ");
            data = input.nextInt();

            sum += data;
        }
        while (data != 0);
        System.out.println("Enter sum is " + sum);
    }
}
