//omirandaperez1@toromail.csudh.edu
public class CreditTransactions extends Transactions {
	
	public void withdrawAmount(int accountNumber){
        Bank bank = new Bank();
        for (Account account : bank.accountsList){
            if (account.getAccountNumber() == accountNumber){
                accountFound = true;
                if (account.getAccountStatus().equalsIgnoreCase("opened")){
                    if(account.getAccountName().equalsIgnoreCase("checking")){
                        double balance = account.getBalance() + CheckingAccount.getOrderLimit();
                        account.setBalance(account.getBalance() - getAmount());
                        if (account.getBalance() < balance){
                            System.out.println("Withdrawal failed, the balance is: "+ account.getBalance());
                        }
                        else{
                            System.out.println("Withdrawal Successful, the new balance is: " + account.getBalance());
                        }
                    }

                }
                else{
                    if (account.getBalance() <= 0){
                        System.out.println("Withdrawal failed , the balance is: 0.0");
                    }
                    else{
                        account.setBalance(account.getBalance() - getAmount());
                        System.out.println("Deposit Successful, the new balance is: " + account.getBalance());
                    }
                }
            }
            break;
        }
    }
}

