import java.util.*;

public class SquareUser {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean goodData = false;

        while (!goodData) {
            System.out.print("Enter an integer: ");
            //runs code but catches error if there is any and reruns without crashing
            try {
                num = scan.nextInt();
                goodData = true;
            }

            catch (InputMismatchException ex) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n");
                String flush = scan.next();
            }
        }
        
        System.out.println("The square of " + num + " is " + num * num);

    }
}