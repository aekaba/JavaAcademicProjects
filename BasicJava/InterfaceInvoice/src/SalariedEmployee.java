
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	public SalariedEmployee(String name, String lastName, String sSN, double weeklySalary) {
		super(name, lastName, sSN);
		setWeeklySalary(weeklySalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary>0?weeklySalary:0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nWeekly Salary: "+getWeeklySalary();
	}

}
