//Used this post https://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence
//to help with fibonnaci logic on line 15

public class FibRec implements FibInterface {
   
    public int fibSequence(int n) {
      
        if (n == 0)
            return 0;
        if (n <= 2){
            return 1;

        }else {
           
            int fibonnaci = fibSequence(n - 1) + fibSequence(n - 2);
            return fibonnaci;
            
        }
    } // fibbonacci recursivly 

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
} // FibRec class