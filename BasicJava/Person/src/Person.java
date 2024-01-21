
public class Person {
	protected String firstName, lastName, birtPlace;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirtPlace() {
		return birtPlace;
	}

	public void setBirtPlace(String birtPlace) {
		this.birtPlace = birtPlace;
	}

	public Person(String firstName, String lastName, String birtPlace) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtPlace = birtPlace;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "First Name: "+getFirstName()+" Last Name: "+getLastName()+" Birth Place: "+ getBirtPlace();
	}
}
