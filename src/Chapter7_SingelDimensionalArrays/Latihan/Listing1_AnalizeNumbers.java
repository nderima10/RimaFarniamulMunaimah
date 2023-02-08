package Chapter7_SingelDimensionalArrays.Latihan;

public class Listing1_AnalizeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Masukan nomor item : ");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;

        System.out.print("Masukan nomor : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count ++;

        System.out.println("Average adalah " + average);
        System.out.println("nomor of elements above the average is " + count);
    }
}
