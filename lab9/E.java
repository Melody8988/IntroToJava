public class E {

    public static int fact (int n){
    
        int factorialN = 1;

        if (n >= 0 ){
            for (int i = 1; i <= n; i++){
                factorialN = factorialN*i;
            }
        }
        return factorialN;

    }
    public static void main (String [] args){
        double sum = 0;
        int input = Integer.valueOf(args[0]);
        Rational2 [] r = new Rational2 [input];

        for ( int i = 0; i < input; i++){
             r[i] = new Rational2 (1, fact(i));
             sum += r[i].toDecimal();
             
        }

        System.out.println(sum);



    }
    // public static void main (String [] args){
    //     Rational r1 = new Rational(1, 2);
    //     Rational r2 = new Rational2(3, 4);
    //     Object r3 = new Rational2(5, 6);

    //     System.out.println(r1.toString());
    //     System.out.println(r2.toString());
    //     System.out.println(r3.toString());
    // }


}