
public class GradeBook {
	private String courseName;
	private int grades[];
	
	public void displayMsg() {
		System.out.println("Welcome the gradebook for "+courseName);
	}
	
	public void getAvg() {
		System.out.println("Avarage is "+getTotal()/grades.length);
	}
	
	public void showStudent() {
		for (int i = 0; i < grades.length; i++) {
			System.out.println(i+1+". Student: "+grades[i]);
		}
	}
	
	public int getTotal() {
		int total=0;
		for (int i = 0; i < grades.length; i++) {
			total+=grades[i];
		}
		return total;
	}
	
	public void getMin() {
		int minGrade = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (minGrade>grades[i]) {
				minGrade=grades[i];
			}
		}
		
		System.out.println("Min Grade is "+minGrade);
	}
	
	public void getMax() {
		int minGrade = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (minGrade<grades[i]) {
				minGrade=grades[i];
			}
		}
		
		System.out.println("Min Grade is "+minGrade);
	}
	
	public GradeBook(String courseName,int[] grades) {
		this.courseName = courseName;
		this.grades=grades;
		displayMsg();
	}
	
	public GradeBook() {
		
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int grades[]) {
		this.grades = grades;
	}
}
