/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class SavingsAccount extends BankAccount {
// Data Fields
	private int accountNumber = 00001;
	private double interestRate = .01;
	private double value = 0;
	
// Constructors
	/**	
	 * The SavingsAcoount default constructor method
	 * Purpose: Creates a SavingsAccount object that inherits the super data fields
	 * @param void
	 * @return void
	 */
	public SavingsAccount() {
		super();
	}
	
	/**	
	 * The SavingsAcoount constructor method
	 * Purpose: Creates a SavingsAccount object with parameters
	 * @param int
	 * @param double
	 * @param double
	 * @return void
	 */
	public SavingsAccount(int accountNumber, double interestRate, double value) {
		this.accountNumber = accountNumber;
		this.interestRate = interestRate;
		this.value = value;
	}
	
	/**	
	 * The SavingsAcoount constructor method
	 * Purpose: Creates a SavingsAccount object that with specified data fields
	 * @param String
	 * @param int
	 * @param double
	 * @param int
	 * @param double 
	 * @param double
	 * @return void
	 */
	public SavingsAccount(String bankName, int routingNumber, double totalValue, int accountNumber, double interestRate, double value) {
		super();
		this.accountNumber = accountNumber;
		this.interestRate = interestRate;
		this.value = value;
	}
// Methods
	/**	
	 * The getAccountNumber method
	 * Purpose: gets the accountNumber
	 * @param void
	 * @return accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**	
	 * The getInterestRate method
	 * Purpose: gets the interestRate
	 * @param void
	 * @return interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**	
	 * The getValue method
	 * Purpose: gets the value
	 * @param void
	 * @return value
	 */
	public double getValue() {
		return value;
	}
	
	/**	
	 * The setAccountNumber method
	 * Purpose: sets the accountNumber
	 * @param int
	 * @return void
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**	
	 * The setInterestRate method
	 * Purpose: sets the interestRate
	 * @param double
	 * @return void
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	/**	
	 * The setValue method
	 * Purpose: sets the value
	 * @param double
	 * @return void
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**	
	 * The calculateInterest method
	 * Purpose: calculates the interest of the account
	 * @param void
	 * @return double
	 */
	public double calculateInterest() {
		return value + value * interestRate;
	}
	
	/**	
	 * The toString method
	 * Purpose: displays the account information correctly
	 * @param void
	 * @return void
	 */
	public String toString() {
		return "";
	}

}
