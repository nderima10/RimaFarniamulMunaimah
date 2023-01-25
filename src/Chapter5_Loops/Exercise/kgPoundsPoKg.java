package Chapter5_Loops.Exercise;

public class kgPoundsPoKg {
    public static void main(String[] args) {


        final double POUND_PERKILOGRAM = 2.2;
        System.out.println("Kilograms       Poounds     |       Pounds      Kilograms");
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf("%-12d%7.1f", k, (k * POUND_PERKILOGRAM));
            System.out.print("      |       " );
            System.out.printf("%-9d%12.2f\n", p, (p * POUND_PERKILOGRAM));
        }
    }
}
