package Chapter6_Methods.Ujian;

public class  Ujian6_1 {
    public static void main(String[] args) {
        System.out.println(
                """

                        Inch     Meters      |      Meters      Inch
                        ------------------------------------------------""");
        for (double inch = 1.0, meters = 1.0; inch <= 100.0; inch++, meters += 1) {
            System.out.printf("%4.1f    ", inch);
            System.out.printf("%7.4f", inchToMeters(inch));
            System.out.print("      |     ");
            System.out.printf("%4.1f     ", meters);
            System.out.printf("%10.4f\n", metersToInch(meters));
        }
    }
    public static double inchToMeters (double inch) {return 0.0254 * inch;}
    public static double metersToInch (double meter) {return 39.3701 * meter;}
}
