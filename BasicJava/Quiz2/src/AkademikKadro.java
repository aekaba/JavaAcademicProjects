
public abstract class AkademikKadro extends Person{
	protected Araç hususiAraç;
	private double asgari;
	protected double maas;
	public AkademikKadro(String name, String surname, boolean ehliyet,double asgari) {
		super(name, surname, ehliyet);
		setAsgari(asgari);
		
		// TODO Auto-generated constructor stub
	}
	
	public double getAsgari() {
		return asgari;
	}
	public void setAsgari(double asgari) {
		this.asgari = asgari>0? asgari:0;
	}
	public Araç getHususiAraç() {
		return hususiAraç;
	}
	public abstract void setHususiAraç(Araç hususiAraç);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Asgari Ücret: "+ getAsgari()+" Maaş: "+getMaas()+" "+hususiAraç.toString();
	}

	public double getMaas() {
		return maas;
	}

	public abstract void setMaas();
	
	

}
