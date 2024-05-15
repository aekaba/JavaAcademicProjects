import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame implements ListSelectionListener{
	private JList<String> listBox1;
	private String[] colors = {"Red","Green","Blue","Black","Cyan"};
	
	public ListFrame() {
		super("List Frame Example");
		setLayout(new FlowLayout());
		
		listBox1 = new JList<String>(colors);
		listBox1.setVisibleRowCount(3);
		listBox1.addListSelectionListener(this);
		add(listBox1);
		add(new JScrollPane(listBox1));
		
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new ListFrame();
	}

	public void valueChanged(ListSelectionEvent e) {

		if (listBox1.getSelectedValue() == "Red") {
			getContentPane().setBackground(Color.RED);
			setBackground(Color.RED);
		}else if (listBox1.getSelectedValue() == "Green") {
			getContentPane().setBackground(Color.GREEN);
			setBackground(Color.GREEN);
		}else if (listBox1.getSelectedValue() == "Blue") {
			getContentPane().setBackground(Color.BLUE);
			setBackground(Color.BLUE);
		}else if (listBox1.getSelectedValue() == "Black") {
			getContentPane().setBackground(Color.BLACK);
			setBackground(Color.BLACK);
		}else if (listBox1.getSelectedValue() == "Cyan") {
			getContentPane().setBackground(Color.CYAN);
			setBackground(Color.CYAN);
		} 
		
		
	}

	

}
