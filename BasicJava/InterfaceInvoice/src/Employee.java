
public abstract class Employee implements IPayable{
	public Employee(String name, String lastName, String sSN) {
		super();
		this.name = name;
		this.lastName = lastName;
		SSN = sSN;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	private String name,lastName,SSN;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "First Name: "+getName()+"\nLast Name: "+getLastName()+"\nSSN: "+getSSN();
	}
	
}
