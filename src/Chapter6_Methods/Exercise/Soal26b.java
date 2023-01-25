package Chapter6_Methods.Exercise;

public class Soal26b {
    public static void main(String[] args) {
        final int NUMBER_OF_PALINROMIC_PRIMES = 100;
        final int NUMBER_PER_LINE = 10;

        int count = 0;
        int n = 2;
        while (count < NUMBER_OF_PALINROMIC_PRIMES){
            if (isPalindromicPrime(n)) {
                count++;
                System.out.print(count % NUMBER_OF_PALINROMIC_PRIMES == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }
    public static boolean isPalindromicPrime(int num) {
        return Soal26c_PrimeNumberMethod.isPrime(num) && Soal3_palindromeInteger.isPalindrome(num);
    }
}
