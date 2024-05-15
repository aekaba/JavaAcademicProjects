import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame implements MouseMotionListener{
	private JPanel pnl;
	private JLabel lbl;
	private Color[] myColor = {Color.green,Color.red,Color.black,Color.white,Color.blue};
	
	public MouseTrackerFrame() {
		pnl = new JPanel();
		lbl = new JLabel("Deneme");
		
		pnl.setBackground(Color.green);
		pnl.addMouseMotionListener(this);
		
		add(pnl,BorderLayout.CENTER);
		add(lbl, BorderLayout.NORTH);
		
		setTitle("Testing with mouseTracker");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new  MouseTrackerFrame();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragged...");
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Random rnd = new Random();
		pnl.setBackground(myColor[rnd.nextInt(myColor.length)]);
		System.out.println("Moved...");
	}

}
