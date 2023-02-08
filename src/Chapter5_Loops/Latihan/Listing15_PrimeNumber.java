package Chapter5_Loops.Latihan;

public class Listing15_PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES =50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int nomor = 2;

        System.out.println("The first 50 prime numbers are\n");

        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= nomor / 2; divisor++) {
                if (nomor % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(nomor);
                } else
                    System.out.println(nomor + " ");
            }
            nomor++;
        }
    }
}
