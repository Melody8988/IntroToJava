
public class FibIter implements FibInterface {
   
    public int fibSequence(int n) {
        int t1 = 0; //previos 
        int t2 = 1; //current

        System.out.println("The first " + n + " terms are");
       

        for (int i = 1; i <= n; ++i) { //n is number of terms 

            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            
       }
       return t1;

    } // factorial implemented iteratively

    public int getFib(int n){
        int t1 = 0; //previos 
        int t2 = 1; //current
        int printn = n-1;
        

        for (int i = 1; i <= printn; ++i) { //n is number of terms 

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;  
    }
    return t1;
  }
} // FactIter class