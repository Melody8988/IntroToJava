//Write a Java program to print out a list of the integers between a and b (inclusive) that
//are evenly divisible by either 2 or 3. The values of a and b should be command line arguments. You may
//assume that a will be less than or equal to b.

public class mid1 {
    public static void main(String[] args) {
        int i;
       

        for (i=1; i<=10; i++){
            if (i % 2 == 0 ){
                System.out.println("numbers divisible by 2: " + i);
            }

            if(i % 3 == 0) {
                System.out.println("numbers divisible by 3: " + i);
            }
        }
        
    }
   }