import java.util.Random;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rnd=new Random();
//		createArray();
//		System.out.print("Dizinin Sınırı ne olsun? ");
//		userArrayFill(scanner.nextInt(),scanner,rnd);
//		generateDoubleMatrisB(rnd);
		
		copyArray(createArray());
		System.out.println("----------------------");
		copyArrayMuch(createArray());
	}
	
	public static int[] createArray() {
		int[] array =new int[3];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = addNum();
		}
		showArray(array);
		return array;
	}
	
	public static int addNum() {
		Random rnd=new Random();
		
		return rnd.nextInt(10);
	}
	
	public static void userArrayFill(int arrayLenght,Scanner scanner,Random rnd) {
		int[] array = new int[arrayLenght];
		int userOrMachine =rnd.nextInt(2);
		
		for (int i = 0; i < array.length; i++) {
			if (userOrMachine==1) {
				System.out.print(i+1+". Sayı: ");
				array[i]=scanner.nextInt();
			} else {
				array[i]=rnd.nextInt(20);
			}
		}
		
		showArray(array);
	}
	
	public static void copyArray(int[] myArray) {
		int[] newArray=new int[myArray.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = myArray[i];
		}
		System.out.println("New Array");
		showArray(newArray);
	}
	
	public static void copyArrayMuch(int[] myArray) {
		int[] newArray=new int[myArray.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = myArray[i]*2+3;
		}
		System.out.println("New Array");
		showArray(newArray);
	}
	
	public static void showArray(int[] myArray) {
		System.out.println("------------------");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(i+1+". Sayı:  ");
			System.out.println(myArray[i]);
		}
	}
	
	public static void generateDoubleMatrisB(Random rnd) {
		for (int a = 0; a < 2; a++) {
			for (int i = 1; i <= 5; i++) {
				for (int j = 0; j < 5; j++) {
					int num= rnd.nextInt(6);
					if (num == 5) {
						System.out.print("B ");
					}
					else {
						System.out.print(num+" ");	
					}
						
				}
				System.out.println();			
			}
			System.out.println();
		}
	}
}
