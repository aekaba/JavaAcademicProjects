
public class Programmer extends Employee {
	int bonus;
	public Programmer(float slary, int bonus) {
		super(slary);
		this.bonus = bonus;
		
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
}
