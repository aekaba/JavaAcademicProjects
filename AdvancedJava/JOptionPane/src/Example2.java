import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Example2 extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	
	public Example2() {
		super("Testing with JLabel");
		
		setLayout(new FlowLayout());
		label1=new JLabel("Label1");
		label2=new JLabel("Label2");
		
		add(label1);
		add(label2);
		
		setVisible(true);
		setSize(300,300);
		setShape(getShape());
		setLocationRelativeTo(null);
	}
}
