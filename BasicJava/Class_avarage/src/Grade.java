
public class Grade {
	private int total;
	private int counter;
	
	public Grade() {
		setTotal(0);
		setCounter(1);
	}
	
	public double calculateGradeAvarage() {
		return total/(counter-1);
	}
	
	

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
