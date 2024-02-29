import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchExecptionExample1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Boolean myExec = true;
		
		do {
			try {
				
				System.out.print("Birinci sayıyı girin: ");
				int a=input.nextInt();
				System.out.print("İkinci sayıyı girin: ");
				int b=input.nextInt();
				
				System.out.println("Result: "+myPow(a, b));
				
				myExec = false;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				input.nextLine();
			} 
		} while (myExec);
		System.out.println("I am run at now");
		input.close();
	}
	
	public static double myPow(int number1,int number2) {
		return Math.pow(number1, number2);
	}
}
