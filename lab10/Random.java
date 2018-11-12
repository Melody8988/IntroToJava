public class Random {
    public static void main(String[] args) {

        //variable declaration
        double sum = 0;
        int num = Integer.valueOf(args[0]); //input size of array
        double [] doubleArray = new double [num];

        //Initialize to random fro given length
        for (int i=0; i < doubleArray.length; i++){
            doubleArray[i] = (double) Random.randomInt(0, 1);

            //solve for sum through loop
            sum = sum + doubleArray[i];
        }

        //solve for average
        double average = sum/num;

        //printing purposes
        for (int j = 0; j < doubleArray.length; j++)
                System.out.printf("%.2f ", doubleArray[j]);

        System.out.println("sum is: " + sum);
        System.out.println();
        System.out.println("average is: " + average);

    }//end main


    //random method
    public static double randomInt(int min, int max) { //random method
		return (double) ((Math.random() * (max) ));
	} //end of random method 
    
}

// Write a Java main() method to take in a positive integer (call is size) from the
// command line, create an array of doubles of length, size. Then, completely fill the array with random
// numbers between 0..1. Once the array is filled, calculate the average of all the numbers in the array. (The
// average should be around 0.5.) How big does the array need to be (how many values need to be averaged)
// for the average to be consistently within .1 of 0.5?