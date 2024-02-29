import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.*;


public class ButtonFrame extends JFrame implements ActionListener {
	private JButton button1;
	private JButton button2;
	
	public ButtonFrame() {
		super("Button Practices");
		Random rnd = new Random();
		
		setLayout(new FlowLayout());
		
		final Icon[] myIcons = {
				new ImageIcon(getClass().getResource("pencil.circle@2x.png")),
				new ImageIcon(getClass().getResource("lasso@2x.png")),
				new ImageIcon(getClass().getResource("trash.fill@2x.png")),
		};
		
		
		
		button1 =new JButton("My Pencil");
		button2 =new JButton("Hy Message");
		
		button1.setIcon(myIcons[rnd.nextInt(myIcons.length)]);
		button2.setIcon(myIcons[rnd.nextInt(myIcons.length)]);
		
		button1.setRolloverIcon(myIcons[1]);
		button2.setRolloverIcon(myIcons[2] );
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		button1.setToolTipText("Please, keep around clearly");
		
		add(button1);
		add(button2);
		
		setSize(300,150);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new ButtonFrame();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		} else  {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
		
		
		
	}
}
