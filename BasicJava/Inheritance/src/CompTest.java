import java.util.Set;

public class CompTest {

	public static void main(String[] args) {
		CommissionEmployee compObj = new CommissionEmployee("Ata", "Emir", "123412", 25, 5);
		System.out.println(compObj);
		compObj.setCommissionRate(0.3);
		System.out.println(compObj);
		System.out.println(compObj.earning());
	}

}
