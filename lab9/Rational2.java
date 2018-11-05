public class Rational2 extends Rational{

    private static int count = 0; //update how many rational numbers have been created so far
    private int index = 0; //order in which this Rational2 was created


    public Rational2() { //default constructor
        super();
        count++;
        index = count;
        
        
    };

    public Rational2(int numerator, int denominator){
        super(numerator, denominator);
        count++;
        index = count;

        // this.index = index;

    }

    public int getIndex() { return index; }

    public String toString() {
        return "(" + index + ")" + getNumerator() + "/" + getDenominator();
    }


    public static void main (String[] args){
        Rational2 r1 = new Rational2(1, 6); 
        Rational2 r2 = new Rational2(1, 4); 
        Rational2 r3 = new Rational2(); // uses the default constructor

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }
}



  


