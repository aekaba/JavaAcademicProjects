
import java.util.Scanner;

public class ArithmeticExecptionsExample1 {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean myExec = true;
		
		do {
			try {
				System.out.print("Please, enter an integer numerator: ");
				int a=input.nextInt();
				System.out.print("Please, enter an integer numerator: ");
				int b=input.nextInt();
				
				System.out.println("Result: "+quantient(a, b));
				myExec=false;
			} catch (Exception e) {
				// Tümünde direk Exception kullanma hata Input hatası ise  
				// input execptionu kullan. değilse bunu buna dikkat et
				// ArithmeticExecption da sayısal hataları yakalar
				System.out.println(e.toString());
			}
		} while(myExec);
		
		System.out.println("I am in row 17");
	}
	 
	 public static int quantient(int numerator,int denominator) {
		 return numerator/denominator;
	 }
}
