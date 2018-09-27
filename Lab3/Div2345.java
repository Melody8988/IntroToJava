// public class Div2345{
//     public static void main (String[] args){
public class Div2345 {
    public static void main(String[] args) {

        int input = Integer.valueOf(args[0]);;
        int output;

        if (input % 2 == 0 ) {
            output = 2 ;
            System.out.println(input + " is divisible by " + output);
        } if (input % 3 == 0) {
            output = 3;
            System.out.println(input + " is divisible by " + output);
        } if (input % 4 == 0) {
            output = 4;
            System.out.println(input + " is divisible by " + output);
        } if (input % 5 == 0) {
            output = 5;
            System.out.println(input + " is divisible by " + output);
        } else {
            System.out.println( input + " is not divisible by 2, 3, or 5");
        }
    }
}