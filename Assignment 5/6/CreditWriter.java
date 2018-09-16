import java.io.*;

class CreditWriter {
    public static void main(String[] args) {
        // Get filename and create the file
        FileWriter writer = null;
        Scanner scan = new Scanner(System.in);
        String fileName = "";

        System.out.print("Enter Filename-->");
        try {
            fileName = scan.next();

            // create the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }

        // Write out the table.
        

    }
}