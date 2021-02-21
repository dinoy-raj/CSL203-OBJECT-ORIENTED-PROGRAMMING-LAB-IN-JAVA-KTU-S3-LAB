import java.util.*;

public class TryFinallyEx2 {

    public static void main(String args[]) {
        int arr[] = new int[4];
        System.out.println("Enter The 4 Numbers :");
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 4) {
            arr[i] = sc.nextInt();
            i++;
        }

        try {
            System.out.println("Enter Index To Acess : ");
            System.out.println(arr[sc.nextInt() - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        } finally {

            System.out.println("\nThis One Will Excecute");
            i = 0;
            while (i < 4) {
                System.out.println(arr[i]);
                i++;
            }

        }

    }

}
