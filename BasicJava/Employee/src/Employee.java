
public abstract class Employee {
	private String name,lastName,SSN;
	
	public Employee(String name, String lastName, String sSN) {
		super();
		this.name = name;
		this.lastName = lastName;
		SSN = sSN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%s%s", name,lastName,SSN);
	}
	
	public abstract double earning();
}
