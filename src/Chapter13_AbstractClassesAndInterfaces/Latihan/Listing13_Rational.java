package Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing13_Rational extends Number implements Comparable<Listing13_Rational> {
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
    public Listing13_Rational divide(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Listing13_Rational(n, d);
    }
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + " / " + denominator;
    }
    public boolean equals(Object other) {
        if ((this.subtract((Listing13_Rational)(other))).getNumerator() == 0)
            return true;
        else
            return false;
    }
    public int intValue() {
        return (int) doubleValue();

    }
    public float floatValue() {
        return (float) doubleValue();
    }
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }
    public long longValue() {
        return (long) doubleValue();
    }
    public int compareTo(Listing13_Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() > 0)
            return -1;
        else
            return 0;
    }
}
