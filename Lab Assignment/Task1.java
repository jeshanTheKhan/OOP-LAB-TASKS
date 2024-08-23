class Account {
     int accountNumber;
     String accountHolder;
     double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayInfo();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
        displayInfo();
    }

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("Account Details - Account Number: " + accountNumber +
                ", Account Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
     double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }


    public void withdraw(double amount) {
        if (getBalance() - amount >= 500) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance limit reached.");
            displayInfo();
        }
    }
}

class CurrentAccount extends Account {
     double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }


    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Overdraft limit reached.");
            displayInfo();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Testing SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1, "Saver 1", 1000, 0.02);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(800);

   
        CurrentAccount currentAccount = new CurrentAccount(2, "Spender 1", 2000, 1000);
        currentAccount.deposit(300);
        currentAccount.withdraw(500);
        currentAccount.withdraw(3000);
    }
}
