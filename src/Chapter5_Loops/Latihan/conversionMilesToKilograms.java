package Chapter5_Loops.Latihan;

public class conversionMilesToKilograms {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAMS = 2.2;
        System.out.println("Kilogram        Pounds");

        for (int i = 1; i <= 199; i += 2) {
            System.out.printf("%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAMS));
        }
    }
}
