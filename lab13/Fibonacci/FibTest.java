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




        //Recursive printing
        System.out.println("RECURSIVE"); 
        System.out.println("Fibonacci up to " + nTerms + " : "); 
        //Loop for printing
        for(int i=0; i <= nTerms; i++){ 
            System.out.print(f.fibSequence(i) +" "); 
        }
                if (nTerms >= 0 ){
                    // g.fibSequence(nTerms);
                    System.out.println("\nThe " + nTerms + "th term is:  " + f.getFib(nTerms));
                    System.out.println("\n How many terms do you want to see?");
                } else {
                    System.out.println("Please enter a number greater than or equal to 0");
                }
        //Iterative printing

        
        }//while waiting for input 
    } // main
} // FibTest class