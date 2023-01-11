package Chapter5.Latihan;

import java.util.Scanner;

public class lottery5_32 {
    public static void main(String[] args) {
        int lotteryDigit1, lotteryDigit2;
        lotteryDigit1 = (int)(Math.random() * 10);

        do {
            lotteryDigit2 = (int)(Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan pilihan lottre anda (dua digit berbeda): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println(
                "nomor lottrenya adalah " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 &&
                guessDigit2 == lotteryDigit2)
            System.out.println("Persis sama: Anda memenangkan $10.000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Cocokkan satu digit: Anda memenangkan $1.000");
        else
            System.out.println("Maaf, tidak ada yang cocok");
    }
}
