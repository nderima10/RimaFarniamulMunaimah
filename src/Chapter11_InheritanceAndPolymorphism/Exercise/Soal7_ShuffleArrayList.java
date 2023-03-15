package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal7_ShuffleArrayList {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a list of integers ending with 0: ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }
        shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
