import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lesson {
	
	public Lesson(String lessonNo,String lessonName) {
		this.setLessonNo(!lessonNo.isEmpty()?lessonNo:"");
		this.setLessonName(!lessonName.isEmpty()?lessonName:"");
	}
	
	private String lessonNo;
	private String lessonName;	
	
	public static boolean saveLesson(String lessonNo,String lessonName) {
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Lesson");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.append(lessonNo+";"+lessonName+"\n");
			bufferWriter.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static List<Lesson> listLesson(){
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Lesson");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			ArrayList<Lesson> lessonList =  new ArrayList<Lesson>();
			
			while (bufferReader.ready()) {
				String line =bufferReader.readLine();
				String[] parts = line.split(";");
				
				lessonList.add(new Lesson(parts[0], parts[1]));
			}
			
			return lessonList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
		}
		return null;
	}
	
	public static Lesson anyLesson(String lessonNo) {
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Lesson");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);

			while (bufferReader.ready()) {
				String line =bufferReader.readLine();
				String[] parts = line.split(";");
				if (parts[0].equals(lessonNo))
					return new Lesson(parts[0],parts[1]);
			}
		} catch (IOException e) {
		}
		return null;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getLessonNo() {
		return lessonNo;
	}

	public void setLessonNo(String lessonNo) {
		this.lessonNo = lessonNo;
	}
}
