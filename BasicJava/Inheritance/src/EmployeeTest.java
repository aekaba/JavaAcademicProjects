
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee(375);
		
		System.out.println(e.getSalary());
		
		Programmer p = new Programmer(415, 15);
		
		System.out.println(p.getBonus()+" "+p.getSalary());
	}

}
