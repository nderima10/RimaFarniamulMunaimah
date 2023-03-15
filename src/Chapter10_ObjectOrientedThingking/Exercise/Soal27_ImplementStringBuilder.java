package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal27_ImplementStringBuilder {
    public static void main(String[] args) {
        Soal27b str1 = new Soal27b ("TEST");
        System.out.println("\nAppend the  string \" Soal27b1\" to String: " + str1.append(new Soal27b("Soal27b")));
        System.out.println("\nAppend integer 101 tio the string: " + str1.append(101));
        System.out.println("\nLength of string: " + str1.length());
        System.out.println("\nCharacter at index 2: " + str1.chatAt(2));
        System.out.println("\nString toLower case: " + str1.toLowerCase());
        System.out.println("\nSubstring  of string from index 1 to 3:" + str1.substring(1, 3));
        System.out.println("\nDisplay string: " + str1.toString());
    }
}
