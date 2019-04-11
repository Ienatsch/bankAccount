/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 * Code Created by Jake
 */
package bankAccountProject;

import java.io.*;
import java.util.*;

public class BankAccount {
// Data Fields

    private String accountName = "My Bank Account"; // The account name
    private int routingNumber = 123456; // The bank routing number
    private double value = 0; // The default value of the account
    private static double sum = 0;
    private int accountNumber = 00000;
    private Scanner input = new Scanner(System.in);

// Constructors
    /**
     * The default BankAccount constructor method Purpose: create a default
     * BankAccount object
     *
     * @param void
     * @return void
     */
    public BankAccount() {
    }

    /**
     * The BankAccount constructor method Purpose: create a BankAccount object
     * with a defined data set
     *
     * @param String
     * @param int
     * @param double
     * @param double
     * @param int
     * @return void
     */
    public BankAccount(String accountName, int accountNumber, double value) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.value = value;
    }

    // Methods
    /**
     * The getAccountName method Purpose: returns the bankName to the user
     *
     * @param void
     * @return String
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * The getRoutingNumber method Purpose: returns the routingNumber to the
     * user
     *
     * @param void
     * @return int
     */
    public int getRoutingNumber() {
        return routingNumber;
    }

    /**
     * The getValue method Purpose: returns the value to the user
     *
     * @param void
     * @return double
     */
    public double getValue() {
        return value;
    }

    /**
     * The getAccountNumber method Purpose: gets the accountNumber
     *
     * @param void
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * The setAccountNumber method Purpose: sets the accountNumber
     *
     * @param int
     * @return void
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * The setBankName method Purpose: sets the accountName
     *
     * @param String
     * @return void
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * The setRoutingNumber method Purpose: sets the routingNumber
     *
     * @param int
     * @return void
     */
    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * The set value method Purpose: sets the value
     *
     * @param double
     * @return void
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * The deposit method Purpose: adds money to value
     *
     * @param double - how much is going in the account
     * @return void
     */
    public void deposit(double deposit) {
        this.value += deposit;

    }

    /**
     * The withdraw method Purpose: subtracts money from an account
     *
     * @param double - how much is being withdrawn
     * @return void
     */
    public void withdraw(double withdraw) {
        System.out.println("Please enter the account number you would like to withdraw from: ");
        this.value -= withdraw;
    }

    /**
     * The calcValue method Purpose: calculates the total value of all accounts
     *
     * @param ArrayList
     * @return double sum of all values
     */
    public static double calcValue(ArrayList<BankAccount> array) {
        array.forEach(x -> sum += x.getValue());
        return sum;
    }

    /**
     * The calcValue method Purpose: displays current value of account
     *
     * @return double current account value
     */
    public PrintStream printValue() {
        return System.out.format("The current balance of this account is: %.2f%n", this.value);
    }

    /**
     * The toString method Purpose: calculates the total value of all accounts
     *
     * @return double sum of all accounts values
     */
    @Override
    public String toString() {
        return "This is the main bank account, it can hold various Checking and Savings accounts";
    }

    /**
     * The write method purpose: create a way to write data to a file
     *
     * @param PrintWriter
     * @return void
     */
    public void write(PrintWriter pw) {
        pw.println(accountName);
    }

}
