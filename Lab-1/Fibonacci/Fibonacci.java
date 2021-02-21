import java.util.*;

class Fibonacci {

    public void fibo(int num) {

        System.out.println("\n The Fibnacci Series Upto " + num + " Is :\n");

        int n1 = 0, n2 = 1;

        while (n1 < num) {

            System.out.println(n1);

            n2 = n1 + n2;
            n1 = n2 - n1;

        }

    }

    public static void main(String args[]) {

        Fibonacci obj1 = new Fibonacci();

        System.out.println("Enter The Limit : ");
        Scanner sc = new Scanner(System.in);

        obj1.fibo(sc.nextInt());

    }

}