import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
	public Student(String studentNo,String studentName) {
		this.studentNo = !studentNo.isEmpty()?studentNo:"";
		this.studentName = !studentName.isEmpty()?studentName:"";
	}
	
	private String studentNo;
	private String studentName;	
	
	public static boolean saveStudent(String studentNo,String studentName) {
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Student");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.append(studentNo+";"+studentName+"\n");
			bufferWriter.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static List<Student> listStudent(){
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Student");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			ArrayList<Student> studentList =  new ArrayList<Student>();
			
			while (bufferReader.ready()) {
				String line =bufferReader.readLine();
				String[] parts = line.split(";");
				studentList.add(new Student(parts[0], parts[1]));
				
			}
			
			return studentList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
		}
		return null;
	}
	
	public static Student anyStudent(String studentNo) {
		File file = new File("/Users/ataemir/projects/Java Projects/AdvancedJava/EOkul/src/Student");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			ArrayList<Student> studentList =  new ArrayList<Student>();
			
			while (bufferReader.ready()) {
				String line =bufferReader.readLine();
				String[] parts = line.split(";");
				if (parts[0].equals(studentNo))
					return new Student(parts[0],parts[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return null;
	}
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	
	
}
