
public class Scooter extends Araç{

	public Scooter(String marka, String model) {
		super(marka, model);
		setYakıtTürü();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setYakıtTürü() {
		super.yakıtTürü="Elektrik";
		
	}
	
	


	
}
