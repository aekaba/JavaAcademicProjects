
public class DRAkademisyen extends AkademikKadro {

	public DRAkademisyen(String name, String surname, boolean ehliyet, double asgari, Araç hususiAraç) {
		super(name, surname, ehliyet, asgari);
		setMaas();
		setHususiAraç( hususiAraç);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setMaas() {
		super.maas = getAsgari()*2;
		
	}
	@Override
	public void setHususiAraç(Araç hususiAraç) {
		super.hususiAraç=hususiAraç;
		if (hususiAraç instanceof Araba) {
			
			System.out.println("Doğru Araçla Eşleştirildiniz.");
		} else {
			
			System.out.println(hususiAraç.getClass().getName()+" Aracını kullanamazsınız");
		}
		
	}

}
