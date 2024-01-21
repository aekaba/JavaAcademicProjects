
public abstract class Person {
	private String name;
	private String surname;
	private boolean ehliyet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean isEhliyet() {
		return ehliyet;
	}
	public void setEhliyet(boolean ehliyet) {
		this.ehliyet = ehliyet;
	}
	public Person(String name, String surname, boolean ehliyet) {
		this.name = name;
		this.surname = surname;
		this.ehliyet = ehliyet;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+" "+getSurname()+" "+isEhliyet();
	}
	
}
