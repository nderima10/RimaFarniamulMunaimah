package Chapter17_Binary.Latihan;

import java.io.FileOutputStream;
import java.io.IOException;

public class Listing1_TestFileStream {
    public static void main(String[] args) throws IOException {
        try (
            FileOutputStream output = new FileOutputStream("temp.dat")
        ) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }
        try (
                FileOutputStream input = new FileOutputStream("temp.dat")
                ) {
            int value;
//            while ((value = input.read()) != -1)
//                System.out.print(value + " ");
        }
    }
}
