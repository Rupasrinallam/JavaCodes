
class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }


    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        balance += (balance * interestRate);
    }
}


class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(500, 200);


        savingsAccount.deposit(200);
        savingsAccount.displayBalance();

        checkingAccount.withdraw(700);
        checkingAccount.displayBalance();
    }
}


