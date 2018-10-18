public class MyHistogram {
    public static void main(String[] args) {
        int[] hist = new int[101];
        int i = 0;
        int j=0;
    
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
        int mode = 0 ;
        for (i = 0; i < hist.length; i++) {
            if (hist[i] != 0) {
                System.out.println("Non zero numbers in histogram: " + i);
            }
            if (hist[i] > maxFrequency){
                maxFrequency = Integer.valueOf(hist[i]);
                mode = i;
            }

        }

        for (i=0; i<hist.length; i++){
            if (i == maxFrequency)
            System.out.println("the real modes are: " + i);
        }

        //Find lowest value
        int min = Integer.valueOf(args[0]);
        int max = Integer.valueOf(args[0]);
        int mean = 0;
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
        System.out.println("Mode is : " + mode + " because it occurs " + maxFrequency + " times ");
        // System.out.println("Median is: " + median);
        //have another loop, find all that match the highest frequency and print out 

        // //Picture.java
        // char [] [] frame = new char[3][4];
        // for (int row =0;row<frame.length; row++){
        //     for (int col =0; col<frame[row].length; col++)
        //         frame[row][col] = 'what your assigning it to as a character';
        // }

         

        
       

     


    }
}