import java.util.Iterator;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Whats your first name? ");
//		String firstName=input.nextLine();
//		System.out.println(validateZip(firstName));
		
		System.out.print("Whats your phone number? ");
		String phone=input.nextLine();
		System.out.println(validatePhone(phone));
	}
	
	public static boolean validatePhone(String phone) {
		
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
	
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
	}
	//  System.out.println(validateFirstName(firstName));
	public static boolean validateFirstName(String firstname) {
		return firstname.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
		//"[a-zA-Z]+(['-][a-zA-Z]+)*"
		// "[A-Z][a-zA-Z]*"
	}
	
	public static void tokenSplitter() {
		Scanner input = new Scanner(System.in);
		System.out.print("please, Enter a sentence: ");
		
		String myWord=input.nextLine();
		
		String[] parts = myWord.split(" ");
		
		System.out.println("Lenght:" +parts.length);
		for (String myParts : parts) {
			System.out.println(myParts);
		}
	}

	public static void asciiCharConvert() {
		char[] charArray = { 'A', 'B', 'C', 'a', 'b' };

		for (char c : charArray) {
			System.out.println(c + ":" + (int) c);
		}

		int[] intArray = { 67, 97, 66, 65 };

		for (int i : intArray) {
			System.out.println(i + ":" + (char) i);
		}
	}

	// System.out.println(checkChar("Check exam", "Cam"));
	public static boolean checkChar(String word1, String word2) {
		boolean isChecked = false;
		for (int i = 0; i < word2.toCharArray().length; i++) {
			for (int j = 0; j < word1.toCharArray().length; j++) {
				if (word1.toLowerCase().charAt(j) == word2.toLowerCase().charAt(i)) {
					isChecked = true;
					break;
				} else {
					isChecked = false;
				}
			}

			if (!isChecked) {
				return false;
			}
		}
		return true;
	}

	public static void useBuilderCapacity() {
		StringBuilder sBuilder = new StringBuilder("Hello, there");
		// sBuilder.append("Greating");

		System.out.printf("Buffer:%s\nCapacity:%d\nLenght:%d\n", sBuilder.toString(), sBuilder.capacity(),
				sBuilder.length());

		char[] charArray = new char[sBuilder.length()];
		sBuilder.getChars(0, 3, charArray, 5);

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}
	}

	public static void useDifferentStringBuilderConst() {
		StringBuilder sBuiler1 = new StringBuilder();
		StringBuilder sBuiler2 = new StringBuilder(14);
		StringBuilder sBuiler3 = new StringBuilder("Hello");

		System.out.printf("Buffer:%s\n", sBuiler1.toString());
		System.out.printf("Buffer:%s\n", sBuiler2.toString());
		System.out.printf("Buffer:%s\n", sBuiler3.toString());
	}

	public static void donusum() {
		boolean booleanValue = true;
		char charValue = 'R';
		int intValue = 14;
		double doubleValue = 313.13;

		System.out.println(String.valueOf(doubleValue));
	}

	public static void blablabla() {
		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = " spaces";

		System.out.println(s1.replace("l", "L"));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());

		char[] myChar = myChar = s1.toCharArray();
		for (char c : myChar) {
			System.out.println(c);
		}

		boolean boolVal = true;
		int intVal = 14;
		double doubleVal = 3.14;
		String stringVal = "Java";
		StringBuilder sBuilder = new StringBuilder("Math");
		StringBuilder sbuBuilder = new StringBuilder();

		Object[] myObjects = { boolVal, intVal, doubleVal, stringVal };

		for (Object object : myObjects) {
			sbuBuilder.append(object);
			System.out.println(sbuBuilder.toString());
		}
	}

	public static void useContact() {
		String s1 = "Happy";
		String s2 = " Birthday";
		System.out.println(s1.concat(s2));
	}

	public static void useSubstring() {
		String myString = "abcdefgabc";
		System.out.println(myString.substring(3));
		// 5 dahil olmuyo bak
		System.out.println(myString.substring(3, 5));
	}

	public static void useIndexOfandLastIndexOf() {
		String myString = "abcdefgabc";
		System.out.println(myString.indexOf("a"));
		System.out.println(myString.lastIndexOf("a"));
	}

	public static void bla() {
		String name1 = "Bob";
		String name2 = "bob";
		String name3 = "David";

		if (name2.compareTo(name3) == 0) {
			System.out.println("The names are equals");
		} else if (name2.compareTo(name3) > 0) {
			System.out.println(name2 + " is greater than " + name3);

		} else {
			System.out.println(name2 + "is less than " + name3);
		}

		String str1 = "ı love programming...";
		String str2 = "Do you love programming...";
		String str3 = "DO YOU LOVE PROGRAMMİNG...";

		System.out.println(str1.regionMatches(0, str2, 0, 4));
		System.out.println(str1.regionMatches(2, str2, 7, 4));
		System.out.println(str1.regionMatches(true, 2, str3, 7, 4));
	}

	public static void blabla() {
		String s1 = "hello There";
		char[] charArray = new char[5];

		System.out.printf("s1:%s", s1);
		System.out.printf("Lenght of s1:%d", s1.length());

		System.out.println("\nMy string is as follow");

		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i) + " ");
		}

		System.out.println("\nMy reversed string is as follow");

		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i) + " ");
		}

		s1.getChars(0, 3, charArray, 0);
		System.out.println("\n" + charArray);

	}

	public static void useDifferentStringCons() {
		char[] charArray = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
		String s = new String("hello");

		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 3);

		System.out.printf("s1:%s\ns2:%s\ns3:%s\ns4:%s\n", s1, s2, s3, s4);

		Object[] myObject = { s1, s2, s3, s4 };

		for (int i = 0; i < myObject.length; i++) {
			System.out.println(myObject[i]);
		}
	}

	public static void useStartWithEndWith() {
		String[] myString = { "started ", "starting ", "ended ", "ending " };

		for (String myValue : myString) {
			System.out.print(myValue + "");

		}
		System.out.println();

		for (String myValue2 : myString) {
			if (myValue2.startsWith("st"))
				System.out.print(myValue2 + "");
		}

		for (String myValue3 : myString) {
			if (myValue3.endsWith("ed"))
				System.out.print(myValue3 + " ");
		}
	}

}
