package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal3_MyInteger {
    public static void main(String[] args) {
        int[] values = {5,6,7,8,9};

        System.out.println("\nUji apakah nilainya genap menggunakan isEvent(int): ");
        for (int k : values) {
            System.out.println(k + " " + Soal3b.isEven(k));
        }
        System.out.println("\nUji apakah nilainya ganjil menggunakan isOdd(int): ");
        for (int j : values) {
            System.out.println(j + " " + Soal3b.isOdd(j));
        }
        System.out.println("\nUji apakah nilainya prima menggunakan isPrime(int): ");
        for (int k : values) {
            System.out.println(k + " " + Soal3b.isPrime(k));
        }


        System.out.println("\nUji apakah nilainya genap menggunakan isEven(): ");
        for (int j : values) {
            Soal3b value = new Soal3b(j);
            System.out.println(value.getValue() + " " + value.isEven());
        }
        System.out.println("\nUji apakah nilainya ganjil menggunakan isOdd(): ");
        for (int j : values) {
            Soal3b value = new Soal3b(j);
            System.out.println(value.getValue() + " " + value.isOdd());
        }
        System.out.println("\nUji apakah nilainya prima menggunakan isPrime(): ");
        for (int j : values) {
            Soal3b value = new Soal3b(j);
            System.out.println(value.getValue() + " " + value.isPrime());
        }


        System.out.println("\nUji apakah nilainya genap menggunakan isEven(MyInteger): ");
        for (int j : values) {
            Soal3b value = new Soal3b(j);
            System.out.println(value.getValue() + " " + value.isEven());
        }
        System.out.println("\nUji apakah nilainya ganjil menggunakan isOdd(MyInteger): ");
        for (int j : values) {
            Soal3b value = new Soal3b(j);
            System.out.println(value.getValue() + " " + value.isOdd());
        }
        System.out.println("\nUji apakah nilainya prima menggunakan isPrime(MyInteger): ");
        for (int j : values) {
            Soal3b value = new Soal3b(j);
            System.out.println(value.getValue() + " " + value.isPrime());
        }


        int[] values2 = {5,9,7};
        Soal3b value = new Soal3b(9);
        System.out.println("\nUji apakah " + value.getValue() + " sama dengan nilai yang ditentukan: ");
        for (int j : values2) {
            System.out.println(j + " " + value.equals(j));
        }
        System.out.println("\nUji apakah " + value.getValue() + " sama dengan nilai yang ditentukan: ");
        for (int j : values2) {
            Soal3b myInteger = new Soal3b(j);
            System.out.println(j + " " + value.equals(myInteger));
        }
        System.out.println("\ntest parseInt(char[]) and parseInt(String): ");
        char[] numericCharacters = {'3', '4', '2'};

        String numericString = "658" ;
        System.out.println(" ");
        for (char numericCharacter : numericCharacters) {
            System.out.print(numericCharacter + "");
        }
        System.out.println(" + " + numericString + " = "  + (Soal3b.parseInt(numericCharacters) + Soal3b.parseInt(numericString)));
    }
}
