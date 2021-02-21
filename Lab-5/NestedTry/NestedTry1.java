
public class NestedTry1 {

    public int dinoy() {
        return 1;
    }

    public static void main(String args[]) {
        try {
            char c = args[1].charAt(3);
            try {

                NestedTry1 nt = new NestedTry1();
                nt = null;

                System.out.println(nt.dinoy());

            } catch (NullPointerException e) {

                System.out.println("inner Exception : " + e.getMessage());

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outer Exception : " + e.getMessage());
        }
    }

}
