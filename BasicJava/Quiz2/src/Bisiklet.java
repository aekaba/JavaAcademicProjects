
public class Bisiklet extends Araç {

	public Bisiklet(String marka, String model) {
		super(marka, model);
		setYakıtTürü();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setYakıtTürü() {
		super.yakıtTürü=null;
	}
	
}
