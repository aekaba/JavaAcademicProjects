import java.io.*;
import java.util.Scanner;

public class Books {
	static Scanner input = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("Add:1, List:2, Search:3, Delete:4, Update:5");
	}
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			showMenu();
			System.out.println(">>>");
			int num= input.nextInt();
			switch (num) {
			case 1: {
				addBook();
				break;
			}
			case 2: {
				listBook();
				break;
			}
			case 3: {
				
				searchBook();
				break;
			}
			case 4: {
				deleteLine();
				break;
			}
			case 5: {
				updateLine();
				break;
			}
			case 6:{
				return;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}
		}
	}
	
	public static void addBook() throws IOException {
		
		
		String title, author, category, publicationYear, price;
		
		System.out.print("Title? ");
		title = input.next();
		System.out.print("author? ");
		author = input.next();
		System.out.print("category? ");
		category = input.next();
		System.out.print("publicationYear? ");
		publicationYear = input.next();
		System.out.print("price? ");
		price = input.next();
		
		writeFile(title, author, category, publicationYear, price);
		
		
	}
	
	public static void writeFile(String title,String author,String category,String publicationYear,String price) throws IOException {
		File f = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/Books/src/books");
		
		FileWriter fWriter = new FileWriter(f,true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.append(title+"\t"+author+"\t"+category+"\t"+publicationYear+"\t"+price+"\n");
		bWriter.close();
		
		System.out.println("Writing operation is done...");
		
	}
	
	public static void listBook() throws IOException {
		File f = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/Books/src/books");
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		boolean isExist = false;
		
		String line = bReader.readLine();
		int i =1;
		StringBuilder sBuilder = new StringBuilder();
		while(line!=null) {
			sBuilder.append(i+") "+line+"\n");
			line=bReader.readLine();
			isExist = true;
			i++;
		}
		bReader.close();
		if (isExist) {
			System.out.println(sBuilder);
			System.out.println("Reading operation is done...");	
		} else {
			System.out.println("There are no Books");
		}
	
	}
	
	public static void lookTitleBook(String searchedWord) throws IOException {
		File f = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/Books/src/books");
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		
		String line = bReader.readLine();
		
		while(line!=null) {
			//String[] paths = line.split("\t");
			//if(paths[0].equals(searchedWord)) {
			//	System.out.println(line);
			//}
			if (line.contains(searchedWord)) {
				System.out.println(line);
			}
			line=bReader.readLine();
		}
		bReader.close();
	}
	
	public static void searchBook() throws IOException {
		System.out.println("Whats your looking book? ");
		String title = input.next();
		
		lookTitleBook(title);
	}
	
	public static void updateLine() throws IOException {
		int index = whatsYourIndex();
		System.out.println("What are you updating this book?");
		System.out.println("title:1 author:2 category:3 publicationYear:4 price:5 ");
		int num = input.nextInt();
		System.out.print("What is the new value? ");
		String newValue = input.next();
		
		File f = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/Books/src/books");
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		int i = 1;
		
		String line = bReader.readLine();
		
		StringBuilder sBuilder = new StringBuilder();
		
		while(line!=null) {
			if (i!=index) {
				sBuilder.append(line+"\n");
			} else {
				String[] parts = line.split("\t");
				parts[num-1] = newValue;
				
				sBuilder.append(parts[0]+"\t"+parts[1]+"\t"+parts[2]+"\t"+parts[3]+"\t"+parts[4]+"\n");
			}
			line=bReader.readLine();
			i++;
		}
		bReader.close();

		FileWriter fWriter = new FileWriter(f,false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.write(sBuilder.toString());
		bWriter.close();
		
		System.out.println("Updating operation done....");
		listBook();
		
	}
	
	public static void deleteLine() throws IOException {
		int index = whatsYourIndex();
		File f = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/Books/src/books");
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		int i = 1;
		
		
		String line = bReader.readLine();
		
		
		StringBuilder sBuilder = new StringBuilder();
		while(line!=null) {
			if (i!=index) {
				sBuilder.append(line+"\n");
			} 
			line=bReader.readLine();
			i++;
		}
		bReader.close();
		
		FileWriter fWriter = new FileWriter(f,false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.write(sBuilder.toString());
		bWriter.close();
		
		System.out.println("Deleting operation done...");
		listBook();
	}
	
	public static int whatsYourIndex() throws IOException {
		listBook();
		System.out.println("Whats your deleting/updating book index? ");
		int index = input.nextInt();
		return index;
	}
}
