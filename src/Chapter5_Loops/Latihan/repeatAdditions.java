package Chapter5_Loops.Latihan;

import java.util.Scanner;

public class repeatAdditions {
    public static void main(String[] args) {
        final  int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = 1 + (int)(Math.random() * 15);
            int number2 = 1 + (int)(Math.random() * 15);

            System.out.print("Berapa " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("Kamu benar! ");
                correctCount++;
            }
            else
                System.out.println("jabawaban kamu salah " + (number1 + " + " + number2));
            count++;
            output += "\n" + number1 + " + " + number2 + "=" + answer + ((number1 + number2 == answer) ? "Benar": "Salah");
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("Hasil yang Benar adalah " + correctCount + "\nwaktu tes adalah " + testTime / 100 + "seconds\n" + output);


        }
    }
}