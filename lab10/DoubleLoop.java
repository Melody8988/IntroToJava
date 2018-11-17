public class DoubleLoop {
    public static void main (String[] args){
    
        int [] fifteen = new int [15];

        int count = 0;
        int format = 1;
        
        for (int i=0;i<fifteen.length; i++){
            fifteen[i] = format++;
            count++;
            System.out.printf("%4d   ", fifteen[i]);
            if (count %4 ==0 ){
                System.out.println();
            }

        }
        System.out.println();
            }//end main 
            
    }//end class

    
