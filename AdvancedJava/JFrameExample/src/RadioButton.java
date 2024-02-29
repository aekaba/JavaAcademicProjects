import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButton extends JFrame implements ItemListener {
	private JRadioButton rbtn1, rbtn2;
	private JTextField txtfield1;
	private ButtonGroup radioButtonGroup;
	
	public RadioButton() {
		super("Radio Button");
		
		setLayout(new FlowLayout());
		
		rbtn1 = new JRadioButton("Female");
		rbtn2 = new JRadioButton("Male");
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(rbtn1);
		radioButtonGroup.add(rbtn2);
		
		
		txtfield1 = new JTextField(12);
		add(rbtn1);
		add(rbtn2);
		add(txtfield1);
		
		rbtn1.addItemListener(this);
		rbtn2.addItemListener(this);
		
		setSize(300,150);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new RadioButton();
	}

	

	public void itemStateChanged(ItemEvent e) {
		if (rbtn1.isSelected()) {
			txtfield1.setText(rbtn1.getText());
		} else {
			txtfield1.setText(rbtn2.getText());
		}
		
	}
}
