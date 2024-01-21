
public class MySql implements IDataBase2{
	@Override
	public void add() {
		System.out.println("MySql Ekleme");
		
	}

	@Override
	public void select() {
		System.out.println("MySql okuma");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql silme");
		
	}

	@Override
	public void update() {
		System.out.println("MySql güncelleme");
		
	}
}
