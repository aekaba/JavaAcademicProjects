
public class GradeBookTest {
	public static void main(String[] args) {
		// Creating new class with Constructor
		int[] grade = {5,12,13,30,45,32,32,60,70,88,3};
		GradeBook gradeBookObj = new GradeBook("Java",grade);
		
		gradeBookObj.getMin();
		
		gradeBookObj.getMax();
		
		gradeBookObj.getAvg();
		
		gradeBookObj.showStudent();
		
	}
}
