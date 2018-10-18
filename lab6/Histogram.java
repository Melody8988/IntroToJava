// Histogram.java
// Array application  - histogram of scores

public class Histogram {
    public static void main(String[] args) {

        int n;  // input variable
        int count;  // histogram index variable
        int frequency;  // counter variable for display of histogram
        int[] hist = new int[101];  // array indexed 0..100 for histogram

        count = 0;
        while (count < hist.length) {  // set all values in hist to 0
            hist[count] = 0;
            count++;
        }

        System.out.print("Enter scores between 0 and 100 (-1 to quit): ");
        n = TextIO.getInt();
        while (n != -1) {  // input loop and load inputs into histogram array
            if (n >= 0 && n <= 100)  // verify input is in range
              hist[n]++;   
            else System.out.println("Ignoring out of range input " + n);
            System.out.print("next score: ");
            n = TextIO.getInt();
        }  // input loop and load inputs into histogram array

        //  display histogram

        System.out.println("\nHistogram of Scores Entered");
        count = 0;
        while (count < hist.length) {  // print rows of histogram
            if (hist[count] != 0) {  // only print non-zero histogram entries
              System.out.print("Score: " + count + "  ");
              frequency = 0;
              while (frequency < hist[count]) {  // print stars for hist[count]
                   frequency++;
                   System.out.print("*");
              }  //  print stars for hist[count]
              System.out.println();
            }  // if - print of non-zero histogram entry
            count++;
        }  //  while - print rows of histogram 
    }  // main
}  // Histogram 

