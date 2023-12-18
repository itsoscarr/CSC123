//omirandaperez1@toromail.csudh.edu
import java.util.Scanner;

public class UIManager {
	public Scanner sc = new Scanner(System.in);
    public int userInput;

    //method for displaying menu options
    public void showMenu(){
    	System.out.println("\tOscar Miranda's Bank");
    	System.out.println("\t--------------------------");
        System.out.println("\t1 - Open a Checkings account.");
        System.out.println("\t2 - Open a Savings account");
        System.out.println("\t3 - List Accounts");
        System.out.println("\t4 - Account Statement");
        System.out.println("\t5 - Deposit funds");
        System.out.println("\t6 - Withdraw funds");
        System.out.println("\t7 - Close an account");
        System.out.println("\t8 - Exit");

    }
    public int readUserInput(){
        userInput = Input.getInteger("\tPlease enter your choice: ", 1, 8);
        return userInput;
    }
}
