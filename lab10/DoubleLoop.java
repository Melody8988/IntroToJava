public class DoubleLoop {
    public static void main (String[] args){
    
        int [] fifteen = new int [15];

        int count = 1;

        for (int i=0;i<fifteen.length; i++){

            fifteen[i] = count++;
            System.out.printf("%4d   ", fifteen[i]);
          
        }
        
            }//end main 
            
    }//end class

    
