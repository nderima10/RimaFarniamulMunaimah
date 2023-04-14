package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal13_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter 10 integer: ");
        for (int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.print("The distance integers are ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size();  j++){
                if (list.get(i) == list.get(j))  list.remove(j);
            }
        }
    }
}
