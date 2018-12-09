//Used this post https://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence
//to help with fibonnaci logic on line 27

public class FibRec implements FibInterface {

    public void fibSequence(int n) {

        System.out.println("Fibonacci up to " + n);
        // Loop for printing
        for (int i = 0; i < n; i++) {
            System.out.print(getFib(i) + " ");
        }
    } // fibbonacci recursivly

    public int getFib(int n) {

        if (n == 0)
            return 0;
        if (n == 1) {
            return 1;
        } else {
            int fibonnaci = getFib(n - 1) + getFib(n - 2);
            return fibonnaci;
        }
    }
} // FibRec class