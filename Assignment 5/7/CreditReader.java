import java.io.*;

class CreditReader {
    public static void main(String[] args) {
        String fileName = "Credit";
        String line;
//prints credit file and if it can't find the file for any reason it prints out 'problem reading ___'
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            line = in.readLine();
            while (line != null) // continue until end of file
            {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (IOException iox) {
            System.out.println("Problem reading " + fileName);
        }
    }
}