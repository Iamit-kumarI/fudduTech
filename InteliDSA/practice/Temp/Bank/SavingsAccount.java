package Temp.Bank;

public class SavingsAccount extends BankAccount{
    private final double MIN_BALANCE = 500;

    public SavingsAccount(String name, String dob) {
        super(name, dob);
    }

    // Overloading
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction(amount, "Deposit");
        System.out.println("Amount Deposited Successfully");
    }

    public void deposit(double amount, String description) {
        deposit(amount);
        System.out.println("Description: " + description);
    }

    // Overriding Withdraw
    public void withdraw(double amount) {
        if(getBalance() - amount >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            addTransaction(amount, "Withdraw");
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Inssuficent balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + getBalance());
    }

    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        setBalance(getBalance() + interest);
        System.out.println("Interest Added: " + interest);
    }
}