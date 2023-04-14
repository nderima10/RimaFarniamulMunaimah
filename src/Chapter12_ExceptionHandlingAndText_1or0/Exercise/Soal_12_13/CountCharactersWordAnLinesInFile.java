package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_13;

import java.io.File;
import java.util.Scanner;

public class CountCharactersWordAnLinesInFile {
    public static void main(String[] args) throws Exception{
        if (args.length != 1){
            System.out.println("Usage: java filename");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }
        int character = 0;
        int word = 0;
        int lines = 0;

        try (
                Scanner input = new Scanner(System.in)
                ){
            while (input.hasNext()){
                lines++;
                String line = input.nextLine();
                character += line.length();
            }
        }
        try (
                Scanner input = new Scanner(file)
                ){
                    while (input.hasNext()){
                        String line = input.next();
                        word++;
                    }
        }
        System.out.println("File " + file.getName() + " has");
        System.out.println(character + " character");
        System.out.println(word + " words");
        System.out.println(lines + " lines");
    }
}
