package Chapter6_Methods.Exercise;

public class Soal29b {
    public static void main(String[] args) {
        System.out.println("the firts 50 prime number are \n");
        System.out.println("--------------------------------");
        printPrimeNumber(50);
    }
    public static void printPrimeNumber(int numberOfPrimes) {
        final int NUMBE_OF_PRIME_PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBE_OF_PRIME_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }
    public static boolean  isPrime (int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
