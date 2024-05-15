

public class ErrayIndexOutOfExecptionExample1 {

	public static void main(String[] args) {
		int[] myArray = {5,7,8,9,14};
		
		//for (int value : myArray) {
		//	System.out.println(value);
		//}
		
		
		try {
			System.out.println(myArray[7]);	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("İleri Java Programlama...");
		}
		System.out.println("I am in 18 row");
	}

}
