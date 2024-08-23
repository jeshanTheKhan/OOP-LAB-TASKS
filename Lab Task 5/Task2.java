class Account {
    private double balance;
    private String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

// SavingsAccount class extending Account
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Override displayAccountInfo to include interest rate
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CheckingAccount class extending Account
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to consider overdraft limit

    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or exceeding overdraft limit.");
        }
    }

    // Override displayAccountInfo to include overdraft limit

    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

// Example usage
class Task2 {
    public static void main(String[] args) {
        // Creating a savings account
        SavingsAccount savingsAccount = new SavingsAccount("SA123456", 3.5);
        savingsAccount.deposit(1000);
        savingsAccount.displayAccountInfo();

        // Creating a checking account
        CheckingAccount checkingAccount = new CheckingAccount("CA789012", 500);
        checkingAccount.deposit(2000);
        checkingAccount.withdraw(1500);
        checkingAccount.displayAccountInfo();
    }
}
