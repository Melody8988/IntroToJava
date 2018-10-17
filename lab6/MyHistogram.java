// Write a loop (and locate it between your initialization and printing loops in your code from Step 1 above)
// that will process each legal score from args by updating the appropriate index in hist. Compile and run
// your program. With values entered into your histogram, you should now see some output. When you are
// convinced that your code is working, have a TA check this step.

public class MyHistogram {
    public static void main(String[] args) {
        int[] hist = new int[101];
        int i = 0;
    

        // Initialize all score fruequencies to 0
        for (i = 0; i < 100; i++) {
            hist[i] = 0;
        }

        // Replace 0 hist values to inputs
        for (i = 0; i < args.length; i++) {
            int n = Integer.valueOf(args[i]);
            if (n >= 0 && n < 100) {
                hist[n] += 1;
            }
        }

        // Print non zero indexes
        int maxFrequency = Integer.valueOf(hist[0]);
        for (i = 0; i < hist.length; i++) {
            if (hist[i] != 0) {
                System.out.println("Non zero numbers in histogram: " + i);
            }
            if (hist[i] > maxFrequency){
                
            }

        }

        //Find lowest value
        int min = Integer.valueOf(args[0]);
        int max = Integer.valueOf(args[0]);
        int mean = 0;
        int mode;
        for (i = 0; i < args.length; i++) {
            
            if (Integer.valueOf(args[i]) < min) {
                min = Integer.valueOf(args[i]);
            } 
            if (Integer.valueOf(args[i]) > max) {
                max = Integer.valueOf(args[i]);
            } 
            
            mean = mean + Integer.valueOf(args[i]);
            

        }
        System.out.println("Lowest value is: " + min);
        System.out.println("Highest value is: " + max);
        System.out.println("Mean is: " + mean);
        // System.out.println("Mode is: " + mode);
        // System.out.println("Median is: " + median);

         

        
       

     


    }
}