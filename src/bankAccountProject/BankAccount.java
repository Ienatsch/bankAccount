/** File Prologue
 * Name: Jacob Maughan & Dolan Lenatsch
 * Assignment: Final Project
 * Date: 03/15/19 - 4/10/19
 * CIT260
 */
package bankAccountProject;

public class BankAccount {
// Data Fields
	private String bankName = "";
	private int accountNumber = 000001;
	private double totalValue = 0;
	private String fileLocation = "";
	
// Constructors
	/**	
	 * The default BankAccount constructor method
	 * Purpose: create a default BankAccount object
	 * @param void
	 * @return void
	 */
	public BankAccount() {
	}
	
	/**	
	 * The BankAccount constructor method
	 * Purpose: create a BankAccount object that takes parameters
	 * @param String
	 * @param int
	 * @param double
	 * @return void
	 */
	public BankAccount(String bankName, int accountNumber, double totalValue) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.totalValue = totalValue;
	}
	
// Methods
	/**	
	 * The getBankName method
	 * Purpose: returns the bankName to the user
	 * @param void
	 * @return String
	 */
	public String getBankName() {
		return bankName;
	}
	
	/**	
	 * The getAccountNumber method
	 * Purpose: returns the accountNumber to the user
	 * @param void
	 * @return int
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**	
	 * The getAccountNumber method
	 * Purpose: returns the totalValue to the user
	 * @param void
	 * @return double
	 */
	public double getTotalValue() {
		return totalValue;
	}
	
	/**	
	 * The getFileLocation method
	 * Purpose: returns the fileLocation to the user
	 * @param void
	 * @return String
	 */
	public String getFileLocation() {
		return fileLocation;
	}
	
	/**	
	 * The setBankName method
	 * Purpose: sets the bankName
	 * @param String
	 * @return void
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	 * The setTotalValue method
	 * Purpose: sets the totalValue
	 * @param double
	 * @return void
	 */
	public void setTotalValue(double value) {
		this.totalValue = value;
	}
	
	/**	
	 * The setFileLocation method
	 * Purpose: sets the fileLocation
	 * @param String
	 * @return void
	 */
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	/**	
	 * The transferMoney method
	 * Purpose: transfers money from one account to another
	 * @param BankAccount - from account
	 * @param BankAccount - to account
	 * @return void
	 */
	public void transferMoney() {
		
	}
	/**	
	 * The deposit method
	 * Purpose: adds money to totalValue
	 * @param BankAccount - where the money is going
	 * @param double - how much is going in the account
	 * @return void
	 */
	public void deposit() {
		
	}
	
	/**	
	 * The withdraw method
	 * Purpose: subtracts money from an account
	 * @param BankAccount - where the money is coming from
	 * @param double - how much is being withdrawn
	 * @return void
	 */
	public void withdraw() {
		
	}
	
	/**	
	 * The writeToFile method
	 * Purpose: writes the account information to a file
	 * @param void
	 * @return void
	 */
	public void writeToFile() {
		
	}
	/**	
	 * The writeToFile method
	 * Purpose: writes the account information to a specified file
	 * @param void
	 * @return void
	 */
	public void writeToFile(String fileLocation) {
		
	}
	
	/**	
	 * The readFromFile method
	 * Purpose: reads the account information from a file
	 * @param void
	 * @return void
	 */
	public void readFromFile() {
		
	}
	
	/**	
	 * The readFromFile method
	 * Purpose: reads the account information from a specified file
	 * @param void
	 * @return void
	 */
	public void readFromFile(String fileLocation) {
		
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
