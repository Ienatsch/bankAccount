/** File Prologue
 * Name: Jacob Maughan & Dalan Ienatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class CheckingAccount extends BankAccount {
// Data Fields
	private int accountNumber = 00001; // The account number

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
	 * The CheckingAcoount constructor method Purpose: Creates a CheckingAccount
	 * object with parameters
	 * 
	 * @param int
	 * @param double
	 * @return void
	 */
	public CheckingAccount(int accountNumber, double value) {
		this.accountNumber = accountNumber;
		this.value = value;
	}

// Methods
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
	 * The getValue method Purpose: gets the value
	 * 
	 * @param void
	 * @return value
	 */
	public double getValue() {
		return value;
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
	 * The setValue method Purpose: sets the value
	 * 
	 * @param double
	 * @return void
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * The calcValue method Purpose: calculates the total value of this account
	 * 
	 * @param void
	 * @return value
	 */
	public double calcValue() {
		return this.value;
	}

}
