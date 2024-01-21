
public class MangoDB implements IDataBase2{
	@Override
	public void add() {
		System.out.println("MangoDB Ekleme");
		
	}

	@Override
	public void select() {
		System.out.println("MangoDB okuma");
		
	}

	@Override
	public void delete() {
		System.out.println("MangoDB silme");
		
	}

	@Override
	public void update() {
		System.out.println("MangoDB güncelleme");
		
	}
}
