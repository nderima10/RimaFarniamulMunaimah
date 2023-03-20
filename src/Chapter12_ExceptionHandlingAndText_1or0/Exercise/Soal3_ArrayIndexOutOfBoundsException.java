package Chapter12_ExceptionHandlingAndText_1or0.Exercise;

import java.util.Scanner;

public class Soal3_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray();
        System.out.print("Masukkan indeks array: ");
        try {
            System.out.println("Nilai elemen yang sesuai adalah:" + array[input.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Di luar batas!");
        }
    }
    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
}
