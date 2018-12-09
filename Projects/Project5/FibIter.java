public class FibIter implements FibInterface {
   
    public void fibSequence(int n) {
        System.out.println("Fibonacci up to " + n ); 
        //Loop for printing
        for(int i=1; i <= n; i++){ 
            System.out.print(getFib(i) + " "); 
        }

    } // factorial implemented iteratively

    public int getFib(int n){
        int t1 = 0; //previos 
        int t2 = 1; //current
        for (int i = 1; i < n; i++) { 
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;  
    }
    return t1;
  }
} // FactIter class