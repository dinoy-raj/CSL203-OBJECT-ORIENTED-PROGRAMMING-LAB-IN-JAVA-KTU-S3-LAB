import java.io.*;

public class FileHandling {

    public static void main(String args[]) throws IOException {

        try {
            FileInputStream fi = new FileInputStream("input.txt");
            FileOutputStream ft = new FileOutputStream("output.txt");

            int i = 0;

            while ((i = fi.read()) != -1) {
                ft.write(i);
            }
        } catch (IOException e) {
            System.out.println("Exception " + e);
        }

    }

}
