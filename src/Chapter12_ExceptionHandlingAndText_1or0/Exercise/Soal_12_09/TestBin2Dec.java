package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_09;

import Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_07.Soal12_07;

import java.util.Scanner;

public class TestBin2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary: ");
        try {
            System.out.println(Soal12_07.bin2Dec(input.nextLine()));
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
