
public class ThrowEx {

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("Input One Number Through Command Line");
        }

        try {

            int d = Integer.parseInt(args[0]);

        } catch (NumberFormatException e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}
