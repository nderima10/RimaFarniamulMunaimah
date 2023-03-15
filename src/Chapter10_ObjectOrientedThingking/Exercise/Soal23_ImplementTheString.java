package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal23_ImplementTheString {
    public static void main(String[] args) {
        Soal23b str1 = new Soal23b ("test1");
        Soal23b str2 = new Soal23b("abcdefghijklm");

        System.out.println("\ncompare str1 to \"test1\":");
        System.out.println(str1.compare("test1"));

        System.out.println("\ndisplay a substring id str2 begining at index 5: ");
        print(str2.substring(5));

        System.out.println("\nConvert str2 to upper case: ");
        print(str2.toUpperCase());

        System.out.println("\nDisplay the boolean value true as a myString2 object: ");
        print(Soal23b.valueOf(true));
    }
    public static void print(Soal23b str){
        print(str.toChars());
    }
    public static void print(char[] chars){
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
