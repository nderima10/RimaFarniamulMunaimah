package Chapter6_Methods.Exercise;

import Chapter6_Methods.Latihan.Listing7_PrimeNumberMethod;

public class Soal10_isPrimeMethod {
    public static void main(String[] args) {
        int numberOfPrimes = 0;
        for (int i = 1; i < 1000; i++){
            if (Listing7_PrimeNumberMethod.isPrime(i)) numberOfPrimes++;
        }
        System.out.println("The number of prime number less than 10000: " + numberOfPrimes);
    }
}
