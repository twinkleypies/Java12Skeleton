import java.util.*;

public class CatchAll {
    public static void main(String[] args) {
        int num = 0, div;
        Scanner scan = new Scanner(System.in);
    //uses the try function to catch any errors
        try {
            
            System.out.print("Enter the numerator: ");
            num = scan.nextInt();
            System.out.print("Enter the divisor  : ");
            div = scan.nextInt();
            System.out.println(num + " / " + div + " is " + (num / div) + " rem " + (num % div));
            //in divison between values
        } catch (ArithmeticException ex) {
            System.out.println("You can't divide " + num + " by " + div);
            //in any other input that doesn't make sense
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Good-by");
    }
}