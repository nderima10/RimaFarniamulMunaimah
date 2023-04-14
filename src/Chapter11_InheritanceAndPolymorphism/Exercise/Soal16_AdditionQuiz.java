package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal16_AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<Integer>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer =  input.nextInt();

        while (number1 + number2 != answer){
            if(answers.contains(answer))
                System.out.println("you already entered " + answer);
            else {
                System.out.print("Wrong answer. try again. what  is " +
                        number1 + " + " + number2 + " ? ");
                answers.add(answer);
            }
            answer = input.nextInt();
        }
        System.out.println("you go it! ");
    }
}
