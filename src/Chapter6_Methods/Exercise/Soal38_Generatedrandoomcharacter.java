package Chapter6_Methods.Exercise;

public class Soal38_Generatedrandoomcharacter {
        public static void main(String[] args) {
            final int NUMNBER_OF_UPPERCASE_LETTERS = 100;
            final int NUMNBER_OF_SINGLE_DIGITS = 100;
            final int NUMBERS_PER_LINE = 10;
            for (int i = 1; i <= NUMNBER_OF_UPPERCASE_LETTERS; i++) {
                System.out.print(Soal38b_RandonCharacter.getRandomUpperCaseLetter());
                System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
            }
            for (int i = 1; i <= NUMNBER_OF_SINGLE_DIGITS; i++) {
                System.out.print(Soal38b_RandonCharacter.getRandomDigitCharacter());
                System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
            }
        }
    }

