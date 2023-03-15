package Chapter17_Binary.Latihan;

import java.io.*;

public class Listing7_TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] number = {1,2,3,4,5};
        String [] strings = {"John","Susan","kim"};
        try(
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true))
                ){
            output.writeObject(number);
            output.writeObject(strings);
        }
        try(
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"))
                ) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newString = (String[]) (input.readObject());

            for (int i = 0; i < newNumbers.length; i++)
                System.out.print(newNumbers[i] + " ");
            System.out.println();

            for (int i = 0; i < newString.length; i++)
                System.out.print(newString[i] + " ");
        }
    }
}
