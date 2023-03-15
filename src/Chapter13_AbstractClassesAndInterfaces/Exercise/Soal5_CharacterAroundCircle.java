package Chapter13_AbstractClassesAndInterfaces.Exercise;

public class Soal5_CharacterAroundCircle {
    public static void main(String[] args) {
        Soal5b_Circle circle1 = new Soal5b_Circle(15, "red", true);
        Soal5b_Circle circle2 = new Soal5b_Circle(10, "blue", true);
        System.out.println("\nCircle 1: ");
        print(circle1);
        System.out.println("\nCircle 2: ");
        print(circle2);

        print("\nThe larger of the two circles was ");
        print(new Soal5b_Circle());

        Soal5b_Rectangle rectangle1 = new Soal5b_Rectangle(4,5, "Green", true);
        Soal5b_Rectangle rectangle2 = new Soal5b_Rectangle(4.2,5, "orange", true);

        System.out.println("\nRectangle 1: ");
        print(circle1);
        System.out.println("\nrectangle 2: ");
        print(circle2);

        print("\nthe large of the two rectangle was ");
        print(new Soal5b_Rectangle());
    }

    private static void print(Soal5b_Rectangle soal5bRectangle) {
    }

    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(Soal5b_GeometricObject o) {
        System.out.println(o);
    }
}
