//omirandaperez1@toromail.csudh.edu

public class MainApplication {

	// run method to run banking app.
	public static void run() {
		int userInput;
		UIManager uiManager = new UIManager();
		Bank bank = new Bank();

		// display menu
		uiManager.showMenu();
		userInput = uiManager.readUserInput();
		
		// while loop to handle user input
		while (userInput != 8) {

			// 1 open checking account
			if (userInput == 1) {
				CheckingAccount checkingAccount;
				AccountHolder person = Account.toOpen();
				int age = person.getAgeInYears();
				// verify if person is over 16
				if (age < 16) {
					System.out.println("Sorry, you are not allowed to open a checking account if you are under 16 years old.");
					break;
				}
				// check if person is over or is 18 years of age
				if (age >= 18) {
					
					int overdraftLimit = Input.getInteger("Enter overdraft limit: $");
					checkingAccount = new CheckingAccount(person);
					checkingAccount.setAccountStatus("opened");
					checkingAccount.setOverdraftLimit(overdraftLimit);
				} else {
					// if person isn't over 18 then don't display over draft limit message
					checkingAccount = new CheckingAccount(person);
					checkingAccount.setAccountStatus("opened");
					checkingAccount.setOverdraftLimit(0);
				}
				// open account and display account number
				bank.openAccount(checkingAccount);
				checkingAccount.setAccountName("Checking");
				System.out.println("\nThank you, the account number is " + checkingAccount.getAccountNumber());
			}

			// 2 open a savings account
			else if (userInput == 2) {
				
				AccountHolder person = Account.toOpen();
				int age = person.getAgeInYears();
				// if person is younger than 16 years old they are not able to open savings account
				if (age < 5) {
					System.out.println("Sorry, you are not allowed to open a savings account if you are under 16 years old.");
					break;
				}
				// open savings account
				SavingsAccount savingAccount = new SavingsAccount(person);
				savingAccount.setAccountStatus("opened");
				bank.openAccount(savingAccount);
				savingAccount.setAccountName("Saving");
				System.out.println("\nThank you, the account number is " + savingAccount.getAccountNumber());

			}

			// 3
			else if (userInput == 3) {
				// display account list
				bank.showAccountsList();
			}

			// 4
			else if (userInput == 4) {
				int accountNumber = Input.getInteger("Enter your account number: ");
				
				Transactions transactions = new Transactions();
				
				for (Account account : bank.accountsList) {
					if (account.getAccountNumber() == accountNumber) {
						for (Transactions t : transactions.transactions) {
							System.out.println(
									t.getTransactionID() + " : " + t.getTransactionType() + " : " + t.getAmount());
						}
					}
				}
				System.out.println();
			}

			// 5
			else if (userInput == 5) {
				bank.deposit();
			}

			// 6
			else if (userInput == 6) {
				bank.withdrawFunds();
			}

			// 7
			else if (userInput == 7) {
				System.out.println();
				int accountNumber = Input.getInteger("Enter the account number to close: ");
				for (Account account : bank.accountsList) {
					if (account.getAccountNumber() == accountNumber) {
						account.setAccountStatus("Closed");
					}

				}
				System.out.println("Account closed. ");
			} else {
				System.out.println("Invalid choice. ");
			}

			uiManager.showMenu();
			userInput = uiManager.readUserInput();
		}
		

	}

	public static void main(String[] args) {
		run();
	}
}
