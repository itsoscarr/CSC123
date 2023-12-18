//omirandaperez1@toromail.csudh.edu
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Transactions {
	
	int transactionID = 0;
    String transactionType;
    double amount;
    boolean accountFound = false;
    
    Map<AccountHolder , List<Transactions>> customerTransactions = new HashMap<>();
    List<Transactions> transactions = new ArrayList<>();
    
    
    public boolean isAccountFound() {
        return accountFound;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

}

