package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RremoveJavaSourceCode {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise_12_12 file");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("File " + args[0] + " dodes not exist");
        }
        ArrayList<String> list = new ArrayList<>();
        String string1 = "";
        String string2 = "";

        try (
                Scanner input = new Scanner(System.in)
                ){
            string1 = input.nextLine();
            while (input.hasNext()){
                string2 = input.nextLine();
                if (string2.length() > 0 && string2.charAt(string2.length() - 1) == '{') {
                    list.add(string1.concat(" {"));
                    string1 = input.nextLine();
                }
                else {
                    list.add(string1);
                    string1 = input.nextLine();
                }
            }
            list.add(string1);
        }
        try (
                PrintWriter output = new PrintWriter(file)
                ){
            for (int i = 0; i < list.size(); i++){
                output.println(list.get(i));
            }
        }
    }
}
