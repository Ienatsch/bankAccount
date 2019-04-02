/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 * Code Created by Dalan
 */
package bankAccountProject;

public class SavingsAccount extends BankAccount {
// Data Fields
	
	private double interestRate = .02;
	private double interestEarned = 0;

// Constructors
	/**
	 * The SavingsAcoount default constructor method Purpose: Creates a
	 * SavingsAccount object that inherits the super data fields
	 * 
	 * @param void
	 * @return void
	 */
	public SavingsAccount() {
		super();
	}

	/**
	 * The SavingsAcoount constructor method Purpose: Creates a SavingsAccount
	 * object with parameters
	 * 
	 * @param int
	 * @param double
	 * @return void
	 */
	public SavingsAccount(int accountNumber, double value) {
		super();
		setAccountNumber(accountNumber);
		setValue(value);
	}
	
	/**
	 * The CheckingAcoount constructor method Purpose: Creates a CheckingAccount
	 * object with all parameters
	 * @param String
	 * @param int
	 * @param double
	 * @param double
	 * @param int
	 * @return void
	 */
	public SavingsAccount(String accountName, int routingNumber, double value, double sum, int accountNumber, double interestRate, double interestEarned) {
		super();
		this.interestRate = interestRate;
		this.interestEarned = interestEarned;
	}

// Methods
	

	/**
	 * The getInterestRate method Purpose: gets the interestRate
	 * 
	 * @param void
	 * @return interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * The setInterestRate method Purpose: sets the interestRate
	 * 
	 * @param double
	 * @return void
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * The calculateInterest method Purpose: calculates the interest of the account
	 * 
	 * @param void
	 * @return double
	 */
	public double calculateInterest(int numMonths) {
		return getValue() * interestRate * numMonths;
	}

	/**
	 * The calcValue method Purpose: calculates the total value of this account
	 * 
	 * @param void
	 * @return double
	 */
	public double calcValue() {
		return getValue() + interestEarned;
	}

}
