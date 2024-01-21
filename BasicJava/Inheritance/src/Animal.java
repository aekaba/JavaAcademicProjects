
public class Animal {
	private String Name;
	
	public Animal(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void eat() {
		System.out.println("Yarabbi bin şükür");
	}
}
