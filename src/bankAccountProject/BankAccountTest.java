/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

import java.util.*;
import java.io.*;

public class BankAccountTest {

    public static void main(String[] args) {
        // Declare the scanner
        Scanner input = new Scanner(System.in);
        boolean runner = true;

        // Create an ArrayList of references to BankAccount objects
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

        // Create one CheckingAccount object and store the reference to it in the arrayList
        CheckingAccount myChecking = new CheckingAccount("My Checking", 123456, 125.00);
        bankAccounts.add(myChecking);

        // Create two SavingsAccount objects and store their references to them in the arrayList
        SavingsAccount savings1 = new SavingsAccount("My First Savings", 234567, 300.00);
        SavingsAccount savings2 = new SavingsAccount("My Second Savings", 245678, 150.00);
        bankAccounts.add(savings1);
        bankAccounts.add(savings2);

        // Display a summary of the accounts so that the user can access them
        System.out.println("-- Account Name ---- Account Number ---- Value ");
        bankAccounts.forEach(x -> System.out.format(" %-23s%-17s%s%n", x.getAccountName(), x.getAccountNumber(),
                x.getValue()));

        while (runner) {
            // Ask the user for the day of their deposit
            System.out.format("%nPlease enter today's date: (MM/DD/YYYY)");
            String[] todaysDate = input.next().split("");
            int todaysMonth = Integer.parseInt(todaysDate[0] + todaysDate[1]);
            int todaysYear = Integer.parseInt(todaysDate[6] + todaysDate[7] + todaysDate[8] + todaysDate[9]);
            
            //set the number of months passed since initial deposit
            

            int selection = 0;
            do {
                System.out.println("Press 1 to Deposit");
                System.out.println("Press 2 to Withdraw");
                System.out.println("Press 3 to Exit");

                selection = input.nextInt();

                switch (selection) {
                    case 1: // Deposit money in an account
                        // ask the user to enter the account number and deposit amount
                        System.out.println("Please enter the account number (123456) and deposit amount (350.00)");
                        int depositAccountNumber = input.nextInt();
                        double deposit = input.nextDouble();

                        bankAccounts.forEach(x -> {
                            if (x.getAccountNumber() == depositAccountNumber) {
                                x.deposit(deposit);
                                x.printValue();
                            }
                        });
                        break;

                    case 2: // Withdraw money out of an account
                        // ask the user to enter the account number and withdraw amount
                        System.out.println("Please enter the account number (123456) and withdraw amount (350.00)");
                        int withdrawAccountNumber = input.nextInt();
                        double withdraw = input.nextDouble();

                        bankAccounts.forEach(x -> {
                            if (x.getAccountNumber() == withdrawAccountNumber) {
                                x.withdraw(withdraw);
                                x.printValue();
                            }
                        });
                        break;
                }

            } while (selection < 3);

            System.out.println("The total value of all of your accounts is: " + BankAccount.calcValue(bankAccounts));

            // Create the text file and output all object in bankAccount array list to the file
            try (PrintWriter pw = new PrintWriter(new File("bankAccount.txt"))) {
                for (BankAccount a : bankAccounts) {
                    a.write(pw);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Could not open the file, program terminating.");
            }

            // read in the data from the file, create new objects and save in bankAccounts
            // try with resources closes file automatically when done
            try {
                File accountFile = new File("bankAccount.txt");
                Scanner reader = new Scanner(accountFile);
                System.out.format("-- Account Type ---- Account Name ---- Account Number ---- Balance ---- Interest Earned%n");

                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    if (line.contains("C")) {
                        String accountType = "Checking";
                        String accountNumber = reader.nextLine();
                        String accountBalance = reader.nextLine();
                        String interestEarned = "N/A";
                        String accountName = reader.nextLine();
                        System.out.format("    %-17s%-20s %-17s %-17s %-17s%n", accountType, accountName, accountNumber, accountBalance, interestEarned);
                    } else {
                        String accountType = "Savings";
                        String accountNumber = reader.nextLine();
                        String accountBalance = reader.nextLine();
                        String interestEarned = reader.nextLine();
                        String accountName = reader.nextLine();
                        System.out.format("    %-17s%-20s %-17s %-17s %-17s%n", accountType, accountName, accountNumber, accountBalance, interestEarned);
                    }
                }  

            } catch (Exception ex) {
                System.out.println("Cannot find file to read from. Application is terminating.");
            }

            System.out.println("Would you like to run again with exisiting accounts (Y/N)?");
            String answer = input.next().toUpperCase();
            if (!answer.contains("Y")) {
                runner = false;
            }
        }
        input.close();
    } // end of main

}
