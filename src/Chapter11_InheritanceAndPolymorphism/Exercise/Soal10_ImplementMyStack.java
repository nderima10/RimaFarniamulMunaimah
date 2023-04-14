package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.Scanner;

public class Soal10_ImplementMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Soal10b stack  = new Soal10b();
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++){
            stack.push(input.next());
        }
        System.out.println("Stack: " + stack.toString());
    }
}
