import java.util.ArrayList;

public class Users {
	private String userName;
	private String userPass;
	
	private ArrayList<Users> myUser = new ArrayList<Users>();
	
	public Users(String userName, String userPass) {
		setUserName(userName);
		setUserPass(userPass);
	}
	
	public Users() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName.trim();
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass.trim();
	}
	
	public ArrayList<Users> getAllUsers() {
		return myUser;
	}

	public boolean addNewUser(Users newUser) {
		try {
			myUser.add(newUser);
			return true;
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
	}
	
	public boolean LogIn(String name,String pass) {
		
		for (Users users : myUser) {
			
			if (users.userName.equals(name)&&users.userPass.equals(pass)) {
				return true;
			}
		}
		return false;
	}



	
	
	

	
}
