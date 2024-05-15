import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExercise {
	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/ataemir/projects/Java Projects/AdvancedJava/FileExercise/src/myFile";
		
		File file = new File(filePath);
		
		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("The File alreayd exist");
		}
		
		FileWriter fileWriter = new FileWriter(file,true);
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		
		bufferWriter.append("Network Programming \n Hello World \n from america");
		
		bufferWriter.close();
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		
		
		while (bufferReader.ready()) {
			String line =bufferReader.readLine();
			System.out.println(line);
			
		}
		
		bufferReader.close();
		
	}
}
