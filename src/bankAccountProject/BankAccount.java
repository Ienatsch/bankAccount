/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 * Code Created by Jake
 */
package bankAccountProject;

import java.util.*;

public class BankAccount {
// Data Fields
	private String accountName = "My Bank Account"; // The account name
	private int routingNumber = 123456; // The bank routing number
	private double value = 0; // The default value of the account
	private static double sum = 0;
	private int accountNumber = 00000;
	
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

// Methods
	/**
	 * The getBankName method Purpose: returns the bankName to the user
	 * 
	 * @param void
	 * @return String
	 */
	public String getBankName() {
		return accountName;
	}

	/**
	 * The getRoutingNumber method Purpose: returns the routingNumber to the user
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
	public void setBankName(String accountName) {
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

}
