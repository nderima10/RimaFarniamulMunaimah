package Chapter10_ObjectOrientedThingking.Exercise;

import java.util.Scanner;

public class Soal5_DisplayThePrimeFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan bilangan bulat positif: ");
        int  number = input.nextInt();

        System.out.print("Faktor kecil dari " + number + " adalah: ");
        Soal5b stack = new Soal5b();

        smallestFactors(number, stack);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
    public static void smallestFactors(int number, Soal5b stack) {
        int i = 2;
        while (number / i != 1) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            }
            else
                i++;
        }
        stack.push(number);
    }
}
