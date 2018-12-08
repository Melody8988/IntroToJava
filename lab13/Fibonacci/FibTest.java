import java.util.Scanner;

public class FibTest {
    public static void main(String[] args) {
        FibInterface f = new FibRec();
        FibInterface g = new FibIter();
        int nTerms;
        Scanner s = new Scanner(System.in);
        
        System.out.println("How many terms do you want to see?");
     
        while  (s.hasNextInt()) {
                nTerms = s.nextInt();
                    
                    System.out.println("\nRECURSIVE"); 
                    f.fibSequence(nTerms);

                    System.out.println("\nITERATIVE"); 
                    g.fibSequence(nTerms);

                    System.out.println("\n How many terms do you want to see?");
        }//while waiting for input 
    } // main
} // FibTest class