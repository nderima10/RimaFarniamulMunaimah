package Chapter6_Methods.Exercise;

public class Soal12_DisplayCharachter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS_PER_LINE = 10;
        char ch1 ='1';
        char ch2 = 'Z';
        System.out.println("\nCharacter per 1 to Z");
        printChars (ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
        System.out.println();
    }
    public static void printChars(char ch1, char ch2, int nuumberPerline) {
        for (char c = ch1, count = 1; c <= ch2; c++, count++) {
            if (count % nuumberPerline == 0)
                System.out.println(c);
            else
                System.out.print(c + " ");
        }
    }
}
