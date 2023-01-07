package Chapter3.Latihan;

import java.util.Scanner;

public class Soal6Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ") ;
        int number = input.nextInt() ;
        int leesthan10 = number % 10 ;
        number /= 10 ;
        int tens = number % 10 ;
        number /= 10 ;
        int hundreds = number % 10 ;
        number /= 10 ;
        int sum = hundreds + tens + leesthan10 ;
        System.out.println("The sum of the digits is " + sum) ;
    }
}
