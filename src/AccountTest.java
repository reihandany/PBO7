public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setBalance(100000);
        account.setName("Bayu");
        account.deposit(50000);
        account.withdraw(50000);
        account.displayAccount();
    }
}