package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String play;
        do {
            char[] word = getWord();
            char[] asterisks = new char[word.length];
            fillAsterisks(asterisks);

            int missed =0;
            do {
                char guess = getGuess(asterisks);

                if (!isCorrectGuess(word,asterisks,guess))
                    missed++;
            } while (!isCorrectFinish(asterisks));
            print(word,missed);
            System.out.println("Do ou want to guess another word? Enter y or n>");
            play = input.next();
        } while (play.charAt(0) == 'y');
    }
    public static char[] getWord() throws FileNotFoundException{
        File file = openFile();
        ArrayList<String> words = new ArrayList<>();
        try(
                Scanner input = new Scanner(file)
                ){
            while (input.hasNext()){
                words.add(input.next());

            }
        }
        String pick = words.get((int)(Math.random() * words.size()));
        char[] word = pick.toCharArray();
        return word;
    }
    public static File openFile() throws FileNotFoundException{
        File file = new File("hangman.txt");
        if (!file.exists()){
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(1);
        }
        return file;
    }
    public static void fillAsterisks(char[] list){
        for (int i = 0; i < list.length; i++){
            list[i] = '*';
        }
    }
    public static boolean isCorrectGuess(char[] word, char[] blanks, char guess){
        boolean correct = false;
        int message = 2;
        for (int i = 0; i < word.length; i++) {
            if(word[i] == guess){
                correct = true;
                if (blanks[i] == guess)
                    message = 1;
                else {
                    blanks[i] = guess;
                    message = 0;
                }
            }
        }
        if (message > 0)
            print(message, guess);
        return correct;
    }
    public static boolean isCorrectFinish(char[] blanks){
        for (char e: blanks){
            if (e == '*') return false;
        }
        return true;
    }
    public static void print(char[] word,int missed){
        System.out.println("the word is " + word + " you missed " + missed + (missed > 1 ? " times " : " time"));
    }
    public static void print(int m, char guess){
        System.out.print("\t" + guess);
        switch (m){
            case 1 :
                System.out.println("is already in the word"); break;
            case 2 :
                System.out.println("is not in the word");
        }
    }
    public static char getGuess(char[] asterisks){
        Scanner input = new Scanner(System.in);
        System.out.print("(guess) Enter  letter in word " + asterisks + " > ");
        String g = input.next();
        return g.charAt(0);
    }
}
