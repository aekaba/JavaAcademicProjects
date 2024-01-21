import java.util.Scanner;

public class HearthRateText {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Last Name: ");
		String lastName = scanner.nextLine();
		
		System.out.print("Date of birth: ");
		int date = scanner.nextInt();
		
		scanner.close();
		
		HeartRates person = new HeartRates(firstName, lastName, date);
		
		person.displayDetail();
	}
}
