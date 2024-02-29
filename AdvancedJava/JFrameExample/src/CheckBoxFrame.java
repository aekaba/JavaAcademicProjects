import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxFrame extends JFrame implements ItemListener {
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;

	private JTextField textField1;

	private Font f;

	public CheckBoxFrame() {

		setLayout(new FlowLayout());

		checkbox1 = new JCheckBox("Bold");
		checkbox2 = new JCheckBox("Italic");

		textField1 = new JTextField(12);

		add(checkbox1);
		add(checkbox2);
		add(textField1);

		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);

		setTitle("Checkbox Text");
		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new CheckBoxFrame();
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (checkbox1.isSelected()) {
			f = new Font("Roboto Medium", Font.BOLD, 12);
		} else if (checkbox2.isSelected()) {
			f = new Font("Poppins", Font.ITALIC, 12);
		} else if (checkbox1.isSelected() && checkbox2.isSelected()) {
			f = new Font("Poppins", Font.BOLD | Font.ITALIC, 12);
		} else {
			f = new Font("Roboto Medium", Font.PLAIN, 12);
		}

		textField1.setFont(f);
	}
}
