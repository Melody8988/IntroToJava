import java.io.File;
import java.util.Scanner;

public class IO3 {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String fileName = "";
        System.out.print("Please enter a file name to read: ");
        if (r.hasNext())
            fileName = r.nextLine();
        int i = 0;
        String[] lines = new String[15];
        try {
            Scanner s = new Scanner(new File(fileName));
            // fill lines array with file lines
            for (i = 1; i < lines.length; i++) {
                lines[i] = s.nextLine();
            }
            System.out.print("To lookup a particular line, enter the number, ^d to stop: ");
            while (r.hasNextInt()) {
                i = r.nextInt();
                if (i > 0 && i < lines.length) {
                    System.out.print("\nLine " + i + ": ");
                    System.out.println(lines[i]);
                    System.out.print("\nNext line, ^d to stop: ");
                }
            }
        } catch (Exception e) {
            System.out.println("Oops, file not found");
        }
    }
}
