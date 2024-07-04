public class CheckingAccount {
    private double balance;
    private String name;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void displayAccount(){
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }

    void deposit(double x){
        setBalance(getBalance() + x);
    }

    public void withdraw(double amount) {
        if (amount <= 0){
            System.out.println("Peringatan: Jumlah penarikan tidak boleh negatif!");
        } else if (balance - amount <= 0) {
            System.out.println("Peringatan: Saldo tidak cukup untuk penarikan!");
        } else {
            balance -= amount;
            System.out.println("New balance: " + String.format("%.2f", balance));
        }
    }
}