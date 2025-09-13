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

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public double interestRate;

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
/////////////////////////////////////////////////////////////////////////////
public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456789");
        account.deposit(500);
        account.interestRate = 3.5; // 3.5% interest rate for cash deposit
        account.addInterest();
        account.withdraw(200);
        account.interestRate = 5.0; // 5% interest rate
        account.addInterest();

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
}
