package Chapter6_Methods.Exercise;

public class Soal27b {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;
        int count = 0;
        int n = 2;
        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }
    public static boolean isEmirp(int num) {
        return Soal27c_PrimeNumberMethod.isPrime(num) &&
                !Soal3_palindromeInteger.isPalindrome(num) &&
                Soal27c_PrimeNumberMethod.isPrime(Soal3_palindromeInteger.revers(num));
    }
}
