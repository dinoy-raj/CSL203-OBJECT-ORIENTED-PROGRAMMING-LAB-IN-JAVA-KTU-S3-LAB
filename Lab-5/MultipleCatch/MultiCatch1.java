import java.io.*;

public class MultiCatch1 {

    public static void main(String args[]) {

        // String s="dinoy";
        try {

            int c = Integer.parseInt(args[0]);
            c = Integer.parseInt(args[1]) / Integer.parseInt(args[2]);
            char g = args[3].charAt(10);
            FileInputStream st = new FileInputStream("input.txt");

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
