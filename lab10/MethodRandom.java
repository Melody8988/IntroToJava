public class MethodRandom {
    public static void main(String[] args) {

        //variable declaration
        int num = Integer.valueOf(args[0]); //input size of array
        double [] doubleArray = new double [num];

        

        MethodRandom.fill(doubleArray);

        //print
        for (int i=0; i<doubleArray.length; i++){
            System.out.printf("%.2f ", doubleArray[i]);
        }

        System.out.println();
        System.out.printf("Average is: %.2f", + MethodRandom.average(doubleArray));
        System.out.println();
        System.out.printf("Largest is: %.2f ", + MethodRandom.largest(doubleArray));
        System.out.println();
        System.out.printf("Smallest is: %.2f", + MethodRandom.smallest(doubleArray));
        System.out.println();
        

    }//end main




    public static void fill (double [] a){
        for (int i=0; i < a.length; i++)
            a[i] = (double) Random.randomInt(0, 1);
    }

    public static double average (double [] a){
        double sum = 0;

        for (int j = 0; j < a.length; j++){
            sum = sum + a[j];        
            }
            double average = sum/a.length;
            return average;
    }

    public static double largest (double [] a) {
        double largest = a[0];
        
        for (int count = 0; count < a.length; count++){

            if (a[count] > largest){
                largest = a[count];
            }  
        }
        return largest;
    }

    public static double smallest (double [] a){
        double smallest = a[0];
        for (int count = 0; count < a.length; count++){
            if (a[count] < smallest){
                smallest = a[count];
            }

        }
        return smallest;
    }

   
    
    //random method
    public static double randomInt(int min, int max) { //random method
		return (double) ((Math.random() * (max) ));
	} //end of random method
    
}

