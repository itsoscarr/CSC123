//omirandaperez1@toromail.csudh.edu

import java.util.ArrayList;
import java.util.List;

public class Bank {
	List<Account> accountsList = new ArrayList<>();

    public void openAccount(Account account){
    	account.setAccountNumber();
        accountsList.add(account);
    }

    public void withdrawFunds() {
        Account account = new Account();
        account.withDraw();
    }
    public void deposit(){
        Account account = new Account();
        account.deposit();
    }
    public void showAccountsList(){
    	 if (accountsList.isEmpty()) {
             System.out.println("No accounts found.");
             return;
         }
    	 
        for (Account account: accountsList){
        	System.out.printf("%d (%s) : %s : %s : %s : %.2f : %s%n",
                    account.getAccountNumber(),
                    account.getAccountName(),
                    account.getPerson().getFirstName(),
                    account.getPerson().getLastName(),
                    account.getPerson().getSSN(),
                    account.getBalance(),
                    account.getAccountStatus());
        			}
    	}
    
    

    }

