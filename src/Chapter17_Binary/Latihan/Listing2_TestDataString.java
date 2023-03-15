package Chapter17_Binary.Latihan;

import java.io.*;

public class Listing2_TestDataString {
    public static void main(String[] args) throws IOException {
        try(
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream("temp.dat"))
                ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Susan");
            output.writeDouble(185.5);
            output.writeUTF("kim");
            output.writeDouble(105.25);
        }
        try(

                DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))
                ){
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
