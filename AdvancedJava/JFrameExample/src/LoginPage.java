import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener{
	
	private JTextField textUserName;
	private JPasswordField textPass;
	
	private JLabel labelUserName,labelPass;
	
	private JButton button,register;
	
	private Users user=new Users();
	
	private enum Actions{
		LogIn,
		Register
	}
	
	public LoginPage() {
		super("Login Page");
		
		setLayout(new GridLayout(3, 2));
		
		textUserName = new JTextField();
		textPass = new JPasswordField();
		
		labelUserName = new JLabel("User Name");
		labelPass = new JLabel("Password");
		
		
		register = new JButton("Register");
		register.setActionCommand(Actions.Register.name());
		register.addActionListener(this);
		
		button = new JButton("Login");
		button.setActionCommand(Actions.LogIn.name());
		button.addActionListener(this);
		
		
		
		add(labelUserName);
		add(textUserName);
		add(labelPass);
		add(textPass);
		add(register);
		add(button);
		
		setVisible(true);
		setSize(300,150);
		setLocationRelativeTo(null);
	}
	
	
	
	public static void main(String[] args) {
		new LoginPage();
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand() == Actions.LogIn.name()) {
			String userName = textUserName.getText();
			String pass = textPass.getText();
			
			
			if (user.LogIn(userName,pass)) {
				this.setVisible(false);
				new mainPage();
			} else {
				JOptionPane.showMessageDialog(null, "Wrong User Name or Password");
			}
			
		} else if (event.getActionCommand() == Actions.Register.name()){
			
			new RegisterPage(user);
			
		}
		
		
		
	}

}
