import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class BorderLayoutFrmae extends JFrame implements ActionListener{
	private JButton[] buttons;
	private String[] myLayout = {BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.CENTER,BorderLayout.EAST,BorderLayout.WEST};
	private Icon[] icon = {
			new ImageIcon(getClass().getResource("clipboard.png")),
			new ImageIcon(getClass().getResource("eraser.png")),
			new ImageIcon(getClass().getResource("graduationcap.fill.png")),
			new ImageIcon(getClass().getResource("location.north.fill.png")),
			new ImageIcon(getClass().getResource("location.north.fill.png")),
	};
	private Random rnd = new Random();
	
	public  BorderLayoutFrmae() {
		super("Testing with border layout");
		
		buttons = new JButton[5];
		
		for (int i = 0;i<buttons.length;i++) {
			buttons[i] = new JButton(myLayout[i].toString());
			buttons[i].setIcon(icon[rnd.nextInt(icon.length)]);
			buttons[i].addActionListener(this);
			add(buttons[i], myLayout[i]);
		}
		
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new BorderLayoutFrmae();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (JButton myButton : buttons) {
			int myNum = rnd.nextInt(1,10);
			int myFact = calcFact(myNum);
			myButton.setText(myNum+" != "+myFact);
		}
		//e.getSource() == buttons[2]
	}
	
	public int calcFact(int num) {
		int fact=1;
		for(int i=num;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
}
