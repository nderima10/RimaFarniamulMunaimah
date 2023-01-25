package Chapter6_Methods.Exercise;

public class Soal9_ConversiBetweenFeetAndMeters {
    public static void main(String[] args) {
        System.out.println(
                "\nFeet     Meters  |   Meters  feet\n" +
                "------------------------------------");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            System.out.printf("%4.1f    ", feet);
            System.out.printf("%6.3f", footToMeters(feet));
            System.out.print("   |   ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", metersToFoot(meters));
        }
    }
    public static double footToMeters (double foot) {
        return 0.305 * foot;
    }
    public static double metersToFoot (double meters){
        return 3.279 * meters;
    }
}
