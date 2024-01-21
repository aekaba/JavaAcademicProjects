
public class Account {
	private String userName;
	private double balance;
	
	public Account(String userName) {
		this.userName = userName;
		this.balance = 0;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayWelcome() {
		System.out.println("Welcome "+userName);
	}
	
	public void displayUserDetail() {
		System.out.println("Name: "+ userName+"\nBalance "+ balance+"\n\n");
	}
	
	public void withdrawMoney(double money) {
		this.balance = this.balance-money;
		System.out.println("$"+money+" withdraw in this account");
		displayUserDetail();
	}
	
	public void depositMoney(double money) {
		this.balance = this.balance+money;
		System.out.println("$"+money+" deposit in this account");
		displayUserDetail();
	}
}
