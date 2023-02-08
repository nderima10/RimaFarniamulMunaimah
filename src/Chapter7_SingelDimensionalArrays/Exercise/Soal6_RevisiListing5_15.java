package Chapter7_SingelDimensionalArrays.Exercise;

public class Soal6_RevisiListing5_15 {
    static final int NUMBER_OF_PRIMES = 50;
    public static void main(String[] args) {
        int[] primeNomor = new int[NUMBER_OF_PRIMES];
        int index = 0;

        for (int i = 2; index < NUMBER_OF_PRIMES; i++) {
            if (isPrime(i)) {
                primeNomor[index++] = i;
            }
        }
        printArray(primeNomor, 10);
    }
    public static boolean isPrime(int nomor) {
        for (int i = 2; i <= Math.sqrt(nomor); i++) {
            if (nomor % i == 0)
                return false;
        }
        return true;
    }
    public static void printArray (int[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10d ", array[i]);
            if ((i + 1) % numberPerLine == 0)
                System.out.println(" ");
        }
    }
}
