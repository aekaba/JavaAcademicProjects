
public class Test {
	public static void main(String[] args) {
		SalariedEmployee salObj = new SalariedEmployee("Ata", "Kaba", "4123412", 750);
		HourlyEmployee HourObj = new HourlyEmployee("Ceren", "Bağcı", "1523454325", 55, 200);
		CommissionEmployee compObj = new CommissionEmployee("Beyza", "Gülep", "151614432", 3500, 0.25);
		BasePlusComEmployee baseObj= new BasePlusComEmployee("Arif", "Köken", "2345665", 2500, 0.15, 1500);
		
		Employee[] emp = {salObj,HourObj,compObj,baseObj};
		
		for (Employee employee : emp) {
			System.out.println(employee.earning());
		}
				
	}
}
