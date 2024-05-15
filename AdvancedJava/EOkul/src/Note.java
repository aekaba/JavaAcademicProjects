import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Note {
	private String studentNo,LessonNo;
	private int note;
	
	public Note(String lessonNo,String studentNo,int note) {
		setLessonNo(lessonNo);
		setNote(note);
		setStudentNo(studentNo);
	}
	
	public static boolean saveNote(Note data) {
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Note");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.append(data.LessonNo+";"+data.studentNo+";"+data.note+"\n");
			bufferWriter.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static List<Note> listNote(String studentNo){
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Note");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			ArrayList<Note> noteList =  new ArrayList<Note>();
			
			while (bufferReader.ready()) {
				String line =bufferReader.readLine();
				String[] parts = line.split(";");
				
				noteList.add(new Note(parts[0], parts[1],Integer.parseInt(parts[2])));
			}
			
			return noteList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return null;
		}
		
	}
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getLessonNo() {
		return LessonNo;
	}
	public void setLessonNo(String lessonNo) {
		LessonNo = lessonNo;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = (note <= 100 && note >= 0)?note:0;
	}
}
