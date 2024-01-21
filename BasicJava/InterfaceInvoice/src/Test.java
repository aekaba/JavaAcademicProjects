
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPayable[] payObj = new  IPayable[4];
		payObj[0] = new Invoice("13423516", "This part is amazing", 3, 150);
		payObj[1] = new Invoice("3246742", "This part is trash", 3, 50);
		payObj[2] = new SalariedEmployee("Ata Emir", "Kaba", "45134514321342", 3500);
		payObj[3] = new SalariedEmployee("bla bla", "bla", "123461234", 5500);
		
		for (IPayable iPayable : payObj) {
			System.out.println(iPayable.toString());
			System.out.println(iPayable.getPaymentAmount());
		}
		
	}

}
