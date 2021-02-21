import java.util.*;

public class Dlinkedlist {

    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();

        /*
         * System.out.println("Menu \n1.Insert\n2.delete\n3.display");
         * 
         * Scanner sc = new Scanner(System.in);
         * 
         * switch (sc.nextInt()) {
         * 
         * case 1: System.out.println("Enter The Element : "); ll.add(sc.nextLine());
         * 
         * case 2: System.out.println("Enter The Element To Delete : ");
         * ll.remove(sc.nextLine());
         * 
         * }
         */
        ll.add("dinoy");
        ll.add("dhanya");
        ll.add("kuttan");
        ll.add("deepu");
        ll.add("sangi");

        System.out.println("List After Insertion : ");

        Iterator<String> itr = ll.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ll.remove("dinoy");
        ll.remove(2);

        System.out.println("List After Removing : ");

        Iterator<String> rti = ll.iterator();

        while (rti.hasNext()) {
            System.out.println(rti.next());
        }

    }
}
