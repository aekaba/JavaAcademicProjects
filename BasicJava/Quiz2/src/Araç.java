
public abstract class Araç {
	private String marka ;
	private String model;
	protected String yakıtTürü;
	
	public Araç(String marka, String model) {
		
		this.marka = marka;
		this.model = model;
		
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYakıtTürü() {
		return yakıtTürü;
	}
	public abstract void setYakıtTürü();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getMarka()+" "+getModel()+" "+getYakıtTürü();
	}
}
