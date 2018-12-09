//massa077
import java.util.Scanner;

public class FibTest {
    public static void main(String[] args) {
        FibInterface f = new FibRec();
        FibInterface g = new FibIter();
        int nTerms;
        Scanner s = new Scanner(System.in);

        System.out.println("How many terms do you want to see?");

        while (s.hasNextInt()) {
            nTerms = s.nextInt();

            System.out.println("\nRECURSIVE");
            f.fibSequence(nTerms);

            System.out.println("\nITERATIVE");
            g.fibSequence(nTerms);

            System.out.println("\n How many terms do you want to see?");
        } // while waiting for input
    } // main
} // FibTest class


//What is happening?

//The iterative version of the fibbonaci sequence happens much faster than the recursive sequence
// because the recursive method first finds which values need to be calculated from the function, 
//move all the way down to the base case to find the starting value, 
//and then works backwards to fill in method parameter values. 