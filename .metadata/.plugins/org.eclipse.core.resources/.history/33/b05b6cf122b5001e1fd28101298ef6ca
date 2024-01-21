import java.util.Random;

public class GraduatedStudent extends Student {
	private int bonus;
	private Thesis thesis;
	public int getBonus() {
		return bonus;
	}
	public void setBonus() {
		Random rnd = new Random();
		this.bonus = rnd.nextInt(9);
	}
	public Thesis getThesis() {
		return thesis;
	}
	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}
	public GraduatedStudent(String firstName, String lastName, String birtPlace, double gpa, String department,
			String university,  Thesis thesis) {
		super(firstName, lastName, birtPlace, gpa, department, university);
		
		setThesis(thesis);
		setBonus();
	}
	
}
