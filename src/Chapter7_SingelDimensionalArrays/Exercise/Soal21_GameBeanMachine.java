package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal21_GameBeanMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bola yang akan dijatuhkan : ");
        int drops = input.nextInt();

        System.out.print("Masukkan jumlah slot di mesin kacang : ");
        int nails = input.nextInt();

        String[] paths = new String[nails * drops];
        int[] balls = new int[nails];

        int numberOfRs = 0;
        for (int i = 0; i < paths.length; i++) {
            paths[i] = getrandomPath();

            if (paths[i].equals("R")) {
                numberOfRs++;
            }
            if ((i +  1) % nails == 0) {
                balls[numberOfRs]++;
                numberOfRs = 0;
            }
        }
        print(paths, nails);
        print(balls);
    }
    public static String getrandomPath(){
        if ((int)(Math.random() * 2) == 0)
            return "L";
        else
            return "R";
    }
    public static void print(String[] list, int n) {
        System.out.println();
        for (int i = 0; i < list.length; i++)
            System.out.print(((i + 1) % n == 0) ? list[i] + "\n" : list[i]);
    }
    public static void print(int[] list) {
        int max = max(list);

        while (max > 0) {
            System.out.println();
            for (int j : list) {
                if (j >= max) {
                    System.out.print("O");
                } else
                    System.out.print("");
            }
            max--;
        }
        System.out.println();
    }
    public static int max(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}
