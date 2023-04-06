public class AccountHolder {
    public static void main(String[] args) {
        Bank bb = new Bank();
        int balance = bb.getMinimumBalance();
        System.out.println("The minimum balance is " + balance);
        bb.setMinimumBalance(5000);
        
        balance = bb.getMinimumBalance();

        System.out.println("The minimum balance is " + balance);

    }
}
