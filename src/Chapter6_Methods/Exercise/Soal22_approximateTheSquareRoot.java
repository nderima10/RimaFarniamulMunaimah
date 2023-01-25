package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal22_approximateTheSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nomor: ");
        long nomor = input.nextLong();
        System.out.println("Perkiraan akar kuadrat dari " + nomor + " adalah: " + sqrt(nomor));
    }
    public static double sqrt(long n){
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;
        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) /2;
    }
}
