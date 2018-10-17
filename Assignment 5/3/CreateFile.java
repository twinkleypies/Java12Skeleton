import java.io.*;
import java.util.Scanner;

class CreateFile {
    public static void main(String[] args) {

        // Get filename and create the file
        BufferedWriter writer = null;
        FileWriter filewriter = null;
        Scanner scan = new Scanner(System.in);
        String fileName = "";
        System.out.print("Enter Filename-->");
//creates files
        try {
            fileName = scan.next();
            filewriter = new FileWriter(fileName);
            writer = new BufferedWriter(filewriter);
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }

        // Write the file.
        try {
            writer.write("Come along with me,\n");
            writer.write("And the butterflies and bees\n");
            writer.write("We can wander through the forest\n");
            writer.write("And do so as we please\n");
            writer.close();
        } catch (IOException iox) {
            System.out.println("Problem writing " + fileName);
        }
    }
}