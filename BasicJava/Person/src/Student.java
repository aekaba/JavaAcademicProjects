
public class Student extends Person {
	private double gpa;
	private String state;
	private String department;
	private String university;
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa>=0&&gpa<4?gpa:0;
	}
	public Student(String firstName, String lastName, String birtPlace, double gpa, String department,
			String university) {
		super(firstName, lastName, birtPlace);
		setGpa(gpa);
		setDepartment(department);
		setUniversity(university);
		setState();
	}
	public String getState() {
		return state;
	}
	private void setState() {
		this.state = gpa>2?"Success":"Repeating";
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" University: "+getUniversity()+" Department: "+getDepartment()+" Gpa:"+ getGpa()+" State: "+ getState();
	}
}
