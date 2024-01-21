import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Size? ");
//		
//		int size = scanner.nextInt();
//		
//		int[] myArray = new int[size];
		
//		int[] myArray2 = {5,12,13,21,65,32};
//		
//		displayArray(myArray2, scanner);
//		
//		System.out.println("Array total is "+ sumArray(myArray2));
		
		arrayQA(); 
	}
	
	public static void displayArray(int[] array,Scanner scanner) {

		System.out.println("Index\tValue");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+"\t"+ array[i]);
		}
	}
	
	public static int sumArray(int[] array) {
		int total=0;
		for (int value:array) {
			total+=value;
		}
		
		return total;
	}
	
	public static void arrayQA() {
		int[] array= {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Grade distribution:");
		
		for (int i = 0; i < array.length; i++) {
			if (i==10) {
				System.out.printf("%5d: ",100);
			} else {
				System.out.printf("%02d-%02d: ",i*10,i*10+9);
			}
			
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static int[] muchArray(int[] array) {
		int[] returnArray=new int[array.length];
		for (int i=0;i<array.length;i++) {
			returnArray[i]= array[i]*2;
		}
		
		return returnArray;
	}
}
