public class Alpha {
    public static void main (String[] args){

        String greek = String.valueOf(args[0]);
        String letter;
        
        if (greek.equals("alpha")) {
            letter = "A" ;
            System.out.println(greek + " translates to " + letter );
        } else if (greek.equals("beta")) {
            letter = "B" ;
            System.out.println(greek + " translates to " + letter);
        } else if (greek.equals("gamma")) {
            letter = "C" ;
            System.out.println(greek + " translates to " + letter);
        } else if (greek.equals("delta")) {
            letter = "D" ;
            System.out.println(greek + " translates to " + letter);
        } else if (greek.equals("epsilon")) {
            letter = "E" ;
            System.out.println(greek + " translates to " + letter);
        }
    }
}