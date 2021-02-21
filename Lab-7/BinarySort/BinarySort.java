import java.util.*;

public class BinarySort {

    public static void main(String args[]) {

        int num, i = 0;

        System.out.println("Enter The Number Of Digits: ");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        System.out.println("Enter The Digits (Ascending order): ");

        int arr[] = new int[num];

        while (i < num) {

            arr[i] = sc.nextInt();
            i++;

        }
        System.out.println("Enter The Digits To Search: ");

        int sr = sc.nextInt();

        int l = 0, r = num - 1;
        int mid = 0;

        while (l <= r) {

            mid = (l + r) / 2;

            if (arr[mid] == sr) {
                break;
            } else if (arr[mid] > sr) {

                r = mid - 1;
                continue;

            } else {
                l = mid + 1;
                continue;
            }
        }

        if (l > r) {
            System.out.println("Elements Not Found ! ");
        } else if (arr[mid] == sr) {
            System.out.println(arr[mid] + " Found At Position " + mid);
        }

    }

}
