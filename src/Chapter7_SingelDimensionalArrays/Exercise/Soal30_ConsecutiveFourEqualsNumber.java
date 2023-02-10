package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal30_ConsecutiveFourEqualsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of value : ");
        int[] numbers = new int[input.nextInt()];
        System.out.print("Enter the valllues : ");
        for (int i = 0; i < numbers.length;i++)
            numbers[i] = input.nextInt();
        System.out.println("The list has "+ (isConsecutiveFour(numbers) ? " " : " no") + "consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] value) {
        int count = 1;
        for (int i = 0; i < value.length - 1; i++) {
            if (value[i] == value[i + 1])
                count++;
            if (count >= 4)
                return true;
            if (value[i] != value[i + 1])
                count = 1;
        }
        return false;
    }
}
