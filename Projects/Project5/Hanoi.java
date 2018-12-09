//massa077
import java.util.Scanner;

public class Hanoi {

    public static int count = 0;

    public static int hanoi(int n, char source, char dest, char temp) {
        count ++;
        
       
        if (n == 1) {
            //System.out.println(" Move disk 1 from " + source + " to " + dest); //removed from labsheet
        } else {
            hanoi(n - 1, source, temp, dest);
            //System.out.println(" Move disk " + n + " from " + source + " to " + dest);//removed from labsheet
            hanoi(n - 1, temp, dest, source);
        }
        return count;
        
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many disks the problem has");
        while (s.hasNextInt()) {
            int nDisks = s.nextInt();

            char source = 'a';
            char dest = 'b';
            char temp = 'c';

           if (nDisks <= 0 ){
               System.out.println("No game to play with 0 disks");
           }else {
            System.out.println("Number of steps:\n" + hanoi(nDisks, source, dest, temp) + "\n");
            count = 0;//reset count for every disk answer request
           }
            System.out.println("Enter how many disks the problem has");
        } // end while

    }// end main
}// end Hanoi

//The output for 
//0 =  No game to play with 0 disks
//1 = 1
//2 = 3
//3 = 7
//5 = 31
//10 = 1023
//20 = 1048575
//30 = 1073741823
//40 would equal 1.0995116e+12 if it didn't take so long for the computer to calculate

//--------------------------------------------------------------------------------------------------------
//To qunatify the rate (complexity) at which the number of steps increases to solve the Tower of Hanoi
//We say each step (represented by n) equals one (n=1).
//If we input one disk, the output number of steps is 1
//If we input 3 disks, the output number is 7
//If we input 10 disk, the output number is 1023
//   2^1 = 2  | 2^3 = 8 | 2^10 = 1024
//The output is one less than 2^n so in order to quantify the rate
//The complexity is 2^n - 1 where n represents the number of disks.