public class Rational {

    private int numerator;
    private int denominator;

    public Rational() {
    };

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    };

    // Turn rational into decimal
    public double toDecimal() {
        return (double) numerator / denominator;
    }

    // Multiply rational
    public Rational multiply(Rational r) {
        int n = (numerator * r.getNumerator());
        int d = (denominator * r.getDenominator());
        return new Rational(n, d);
    }

    // Reduce rational
    public void reduce() {
        for (int i = 6; i >= 2; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator = (numerator / i);
                denominator = (denominator / i);
            }
        }
    }

    // Add rational
    public Rational add(Rational r) {
        int d = (denominator * r.getDenominator());
        int leftN = (numerator * r.getDenominator());
        int rightN = (r.getNumerator() * denominator);
        int n = leftN + rightN;
        return new Rational(n, d);
    }

    // Copy rational
    public void copy(Rational anotherRational) {

        // int n = anotherRational.getNumerator();
        // int d = anotherRational.getDenominator();

        int n = numerator;
        int d = denominator;

        anotherRational.setNumerator(n);
        anotherRational.setDenominator(d);
    }

    public Rational clone() {

        Rational clonedRational = new Rational(numerator, denominator);
        return clonedRational;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        denominator = d;
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2); // for the rational number ½
        Rational r2 = new Rational(3, 4); // for the rational number ¾
        Rational r3 = new Rational(); // uses the default constructor

        // System.out.println("r1: " + r1 + " r2: " + r2 + " r3: " + r3);

        // System.out.println(r1.toDecimal());
        // r3 = r1.multiply(r2);

        // System.out.println(r3.toString());

        // r3 = new Rational(10, 40);
        // r3.reduce();
        // System.out.println(r3.toString());

        // r3 = r1.add(r2);
        // System.out.println(r3.toString());
        // 10/8 will be printed (common denominator 2 * 4 = 8)
        // r1 and r2 will remain ½ and ¾ respectively

        r1.copy(r3);
        System.out.println("copy " + r3.toString());
        // // ½ will be printed (r1 values were copied into r3)

        r3 = r2.clone();
        System.out.println("clone " + r3.toString());
        // // ¾ is printed (r3 points to a new Rational identical to r2)
    }
}