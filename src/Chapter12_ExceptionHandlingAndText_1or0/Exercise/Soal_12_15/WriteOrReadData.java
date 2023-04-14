package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WriteOrReadData {
    public static void main(String[] args) throws Exception{

        File file = new File("Exercise_12_15.txt");
        if (file.exists()){
            System.out.println("File already exits");
            System.exit(0);
        }
        try (
                PrintWriter output = new PrintWriter(file)
                ){
            for (int i = 0; i < 100; i++){
                output.print(((int)(Math.random() *  500) + 1));
                output.print("");
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        try(
                Scanner input = new Scanner(file)
                ){
            while (input.hasNext()){
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        System.out.print(list.toString());
        System.out.println();
    }
}
