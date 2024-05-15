import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MatematicalOperations extends JFrame implements ActionListener{
	private JTextField[] textFields;
	private JButton submitButton;
	private JPanel mainPanel,textFieldsPanel;
	
	public MatematicalOperations() {
		super("Matematical Operations");
		
		mainPanel=new JPanel();
		textFieldsPanel=new JPanel();
		mainPanel.setLayout(new GridLayout(2,1));
		textFieldsPanel.setLayout(new GridLayout(1,5));
		
		submitButton = new JButton("Calculate");
		submitButton.addActionListener(this);
		
		add(mainPanel);
		mainPanel.add(textFieldsPanel);

		textFields = new JTextField[5];
		for (int i=0;i<5;i++) {
			textFields[i] = new JTextField(5);
			textFields[i].setHorizontalAlignment(JTextField.CENTER);
			
			 textFieldsPanel.add(textFields[i]);
		}
		textFields[4].setEnabled(false);
		mainPanel.add(submitButton);
		
		textFieldsPanel.setBackground(Color.pink);
		mainPanel.setBackground(Color.pink);
		setBackground(Color.pink);
		setSize(300,150);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MatematicalOperations();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int number1 = Integer.parseInt(textFields[0].getText());
			int number2 = Integer.parseInt(textFields[2].getText());
			int result = 0;
			
			switch (textFields[1].getText() ) {
			case "+": 
				result = number1+number2;
				break;
			case "-": 
				result = number1-number2;
				break;
			case "*": 
				result = number1*number2;
				break;
			case "/": 
				result = number1/number2;
				break;
			case "%": 
				result = number1%number2;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + textFields[1].getText());
			}
			
			if (textFields[3].getText().equals("=")) {
				textFields[4].setText(""+result);
			} else {
				throw new IllegalArgumentException("Unexpected value: " + textFields[3].getText());
			}
		} catch (IllegalArgumentException excep) {
			JOptionPane.showMessageDialog(null, "Hatalı Giriş // "+excep.getMessage());
		}
	}
}
