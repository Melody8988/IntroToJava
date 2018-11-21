import java.io.File;
import java.util.Scanner;

public class IO2 {
    public static void main(String[] args) {
        Scanner s;
        int count = 0;
        String[] lines = new String[15];
        try {
            s = new Scanner(new File("IO.java"));

            while (s.hasNextLine()) {
                count++;
                String line = s.nextLine();
                if (count > lines.length)
                    break;
                System.out.println("Line " + count + ": " + line);
            }
        } catch (Exception e) {
            System.out.println("Oops, file not found");
        }
    }
}
