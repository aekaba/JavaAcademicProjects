import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScreenKeyboard extends JFrame implements ActionListener {
	private JButton[] buttons;
	private JButton spaceButton;
	private JTextField mainTextField;
	private String[]text = {"q","w","e","r","t","y","u","ı","backspace","o","p","ğ","ü","a","s","d","f","g","shift","h","j","k","l","ş","i","z","x","c","v","b","n","m","ö","ç"};
	private JPanel mainPanel,buttonPanel;
	private Font f = new Font("Verdana", Font.BOLD, 64);
	private boolean shiftButton = false;
	
	public ScreenKeyboard() {
		super("Screen Keyboard");
		//Yukarıya bir text field daha eklenicek, Başka bir panel daha eklenicek. Ekran klavyesi gibi olucak 
		//birazdaha geliştirebiliriz 
		
		mainTextField = new JTextField();
		mainTextField.setFont(f);
		mainTextField.setEnabled(false);
		mainTextField.setHorizontalAlignment(JTextField.CENTER);
		
		spaceButton = new JButton("space");
		spaceButton.addActionListener(this);
		
		mainPanel=new JPanel();
		buttonPanel = new JPanel();
		
		mainPanel.setLayout(new GridLayout(3,1));
		buttonPanel.setLayout(new GridLayout(4,9));
	
		add(mainPanel);
		mainPanel.add(mainTextField);
		
		buttons = new JButton[text.length];
		
		for(int i =0; i<buttons.length;i++) {
			buttons[i] = new JButton(text[i]);
			buttonPanel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		mainPanel.add(buttonPanel);
		mainPanel.add(spaceButton);
		
		
		setVisible(true);
		setSize(800,500);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new ScreenKeyboard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="backspace") {
			String myText = mainTextField.getText();
			
			if (myText.length()>0) {
				mainTextField.setText(myText.substring(0,myText.length()-1));
			} 
		} else if(e.getActionCommand()=="shift"){
			shiftButton=true;
		} else if(e.getActionCommand()=="space") {
			mainTextField.setText(mainTextField.getText()+" ");
		}
		else {
			if (shiftButton) {
				mainTextField.setText(mainTextField.getText()+e.getActionCommand().toUpperCase());
				shiftButton=false;
			} else {
				mainTextField.setText(mainTextField.getText()+e.getActionCommand());
			}
		}
		
	}
}
