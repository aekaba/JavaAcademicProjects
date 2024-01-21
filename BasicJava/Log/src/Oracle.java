
public class Oracle implements IDataBase2 {

	@Override
	public void add() {
		System.out.println("Oracle Ekleme");
		
	}

	@Override
	public void select() {
		System.out.println("Oracle okuma");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle silme");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle güncelleme");
		
	}

}
