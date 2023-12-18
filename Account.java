//omirandaperez1@toromail.csudh.edu

import java.util.Random;
import java.util.HashSet;
import java.util.Set;


public class Account {

	private String accountStatus; // open or closed
	private String accountName; // account name
	private int accountNumber = 0; // account number
	AccountHolder person;
	private double balance;
	
	// new hash set to handle account numbers
	private static Set<Integer> usedAccountNumbers = new HashSet<>();

	// handle deposits
	public void deposit() {
		
		int accountNumber = Input.getInteger("Enter account number: ");
		double amount = Input.getDouble("Enter the amount to deposit: $");
		
		DebitTransactions debitTransaction = new DebitTransactions();
		
		debitTransaction.setAmount(amount);
		debitTransaction.depositAmount(accountNumber);
		
		
		if (!debitTransaction.isAccountFound()) {
			debitTransaction.transactions.add(debitTransaction);

			debitTransaction.customerTransactions.put(getPerson(), debitTransaction.transactions);
			
			debitTransaction.setTransactionID(debitTransaction.transactionID++);
			
			debitTransaction.setTransactionType("Debit");
			
		} else {
			
			System.out.println("Account not found. ");
		}
		
		debitTransaction.setAmount(0);
	}

	// handle withdrawals
	public void withDraw() {
		
		int accountNumber = Input.getInteger("Enter account number: ");
		
		double amount = Input.getDouble("Enter the withdrawal amount: $");
		
		CreditTransactions creditTransaction = new CreditTransactions();
		creditTransaction.setAmount(amount);
		creditTransaction.withdrawAmount(accountNumber);
		
		if (!creditTransaction.isAccountFound()) {
			creditTransaction.transactions.add(creditTransaction);

			creditTransaction.customerTransactions.put(getPerson(), creditTransaction.transactions);
			creditTransaction.setTransactionID(creditTransaction.transactionID++);
			creditTransaction.setTransactionType("Credit");
		} else {
			System.out.println("Account not found. ");
		}
		creditTransaction.setAmount(0);
	}

	// account holder
	public AccountHolder getPerson() {
		return person;
	}


	public static AccountHolder toOpen() {

		String name = Input.getString("Enter First Name: ");
		String lastName = Input.getString("Enter Last Name: ");
		int ssn = Input.getInteger("Enter Social Security Number (xxx xx xxxx): ");
		String strDOB = Input.getString("Enter Date Of Birth (yyyy-MM-dd): ");
		String address = Input.getString("Enter your address: ");

		return new AccountHolder(name, lastName, strDOB, ssn, address);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	// getters and setters

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public void setAccountNumber() {
		// Use Random class to generate a unique random account number
        Random random = new Random();

        // Generate a unique random account number
        int newAccountNumber;
        do {
            newAccountNumber = random.nextInt(1000000); // Adjust the range as needed
        } while (usedAccountNumbers.contains(newAccountNumber));

        // Set the generated account number
        this.accountNumber = newAccountNumber;

        // Add the new account number to the set of used account numbers
        usedAccountNumbers.add(newAccountNumber);
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}
}
