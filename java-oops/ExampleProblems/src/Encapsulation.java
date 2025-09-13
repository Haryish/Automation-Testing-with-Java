class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
        else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
}
