package Chapter5_Loops.Exercise;

public class combination5_43 {
    public static void main(String[] args) {
        int count = 0;

        for (int number1 = 1; number1 < 7; number1++) {
            for (int number2 = number1 + 1; number2 <= 7; number2++) {
                System.out.println(number1 + " " + number1);
                count++;
            }
        }
        System.out.println("Total semua nomor kombinasi adalah " + count);
    }
}
