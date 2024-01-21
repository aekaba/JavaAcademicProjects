import java.time.Year;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int dateYear;
	
	public HeartRates(String firstName,String lastName ,int dateYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateYear = dateYear;
	}
	
	public int personAges() {
		return Year.now().getValue()-dateYear;
	}
	
	public int maxHearthRate() {
		return 220 - personAges();
	}
	
	public String targetHearthRate() {
		double max = maxHearthRate()*0.85;
		double min = maxHearthRate()*0.5;
		
		return "Your target hearth rate is should be "+ min + " between "+ max;
	}
	
	public void displayDetail() {
		System.out.println("<---------------------->");
		System.out.println("First Name: "
				+ firstName + "\nLast Name: "
						+ lastName + "\nDate of birth: "
								+ dateYear + "\nAge: "
										+ personAges()+"\nPerson Max Hearth Rate: "
												+ maxHearthRate() + "\nTarget: "+targetHearthRate());
	}
	
		// GET & SET METODS //
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getDateYear() {
		return dateYear;
	}
	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}
}
