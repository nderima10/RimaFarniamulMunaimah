package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class soal26_StrictlyIdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan List1: ");
        int[] lis1 = new int[input.nextInt()];
        for (int i = 0; i < lis1.length; i++)
            lis1[i] = input.nextInt();

        System.out.println("Masukan llist2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        System.out.println("Two list are " + (equals(lis1, list2) ? " " : " not ") + "strictly identical");

    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
