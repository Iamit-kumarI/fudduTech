package Temp.Bank;
import java.util.*;

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full Name:");
        String name = sc.nextLine();

        System.out.println("Enter DOB (dd/mm/yyyy):");
        String dob = sc.nextLine();

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int type = sc.nextInt();

        BankAccount account;

        if(type == 1)
            account = new SavingsAccount(name, dob);
        else
            account = new CurrentAccount(name, dob);

        // Minor Check
        if(account.getAge() < 18) {
            sc.nextLine();
            System.out.println("Minor Account - Enter Guardian Name:");
            String gname = sc.nextLine();
            System.out.println("Enter Relation:");
            String grel = sc.nextLine();
            account.setGuardian(gname, grel);
        }

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Change Password");
            System.out.println("5 Change PIN");
            System.out.println("6 Account Details");
            System.out.println("7 Transaction History");
            System.out.println("8 Exit");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter Amount:");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.println("Enter Amount:");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.changePassword();
                    break;

                case 5:
                    account.changePin();
                    break;

                case 6:
                    System.out.println("Account No: " + account.getAccountNumber());
                    System.out.println("Name: " + account.getFirstName());
                    break;

                case 7:
                    account.showTransactions();
                    break;

                case 8:
                    System.out.println("Thank You!");
                    break;
            }

        } while(choice != 8);
    }
}