package Chapter13_AbstractClassesAndInterfaces.Exercise;

public class Soal6_ComparableCircle {
    public static void main(String[] args) {
        Soal6b_ComparableCircle comparableCircle1 = new Soal6b_ComparableCircle(12.5);
        Soal6b_ComparableCircle comparableCircle2 = new Soal6b_ComparableCircle(18.3);

        System.out.println("\nComparable Circle1: ");
        System.out.println(comparableCircle1);
        System.out.println("\nComparable Circle2: ");
        System.out.println(comparableCircle2);

        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1
        ? "\nComparable Circle1 " : "\nComparable Circle2 ") + "Is the large of the two Circles");
    }
}
