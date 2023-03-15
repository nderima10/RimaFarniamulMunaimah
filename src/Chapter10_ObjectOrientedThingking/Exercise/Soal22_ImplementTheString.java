package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal22_ImplementTheString {
    public static void main(String[] args) {
        char[] test = {'T','e','S','t'};
        char[] test2 = {'T','e','S','t', '2'};

        Soal22b str = new Soal22b(test);
        Soal22b str2 = new Soal22b(test2);

        System.out.println("\nCharacter at index 1 of MyString1 Object 1: " + str.charAt(1));
        System.out.println("\nLength  of my  string object 1: " + str.length());
        System.out.println("\nSubstring from index 2 to 4 of my string object 1: ");
        Soal22b substr = str.substring(2,4);
        for (int i = 0; i < substr.length(); i++){
            System.out.print(substr.charAt(i));
        }
        System.out.println();
        System.out.println("\nMyString object 1 to lowercase: ");
        Soal22b lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++){
            System.out.print(lower.charAt(i));
        }
        System.out.println();
        System.out.println("\nMyString object 1 is equal to myString object 2? " + str.equals(str2));
        System.out.println("\nDisplay the integer  145 is equal to myString object 2? ");
        Soal22b value = str.valueOf(145);
        for (int i = 0; i < value.length(); i++){
            System.out.print(value.charAt(i));
        }
        System.out.println();
    }
}
