import java.util.*;

public class Frequency {

    public static void main(String args[]) {
        int count = 0;
        System.out.println("Enter The String :");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Enter The Character To Find Frequency :");

        String ch = sc.nextLine();

        for (char c : s.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(ch.charAt(0)))
                count++;
        }

        System.out.println("Frequency : " + count);

    }

}
