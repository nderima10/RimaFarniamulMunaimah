package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProsesScoreInTextFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file of scores: ");
        File file = new File(input.nextLine());

        if (!file.exists()){
            System.out.println("File " + file + " does not exist");
            System.exit(1);
        }
        int count = 0;
        double total = 0;
        try(
                Scanner inputFile = new Scanner(file)
                ){
            while (inputFile.hasNext()){
                total += inputFile.nextInt();
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File " + file.getName());
        System.out.println("Total scores: " + total);
        System.out.println("Average scores: " + (total / count));
    }
}
