import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Araç[] araçlar= {new Araba("BMW","320"),new Motorsiklet("Honda", "R125"),new Bisiklet("DMX", "bike")};
		Random rnd = new Random();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Asgeri ücreti Belirle: ");
		double asgariUcret = scanner.nextDouble();
		
		AkademikKadro[] calisanlar = {new Akademisyen("Ata Emir", "Kaba", true, asgariUcret, araçlar[rnd.nextInt(araçlar.length)]),new DRAkademisyen("Ata Emir", "Kaba", true, asgariUcret, araçlar[rnd.nextInt(araçlar.length)])};
		
		for (AkademikKadro akademikKadro : calisanlar) {
			System.out.println(akademikKadro.toString());
		}
	}

}
