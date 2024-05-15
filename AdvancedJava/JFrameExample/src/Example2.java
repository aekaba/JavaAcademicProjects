import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example2 extends JFrame implements ActionListener{
	
	private JTextField textField1;
	
	private JPasswordField passField;
	private JButton button;
	
	public Example2() {
		setLayout(new GridLayout(2,2));
		
		textField1 = new JTextField(12);
		passField = new JPasswordField(12);
		button = new JButton("Login");
		
		add(textField1);
		add(passField);
		add(button);
		
		button.addActionListener(this);
		
		setTitle("Testing with JTextfield");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Example2();
	}

	public void actionPerformed(ActionEvent e) {
		String myPass=String.valueOf(passField.getPassword());
		if ((textField1.getText()=="ata")&&(myPass=="0061")) {
			JOptionPane.showMessageDialog(null, "Welcome Sir");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong User Name or Password ");
		}
		
		
	}
}
