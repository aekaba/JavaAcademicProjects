import java.util.ArrayList;
import java.util.Random;

public class Example1 {

	public static void main(String[] args) {
//		ArrayList<String> color = new ArrayList<String>();
//		color.add("red");
//		color.add("yellow");
//		color.add("white");
//		for (String item : color) {
//			System.out.println(item);
//		}
		
		String[] color2={"green","yellow","red","black"};
		
		ArrayList<String> arrayList = randomAddArrayList(color2);
		
		showArrayList(arrayList);
		
		//System.out.println(isEqual(arrayList, "black"));
		System.out.println(isEqual(arrayList, "green"));
		
	}
	
	static void showArrayList(ArrayList<String> arrayList) {
		for(int i = 0; i<arrayList.size();i++)
			System.out.print(arrayList.get(i)+"\t");
	}
	
	static ArrayList<String> randomAddArrayList(String[] array) {
		Random rnd = new Random();
		ArrayList<String> arrayList = new ArrayList<>();
		for(int i = 0;i<array.length;i++)
			arrayList.add(array[rnd.nextInt(4)]);
		return arrayList;
	}
	
	static boolean  isEqual(ArrayList<String> arrayList,String value) {
		for (String item : arrayList) {
			if (item.equals(value))
				return true;
		}
		return false;
	}
	
	static boolean  isContains(ArrayList<String> arrayList,String value) {
		
			if (arrayList.contains(value))
				return true;
		
		return false;
	}

}
