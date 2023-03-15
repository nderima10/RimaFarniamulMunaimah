package Chapter17_Binary.Exerise;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Soal1_CreateTextFile {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<String> list = new ArrayList<>();

        File file =new File("Exercise17_01.txt");
        if (file.exists()) {
            try (
                Scanner input = new Scanner(file)
            ) {
                while (input.hasNext()) {
                    list.add(input.nextLine());
                }
            }
        }
        for (int
         i = 0; i  < 100; i++) {
            list.add(((int)(Math.random() * 100)) + " ");
        }
        try (
            PrintWriter output = new PrintWriter(file)
        ) {
            for (String i: list) {
                output.print(i);
            }
        }
    }
}
