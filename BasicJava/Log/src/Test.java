import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		IDataBase2 oracleDB =new Oracle();
		IDataBase2 mySqlDB =new MySql();
		IDataBase2 mangoDB =new MangoDB();
		
		DataBaseManager mngObj = new DataBaseManager();
		mngObj.add(mangoDB);
		mngObj.delete(oracleDB);
		mngObj.update(mySqlDB);
		mngObj.select(oracleDB);
		
		
	}
}
