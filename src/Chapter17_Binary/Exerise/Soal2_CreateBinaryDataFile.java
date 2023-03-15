package Chapter17_Binary.Exerise;

import java.io.FileOutputStream;
import java.io.IOException;

public class Soal2_CreateBinaryDataFile {
    public static void main(String[] args) throws IOException {
        try (
            FileOutputStream output = new FileOutputStream("Exercise17_02.dat", true)
            ){
            for (int i = 0; i < 100; i++)
                output.write((int)(1 + Math.random() * 100));
        }
    }
}
