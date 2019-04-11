/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 * Code Created by Jake
 */
package bankAccountProject;

import java.io.*;

public class CheckingAccount extends BankAccount {
// Data Fields

// Constructors
    /**
     * The CheckingAcoount default constructor method Purpose: Creates a
     * CheckingAccount object that inherits the super data fields
     *
     * @param void
     * @return void
     */
    public CheckingAccount() {
        super();
    }

    /**
     * The CheckingAccount constructor method purpose: Creates a CheckingAccount
     * object with specified parameters
     *
     * @param Sting
     * @param int
     * @param double
     * @return void
     */
    public CheckingAccount(String accountName, int accountNumber, double initialValue) {
        super(accountName, accountNumber, initialValue);
    }

// Methods
    /**
     * The toString method Purpose: calculates the total value of all accounts
     *
     * @return double sum of all accounts values
     */
    @Override
    public String toString() {
        return "This is Checking Account " + this.getAccountNumber() + " and it currently has a balance of - " + this.getValue();
    }

    /**
     * The write method purpose: writes specified data fields to a file
     *
     * @param PrintWriter
     * @return void
     */
    @Override
    public void write(PrintWriter pw) {
        pw.println("C"); // mark this as a checking account
        pw.println(getAccountNumber());
        pw.println(getValue());
        super.write(pw);
    }

}
