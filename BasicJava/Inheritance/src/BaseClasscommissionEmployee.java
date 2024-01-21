
public class BaseClasscommissionEmployee extends CommissionEmployee{
	private double salary;
	public BaseClasscommissionEmployee(String name, String lastName, String SSN, double commissionRate, double salary,
			double GroseSaleamaount) {
		
		super(name, lastName, SSN, commissionRate, GroseSaleamaount);
		this.salary=salary;
	}
	
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return super.earning()+salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
