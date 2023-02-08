package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Arrays;

public class Soal7_CountSingleDigits {
    static final int SIZE = 100;
    static final int RANGE = 10;
    public static void main(String[] args) {
        int[] randomNomor = new int[SIZE];
        int[] occurence = new int[RANGE];

        for (int i = 0; i < randomNomor.length; i++){
            int num = (int) (Math.random() * RANGE);
            randomNomor[i] = num;
            occurence[num]++;
        }
        for (int i = 0; i < randomNomor.length; i++){
            System.out.print(randomNomor[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println(" ");
        }
        System.out.println("========================");
        for (int i = 0; i < occurence.length; i++){
            System.out.println("Occurences for " + i + " = " + Arrays.toString(occurence));
        }
    }
}
