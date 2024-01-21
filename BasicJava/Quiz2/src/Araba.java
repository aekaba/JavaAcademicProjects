import java.util.Random;

public class Araba extends Araç {

	public Araba(String marka, String model) {
		super(marka, model);
		setYakıtTürü();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setYakıtTürü() {
		String[] yakıtlar = {"Benzin","Elektrik","Benzin - LPG","Dizel"};
		Random rnd = new Random();
		super.yakıtTürü=yakıtlar[rnd.nextInt(yakıtlar.length)];
	}
	
}
