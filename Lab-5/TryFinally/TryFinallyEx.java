
import java.util.*;

public class TryFinallyEx {

    public static void main(String args[]) {

        System.out.println("Enter The Value Of A And B : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {

            int c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {

            System.out.println("Exception Found : " + e);
        } finally {
            System.out.println("This One Will Excecute");
        }

    }

}
