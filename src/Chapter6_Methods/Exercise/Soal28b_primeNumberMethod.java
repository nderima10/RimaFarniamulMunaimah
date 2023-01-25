package Chapter6_Methods.Exercise;

public class Soal28b_primeNumberMethod {
    public static void main(String[] args) {
        System.out.println("the first 50 prppime number are \n");
        printPrimeNumbeers(50);
    }

    public static void printPrimeNumbeers(int numberOfPrime) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int nummber = 2;
        while (count < numberOfPrime) {
            if (isPrime(nummber)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", numberOfPrime);
                } else
                    System.out.printf("%-5s", numberOfPrime);
            }
            nummber++;
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
