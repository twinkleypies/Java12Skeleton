import javax.swing.*;

public class joptionpaneinput {
    public static void main(String[] args) {
        String name, last;
        int number;
        name = JOptionPane.showInputDialog("what is your name ?");
        System.out.println(name + " what day of the month is it today?");
        number = Integer.parseInt(JOptionPane.showInputDialog(name + " what day of the month is it today?"));
        number++;
        System.out.println(name + " you know that tomorrow it will be the " + number);
        last = JOptionPane.showInputDialog(name + " what is your last name ?");
        System.out.print("bye " + name + " " + last);
    }
}