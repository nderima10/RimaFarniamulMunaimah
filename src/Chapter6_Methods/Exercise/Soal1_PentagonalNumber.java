package Chapter6_Methods.Exercise;

public class Soal1_PentagonalNumber {
    public static void main(String[] args) {
        final int NUMER_OF_PENTAGONAL = 100;
        final int NUMBER_PER_LINE = 10;
        System.out.println("nomor 100 pertama pentagonal, 10 per baris : ");
        for (int i = 1; i <= NUMER_OF_PENTAGONAL; i++) {
            if (i % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n", getPentagonNumber(i));
            else
                System.out.printf("%7d", getPentagonNumber(i));

        }
    }
    public static int getPentagonNumber (int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
