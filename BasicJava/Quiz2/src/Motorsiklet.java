import java.util.Random;

public class Motorsiklet extends Araç{

	public Motorsiklet(String marka, String model) {
		super(marka, model);
		setYakıtTürü();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setYakıtTürü() {
		String[] yakıtlar = {"Benzin","Elektrik"};
		Random rnd = new Random();
		super.yakıtTürü=yakıtlar[rnd.nextInt(2)];
		// TODO Auto-generated method stub
		
	}

}
