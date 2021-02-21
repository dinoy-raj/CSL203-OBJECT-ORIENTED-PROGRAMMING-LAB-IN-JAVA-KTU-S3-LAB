
public class BankAccount {

    private String accHolder;
    private String accNumber;
    private String accType;
    private Double accBalance;

    BankAccount() {
        System.out.println("Welcome To Dinoy Bank");
        accinfo();
    }

    BankAccount(String name, String acc, String type, Double balance) {
        System.out.println("Welcome To Dinoy Bank");

        accHolder = name;
        accNumber = acc;
        accType = type;
        accBalance = balance;
        accinfo();
    }

    public void accinfo() {
        System.out.println("\n\n||||| Dino Bank Welcome You |||||");
        System.out.println("\n:: Account Holder Name : " + accHolder);
        System.out.println(":: Account Number : " + accNumber);
        System.out.println(":: Account Type : " + accType);
        System.out.println(":: Account Balance : " + accBalance);
        System.out.println(":: Happy Banking :) \n");
    }

    public void deposit(Double depo) {
        accBalance += depo;
        System.out.println("New Balance " + accBalance);

    }

    public void withdraw(Double draw) {

        if (draw > accBalance) {
            System.out.println("Cannot Withdraw Out Of Balance ");
            accinfo();
        } else {
            accBalance -= draw;
            accinfo();
        }

    }

    public static void main(String args[]) {

        // with default values Bankaccount//
        BankAccount bk = new BankAccount();

        // using
        // parameterized//
        BankAccount acc1 = new BankAccount("DINOY RAJ", "AC101432", "SAVINGS", 100.0);
        acc1.deposit(20000.0);
        acc1.withdraw(1000.0);
        // low Balance
        BankAccount acc2 = new BankAccount("AMAL NATH", "AC101438", "SAVINGS", 100.0);
        acc2.deposit(2000.0);
        acc2.withdraw(100000.0);

    }

}
