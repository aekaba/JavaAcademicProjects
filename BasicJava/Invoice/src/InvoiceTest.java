import java.util.Scanner;

public class InvoiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Invoice class creating without scanner//
		Invoice myInvoice = new Invoice("AEK202101","This is new item from Java",2,250);
		//myInvoice.invoiceDetail();
		
		// Invoice class creating with scanner//
		
		System.out.println("\n-------------------");
		System.out.print("Part Number: ");
		String partNumber = scanner.next();
		
		System.out.print("Part Detail: ");
		String partDetail = scanner.nextLine();
		partDetail = scanner.nextLine();
		
		System.out.print("Part Count: ");
		
		int partCount = scanner.nextInt();
		
		System.out.print("Part Price: ");
		double partPrice = scanner.nextDouble();
		
		Invoice myInvoice2 = new Invoice(partNumber, partDetail, partCount, partPrice);
		
		System.out.println("\n-------------------");
		
		myInvoice2.invoiceDetail();
	}
}
