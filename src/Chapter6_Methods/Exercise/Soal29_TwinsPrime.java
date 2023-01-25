package Chapter6_Methods.Exercise;

public class Soal29_TwinsPrime {
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (istwinPrime(p))
                System.out.println("(" + p + " , " + (2 + 2) + ")");
        }
    }
    public static boolean istwinPrime(int num) {
        return Soal29b.isPrime(num) && Soal29b.isPrime(num + 2);
    }
}
