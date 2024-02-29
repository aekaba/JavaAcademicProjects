import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class RegisterPage extends JFrame implements ActionListener{
	private JTextField textUserName;
	private JPasswordField textPass;
	
	private JLabel labelUserName,labelPass,labelRegister;
	
	private JButton register;
	//-------------------------------------\\
	private Users user;
	
	public RegisterPage(Users user) {
		
		super("Register Page");
		this.user = user;
		
		setLayout(new GridLayout(3, 2));
		
		textUserName = new JTextField();
		textPass = new JPasswordField();
		
		labelUserName = new JLabel("User Name");
		labelPass = new JLabel("Password");
		
		labelRegister = new JLabel();
		register = new JButton("Register");
		register.addActionListener(this);
		
		add(labelUserName);
		add(textUserName);
		add(labelPass);
		add(textPass);
		add(labelRegister);
		add(register);
		
		setVisible(true);
		setSize(300,150);
		setLocationRelativeTo(null);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (user.addNewUser(new Users(textUserName.getText(),textPass.getText()))) {
			this.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "Something went wrong");
		}
		
	}

}
