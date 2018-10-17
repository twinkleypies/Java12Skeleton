import java.io.*;
import java.util.Scanner;

class CreditWriter {
    public static void main(String[] args) {
        // Get filename and create the file
        PrintWriter writer = null;
        Scanner scan = new Scanner(System.in);
        String fileName = "";
        

        System.out.print("Enter Filename-->");
        try {
            fileName = scan.next();

            // create the PrintWriter and enable automatic flushing
            writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }
        while (true) {
            System.out.println("Enter 0 to exit or 1 to input another: ");
            int input = scan.nextInt();
            int age, debt;
            String name;
            if (input == 0) {
                break;
                
            }
            scan.nextLine();

            // gains values for age name and debt
            System.out.println("What's your name");
            name = scan.nextLine();
            System.out.println("What's your age");
            age = scan.nextInt();
            scan.nextLine();
            System.out.println("What do you owe?");
            debt = scan.nextInt();
            scan.nextLine();

            // prints out values
            writer.println(name + "\t" + age + "\t" + debt);
        }
        writer.close();

        // Write out the table.

    }
}