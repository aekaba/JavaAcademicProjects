import java.util.Random;
import java.util.Scanner;

public class MyMath {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------  Welcome to myMath  ------- \n\n");
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("Hypotenuse: 1, Multiples: 2, Is Even: 3, Square of Asterisks: 4, Square of Any Character: 5, Circle Area: 6, Create a random number: 7, Heads Or Tails: 8 ,TheMathGame: 9 ,Close: 0");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Input two Side");
				System.out.printf("Hypotenuse: %.2\n"+hypotenuse(scanner.nextDouble(), scanner.nextDouble()));
				break;
			case 2:
				System.out.println("Input two number: ");
				System.out.println("Multiples status: "+ multiples(scanner.nextInt(), scanner.nextInt()));
				break;
			case 3:
				System.out.println("Input a number");
				System.out.println("İs Even: "+ isEven(scanner.nextInt()));
				break;
			case 4:
				System.out.println("Input a side");
				squareOfAsterisks(scanner.nextInt());
				break;
			case 5:
				System.out.println("Input a side and a character");
				squareOfAnyCharacter(scanner.nextInt(), scanner.next().charAt(0));
				break;
			case 6:
				System.out.println("Input a radius ");
				System.out.printf("area of circle is %.3f ",circleArea(scanner.nextDouble()));
				break;
			case 7:
				System.out.println("Random number is "+ createARandomNumber());
				break;
			case 8:
				System.out.println("Kaç kere atılsın? ");
				headsOrTails(scanner.nextInt());
				break;
			case 9:
				theMathGame();
				break;
			case 0:
				System.out.println("Exiting the system");
				System.exit(0);
			default:
				System.out.println("Wrong input");
				break;
			}
		}
		
		
	}
	
	public static double hypotenuse(double side1,double side2) {
		return Math.sqrt( Math.pow(side1, 2)+Math.pow(side2, 2));
	}
	
	public static Boolean multiples(int side1, int side2) {
		return (side1 % side2) == 0 ?  true :  false;
	}
	
	public static Boolean isEven(int num1) {
		return (num1 % 2) == 0 ? true : false;
	}
	
	public static void squareOfAsterisks(int side1) {
		for (int i = 0; i < side1; i++) {
			for (int j = 0; j < side1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void squareOfAnyCharacter(int side1,char character) {
		for (int i = 0; i < side1; i++) {
			for (int j = 0; j < side1; j++) {
				System.out.print(character);
			}
			System.out.println();
		}
	}
	
	public static double circleArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static int createARandomNumber() {
		Random rnd = new Random();
		return rnd.nextInt(10);
	}
	
	public static void headsOrTails(int count) {
		Random rnd = new Random();
		int heads = 0;
		int tails = 0;
		 
		for (int i = 0; i < count; i++) {
			if (rnd.nextInt(2) == 0) {
				System.out.println("Yazı");
				heads++;
			} else {
				System.out.println("Tura");
				tails++;
			}
		}
		System.out.println("Yazı gelme oranı= %"+ (heads*100)/count +"\n Tura gelme oranı= %"+(tails*100)/count);
		
	}
	
	public static void theMathGame() {
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in); 
		int count = rnd.nextInt(10);
		int num1=0, num2=0, trueAnswer=0, answer;
		Boolean itsTrue = true;
		
		while (count >= 0) {
			if (itsTrue) {
				num1=rnd.nextInt(10);
				num2=rnd.nextInt(10);
			}
			
			
			System.out.print("How Much is "+num1+" times "+num2+" ? ");
			answer = scanner.nextInt();
			System.out.println();
			
			if(answer==(num1*num2)) {
				trueAnswer++;
				count--;
				itsTrue = true;
				System.out.println("Very Good");
			} else {
				itsTrue = false;
				
				System.out.println("Please Try Again...");
			}
		}
		System.out.println(trueAnswer+" question answered correctly.");
	}
}
