import java.io.*;

class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "Powers";
        String line;
//catches problem when trying to read file which in turn ends loop
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