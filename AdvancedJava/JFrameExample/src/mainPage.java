import java.awt.FlowLayout;
import javax.swing.*;

public class mainPage extends JFrame{
	
	private JLabel welcomeLabel;
	
	public mainPage() {
		super("Main Page");
		
		setLayout(new FlowLayout());
		
		welcomeLabel = new JLabel("Welcome");
		add(welcomeLabel);
		
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
}
