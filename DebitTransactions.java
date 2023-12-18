//omirandaperez1@toromail.csudh.edu

public class DebitTransactions extends Transactions{
	public void depositAmount(int accountNumber){
		
		 Bank bank = new Bank();
		 
	        for (Account account : bank.accountsList) {
	            if (account.getAccountNumber() == accountNumber) {
	                accountFound = true;
	                if (account.getAccountStatus().equalsIgnoreCase("opened")) {
	                    account.setBalance(account.getBalance() + getAmount());
	                    System.out.println("Deposit Successful, the new balance is: $" + account.getBalance());
	                } else {
	                    if (account.getBalance() == 0) {
	                        System.out.println("Deposit failed, the balance is: $0.0");
	                    } else {
	                        account.setBalance(account.getBalance() + getAmount());
	                        System.out.println("Deposit Successful, the new balance is: $" + account.getBalance());
	                    }
	                }
	                break; 
	            }
	        }
	        
	    }
}
