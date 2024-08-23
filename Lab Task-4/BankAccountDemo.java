abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SAV12345", 1000.0);
        CheckingAccount checkingAccount = new CheckingAccount("CHK67890", 1500.0);

        System.out.println("Initial Account Balances:");
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        checkingAccount.deposit(300.0);
        checkingAccount.withdraw(700.0);

        System.out.println("\nUpdated Account Balances:");
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();
    }
}
