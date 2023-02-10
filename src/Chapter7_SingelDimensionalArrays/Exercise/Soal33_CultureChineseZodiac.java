package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal33_CultureChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiak = {"monkey","rooster","dog","pig","rat","ox","tige","rabbit","dragon","snack","hourse","sheep"};
        System.out.print("masukan tahun : ");
        int tahun = input.nextInt();
        System.out.println(zodiak[tahun % 12]);
    }
}
