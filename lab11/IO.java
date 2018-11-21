import java.util.Scanner;
public class IO {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = 0;
        String[] wordsArray = new String[4];
        System.out.print("Please enter a string: \n");
        while (s.hasNext()) {
            String input = s.next();
                if (input.equals("stop")){
                    break;
                }
                wordsArray[limit] = input;
                limit++;
                if (limit > 3)
                    break;
                System.out.print("Please enter a string: \n");
        } // end while
        System.out.println();
        //Loop through the wordsArray and print each element. 
        for (int i =0; i< wordsArray.length; i++){
            System.out.println(wordsArray[i]);
        }

    } // end main
}// end class IO