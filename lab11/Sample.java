import java.io.File;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {

        
        String line;
        Scanner s; 
        File myDir = new File(".");
        int count;
        // list files in directory
        File[] fileList = myDir.listFiles(); // returns a String array with the file names in this directory

        try {

            for (count = 0; count < fileList.length; count++) {
                String fileName = fileList[count].getName();
                if (fileName.endsWith(".java")){
                s = new Scanner(new File(fileName));
                line = s.nextLine();
                System.out.println("File: " + fileName + " first line: " + line);
                }
                    // System.out.print(fileName.substring(0, fileName.length() - 5) + " : ");
            }

            

        } catch (Exception e) {
            System.out.println("Oops, file not found");
        }

    }
}