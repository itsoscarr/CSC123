import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AccountHolder {
	private final String firstName;
    private final String lastName;
    private final String dateOfBirth;
    private final int SSN;
    private final String address;

    AccountHolder(String firstName , String lastName , String dateOfBirth , int SSN , String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
        this.address = address;
    }
    //getters


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAgeInYears() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate DOB = LocalDate.parse(dateOfBirth , formatter);
        Period age = Period.between(DOB , date);
        return age.getYears();
    }

    public int getSSN() {
        return SSN;
    }

    public String getAddress() {
        return address;
    }
}
