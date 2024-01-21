
public class AnimalTest {
	public static void main(String[] args) {
		Animal animalObj= new Animal("Unknown");
		System.out.println(animalObj.getName());
		animalObj.eat();
		
		Goat goatObj=new Goat("Keçi");
		goatObj.eat();
		
//		BabyGoat bGoatObj=new BabyGoat("Bebek Keçi");
//		
//		bGoatObj.eat();
		
		Lamb lambObj=new Lamb("Tarkan");
		lambObj.eat();
	}
}
