package Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing13_Rational {
    private long numerator = 0;
    private long denominator = 1;

    public Listing13_Rational() {
        this(0, 1);
    }
    public Listing13_Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        return gcd;
    }
    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }
    public Listing13_Rational add(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
        denominator * secondRational.getNumerator();
        long d= denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }
    public Listing13_Rational subtract (Listing13_Rational secondRational) {
        long n = numerator * secondRational.getDenominator() -
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }
    public Listing13_Rational multiply(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }

}
