
public class Akademisyen extends AkademikKadro {
	
	public Akademisyen(String name, String surname, boolean ehliyet, double asgari, Araç hususiAraç) {
		super(name, surname, ehliyet, asgari);
		setMaas();
		setHususiAraç( hususiAraç);
		// TODO Auto-generaed constructor stub
	}
	@Override
	public void setMaas() {
	  super.maas = getAsgari()*1.5;
		
	}
	@Override
	public void setHususiAraç(Araç hususiAraç) {
		if (hususiAraç instanceof Scooter) {
			super.hususiAraç=hususiAraç;
			System.out.println("Doğru Araçla Eşleştirildiniz.");
		} else {
			super.hususiAraç=hususiAraç;
			System.out.println(hususiAraç.getClass().getName()+" Aracını kullanamazsınız");
		}
		
	}
	
	
	
}
