//omirandaperez1@toromail.csudh.edu

public class CheckingAccount extends Account {
	 public static int overdraftLimit;

	 CheckingAccount(AccountHolder person) {

	        this.person = person;
	    }

	    public static int getOrderLimit() {
	        return overdraftLimit;
	    }

	    public void setOverdraftLimit(int orderLimit) {
	        CheckingAccount.overdraftLimit = orderLimit;
	    }

}
