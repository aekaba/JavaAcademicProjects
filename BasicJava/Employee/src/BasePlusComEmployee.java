
public class BasePlusComEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusComEmployee(String name, String lastName, String sSN, double grossSale, double commissionRate,double baseSalary) {
		super(name, lastName, sSN, grossSale, commissionRate);
		setBaseSalary(baseSalary);
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary>0?baseSalary:0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+getBaseSalary();
	}

}
