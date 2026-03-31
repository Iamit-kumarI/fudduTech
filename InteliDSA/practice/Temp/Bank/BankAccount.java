package Temp.Bank;
import java.util.*;


public class BankAccount implements BankServices {
    private static int totalAccounts = 0;

    private int accountNumber;
    private String fullName;
    private String firstName;
    private String dob;
    private int age;
    private String guardianName;
    private String guardianRelation;
    private double balance;
    private String password;
    private String pin;

    protected ArrayList<Transaction> transactions = new ArrayList<>();

    // Default Constructor
    public BankAccount() {
        generateAccountNumber();
        totalAccounts++;
    }

    // Parameterized Constructor
    public BankAccount(String fullName, String dob) {
        this.fullName = fullName;
        this.firstName = fullName.split(" ")[0];
        this.dob = dob;
        this.age = calculateAge(dob);
        this.balance = 0;
        generateAccountNumber();
        totalAccounts++;
    }

    private void generateAccountNumber() {
        Random rand = new Random();
        this.accountNumber = 100000 + rand.nextInt(900000);
    }

    private int calculateAge(String dob) {
        int year = Integer.parseInt(dob.substring(6));
        return 2026 - year;
    }

    // Abstract Methods
    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public void checkBalance() {

    }

    // Getters
    public int getAccountNumber() { return accountNumber; }
    public String getFirstName() { return firstName; }
    public double getBalance() { return balance; }
    public int getAge() { return age; }

    protected void setBalance(double balance) {
        if(balance >= 0)
            this.balance = balance;
    }

    public void setGuardian(String name, String relation) {
        this.guardianName = name;
        this.guardianRelation = relation;
    }

    // Password change
    public void changePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new password:");
        password = sc.next();
        System.out.println("Password changed successfully.");
    }

    public void changePin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new PIN:");
        pin = sc.next();
        System.out.println("PIN changed successfully.");
    }

    public void addTransaction(double amount, String type) {
        transactions.add(new Transaction(amount, type));
    }

    public void showTransactions() {
        System.out.println("Last Transactions:");
        for(Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}