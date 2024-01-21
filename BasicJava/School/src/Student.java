import java.util.Scanner;

public class Student {
	private String studentName;
	private String studentSurname;
	private int studentID;
	private String studentDep;

	public static void main(String[] args) {
		Student myStudent = new Student();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ogrenci Adi: ");
		myStudent.setStudentName(scanner.nextLine());
		
		System.out.print("Ogrenci Soyadi: ");
		myStudent.setStudentSurname(scanner.nextLine());
		
		System.out.print("Ogrenci Bolumu: ");
		myStudent.setStudentDep(scanner.nextLine());
		
		System.out.print("Ogrenci Numarası: ");
		myStudent.setStudentID(scanner.nextInt());
		
		
		scanner.close();
		
		System.out.println("------------------");
		System.out.println(myStudent.getStudentName()+" "+myStudent.getStudentSurname());
		System.out.println(myStudent.getStudentDep());
		System.out.println(myStudent.getStudentID());
		

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentDep() {
		return studentDep;
	}

	public void setStudentDep(String studentDep) {
		this.studentDep = studentDep;
	}

}
