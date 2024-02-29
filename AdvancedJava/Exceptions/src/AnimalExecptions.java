import java.util.Random;

public class AnimalExecptions {

	public static void main(String[] args) {
		String[] unluHarf = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] unsuzHarf = { "b", "c", "ç", "d", "f", "g", "ğ", "h", "j", "k", "l", "m", "n", "p", "r", "s", "ş", "t",
				"v", "y", "z" };
		String[][] Hayvanlar = { { "Köpek", "" }, { "Kedi", "" }, { "Kurbağa", "" } };
		boolean myExec = true;
			
		for (int i = 0; i < Hayvanlar.length; i++) {
			int uzunluk = createRandomNum(3, 10);
			for (int j = 0; j < uzunluk; j++) {
				myExec = true;
				do {
					try {
						if (j % 2 == 0) {
							Hayvanlar[i][1] += unluHarf[createRandomNum(0,10)];
						} else {
							Hayvanlar[i][1] += unsuzHarf[createRandomNum(0,22)];
						}
						myExec = false;
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println(e.getLocalizedMessage());
					}
				} while (myExec);
				
			}
		}

		showAnimalList(Hayvanlar);

	}
	
	public static int createRandomNum(int startNum,int finishNum) {
		Random rnd = new Random();
		return rnd.nextInt(startNum,finishNum);
	}

	public static void showAnimalList(String[][] animalList) {
		for (int i = 0; i < animalList.length; i++) {
			System.out.println(animalList[i][0] + " " + animalList[i][1]);
		}
	}

}
