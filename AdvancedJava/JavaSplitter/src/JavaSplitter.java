import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class JavaSplitter {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/JavaSplitter/src/data");
		//dosyamızı açalım
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//Verileri Arrayliste atayacaz o yüzden burada tanımladık.
		ArrayList<String> data = new ArrayList<String>();
		//Verilerimizi satır satır okuyalım.
		while(bufferedReader.ready()) {
			String line = bufferedReader.readLine();
			data.add(line); //Arraylistimize atıyoruz.
		}
		Collections.sort(data); //Array listlerin kendi özelliği olan sıralama fonksyinonu kullanıyoruz.
		for (String item : data) {
			System.out.println(item); // ve burda satır satır yazdırıyour
		}
	}
}
