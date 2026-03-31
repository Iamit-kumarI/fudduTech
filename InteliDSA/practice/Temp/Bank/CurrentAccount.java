package Temp.Bank;

public class CurrentAccount extends BankAccount {
    private final double OVERDRAFT = 5000;

    public CurrentAccount(String name, String dob) {
        super(name, dob);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction(amount, "Deposit");
        System.out.println("Amount Deposited Successfully");
    }

    // Overriding Withdraw
    public void withdraw(double amount) {
        if(getBalance() + OVERDRAFT >= amount) {
            setBalance(getBalance() - amount);
            addTransaction(amount, "Withdraw");
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + getBalance());
    }
}