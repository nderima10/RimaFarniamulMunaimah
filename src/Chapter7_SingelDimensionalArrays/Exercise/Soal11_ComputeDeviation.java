package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal11_ComputeDeviation {
    static final int SIZE =  10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[SIZE];
        System.out.print("Masukan " + SIZE + " number : ");
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextDouble();
        System.out.println("The mean is : " + mean(number));
        System.out.println("The standart deviation is : " + deviation(number));
    }
    public static double deviation (double[] x) {
        double mean = mean (x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++){
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length));
    }
    public static double mean (double[] x) {
        double total = 0;
        for (int i  = 0; i < x.length; i++) {
            total += x[i];
        }
        System.out.println(total);
        return total / x.length;
    }
}
