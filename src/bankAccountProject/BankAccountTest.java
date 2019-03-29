/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
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
		Scanner input =  new Scanner(System.in);

		// Create an ArrayList of references to BankAccount objects
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        
		// Create one CheckingAccount object and store the reference to it in the ArrayList
        BankAccount myChecking = new BankAccount();
        bankAccounts.add(myChecking);
        
		// Create two SavingsAccount objects and store references to them in the ArrayList
        BankAccount savings1 = new SavingsAccount();
        BankAccount savings2 = new SavingsAccount();

        bankAccounts.add(savings1);
        bankAccounts.add(savings2);
        // Ask the user for the day of their deposit
        
        int selection = 0;
		do {
            System.out.println("Press 1 to Deposit");
            System.out.println("Press 2 to Withdraw");
            System.out.println("Press 3 to Exit");

            selection = input.nextInt();
            int accountNumber = 0;

            switch (selection) {
                case 1: // Deposit money in an account
                    // ask the user to enter the account number and deposit amount
                    System.out.println("Please enter the account number (123456) and deposit amount (350.00)");
                    accountNumber = input.nextInt();
                    double deposit = input.nextDouble();
                    
                    // add the deposit amount to the value
                   
                    break;
                case 2: // Withdraw money out of an account
                    // ask the user to enter the account number and deposit amount
                	System.out.println("Please enter the account number (123456) and withdraw amount (350.00)");
                	accountNumber = input.nextInt();
                    double withdraw = input.nextDouble();
                    
                    // subtract the withdraw amount from the value
                	
                    break;
                default:
                	break;
            }
            
        } while (selection < 2);

			
		// Create a file on disk and for each account in the list write out
		// The account name
		// The account number
		// The account balance
		// The interest earned
		// Close the file 
		// Open the file 
		// Output the headings on the console for the bank report
		// Read in the data from the file on disk for each account
		// Write the data for each account on the console

	}

}