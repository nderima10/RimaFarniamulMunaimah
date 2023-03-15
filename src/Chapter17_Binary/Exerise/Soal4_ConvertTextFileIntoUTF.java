package Chapter17_Binary.Exerise;

import java.io.*;
import java.util.Scanner;

public class Soal4_ConvertTextFileIntoUTF {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise17_04 SourceFile TargetFile");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file " + args[0] + " does not exist.");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(file);
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream(args[1]));
                ) {
            while (input.hasNext())
                output.writeUTF(input.nextLine());
        }
    }
}
