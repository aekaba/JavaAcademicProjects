
public class HourlyEmployee extends Employee{
	public HourlyEmployee(String name, String lastName, String sSN,double wage,double hours) {
		super(name, lastName, sSN);
		setHours(hours);
		setWage(wage);
		// TODO Auto-generated constructor stub
	}

	private double wage,hours;

	@Override
	public double earning() {
		return hours>=40?wage*hours:40*wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\n"+getWage()+"\n"+getHours();
	}

}
