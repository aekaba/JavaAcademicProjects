import java.awt.FlowLayout;
import javax.swing.*;


public class Example1 extends JFrame{
	
	private JLabel label1;
	private JLabel label2;
	
	public Example1() {
		super("JFrame Ex");
		setLayout(new FlowLayout());
		
		Icon img=new ImageIcon(getClass().getResource("myimage.jpeg"));
		
		JLabel label1 = new JLabel("Label1");
		JLabel label2 = new JLabel("Label2"); 
		
		label1.setIcon(img);
		label1.setHorizontalTextPosition(SwingConstants.LEFT);
		add(label1);
		add(label2);
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Example1();
	}
}
